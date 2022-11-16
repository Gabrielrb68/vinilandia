package controle;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioControl {
	
	private ArrayList<Usuario> tabelaUsuario;
	
	public UsuarioControl() { this.tabelaUsuario = new ArrayList<>();}
	
	public boolean insert(Usuario u) {

		return false;
	}
	
	public boolean alterar(Usuario u) {
		
		return false;
	}
	
	public boolean deletar(Usuario u, int idUsuario) {
		return false;
	}
	
	public ArrayList<Usuario> listaUsuarios() {
		
		return null;
	}
	
}