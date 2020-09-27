package test.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.Usuario;
import main.java.UsuarioNegocio;
import main.java.UsuarioRepositorio;

public class UsuarioNegocioTest {

	private UsuarioRepositorio userRepo = new UsuarioRepositorio();
	
	@Test
	public void adicionarUsuarioTest() {
		Usuario u = new Usuario("Teste",10,"11111111111");
		
		UsuarioNegocio un = new UsuarioNegocio(userRepo);
		boolean ret = un.adicionarUsuario(u);
		assertTrue(ret);
	}
	
	@Test
	public void adicionarUsuarioExistenteTest() {
		Usuario u = new Usuario("Teste",10,"11111111111");
		
		UsuarioNegocio un = new UsuarioNegocio(userRepo);
		un.adicionarUsuario(u);
		
		boolean ret = un.adicionarUsuario(u);
		assertFalse(ret);
	}
	
}
