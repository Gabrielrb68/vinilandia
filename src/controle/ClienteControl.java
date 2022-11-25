package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Cliente;
import visao.TelaRegistro;

public class ClienteControl {

	private ArrayList<Cliente> tabelaCliente;

	public ClienteControl() {
		this.tabelaCliente = new ArrayList<>();
	}

	public boolean insert(Cliente c) {
		if (c != null) {
			tabelaCliente.add(c);
			return true;
		}
		return false;
	}

	public boolean alterar(Cliente c, long cpf) {
		for (Cliente usuario : tabelaCliente) {
			if (usuario.getCpf() == cpf) {
				usuario.setNome(c.getNome());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Cliente c, int idCliente) {
		for (Cliente usuario : tabelaCliente) {
			if (usuario.getCpf() == idCliente) {
				tabelaCliente.remove(usuario);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Cliente> listaUsuarios() {
		return this.tabelaCliente;
	}

	public Cliente efetuarLogin(String email, String senha) {

//		if() {

//		}

		return null;
	}

	public Cliente efetuarRegistro(Cliente c, TelaRegistro email, TelaRegistro nome, TelaRegistro senha) {
		for (int i = 0; i < tabelaCliente.size(); i++) {
			if(nome.equals(c.getNome())) {
				JOptionPane.showMessageDialog(null, "Usuário já existente");
			}else{
				c.setEmail(String email);
			}
		}
		return null;
	}

}