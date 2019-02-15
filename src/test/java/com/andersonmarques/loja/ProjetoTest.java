package com.andersonmarques.loja;

import static org.junit.Assert.assertTrue;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProjetoTest {

	private HttpServer servidor;

	@Before
	public void subirServidorProjeto() {
		servidor = ServidorMain.subirServidor("8081");
	}

	@After
	public void desligarServidorProjeto() {
		if (servidor.isStarted())
			servidor.shutdown();
	}

	@Test
	public void recuperaProjetoComSucesso() {
		Client cliente = ClientBuilder.newClient();
		WebTarget alvoRaiz = cliente.target("http://localhost:8081");
		String resultado = alvoRaiz.path("/projeto/1").request().get(String.class);
		assertTrue(resultado.contains("Minha loja"));
	}
}
