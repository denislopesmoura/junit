package main.java;

import java.util.List;

public class UsuarioNegocio {

	private UsuarioRepositorio userRepo;
	
	public UsuarioNegocio(UsuarioRepositorio usRepo) {
		this.userRepo = usRepo;
	}
	
	public boolean adicionarUsuario(Usuario u){
		boolean adicionado = false;
		if (u.getNome() != null && u.getIdade() >= 0 && 
				u.getCpf() != null &&
				this.userRepo.buscarPorCPF(u.getCpf()) == null) {
			adicionado = this.userRepo.addUsuario(u);
		}
		return adicionado;
	}
	
	public List<Usuario> relatorioUsuariosDados() {
		return this.userRepo.buscarTodos();
	}
	
	public boolean deletarUsuario(String cpf){
		return false;	
	}
	
	public boolean atualizarUsuario(Usuario u){
		return false;	
	}
	
	public List<Usuario> relatorioUsuariosPorNomeParcial(String nomeParcial) {
		return null;
	}
}
