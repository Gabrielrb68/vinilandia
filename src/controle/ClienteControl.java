package controle;

import java.util.ArrayList;

import modelo.Cliente;

public class ClienteControl {

	/**
	 * ArrayList simula um banco de dados
	 */
	private static ArrayList<Cliente> tabelaCliente;
	private static ClienteControl instancia;

	/**
	 * Padrao singleton viabiliza manipular um unico objeto na memoria
	 * 
	 * 
	 * Apenas este metodo deve ser utilizado
	 * @return
	 */
	public static ClienteControl getInstancia() {

		if (instancia == null) {
			instancia = new ClienteControl();
			tabelaCliente = new ArrayList<>();
		}

		return instancia;
	}

	/**
	 * Construtor da classe privado
	 * impedindo que seja instanciada
	 */
	private ClienteControl() {

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

//	public Cliente efetuarRegistro(Cliente c, TelaRegistro email, TelaRegistro nome, TelaRegistro senha) {
//		for (int i = 0; i < tabelaCliente.size(); i++) {
//			if(nome.equals(c.getNome())) {
//				JOptionPane.showMessageDialog(null, "Usuário já existente");
//			}else{
//				c.setEmail(String email);
//			}
//		}
//		return null;
//	}

}