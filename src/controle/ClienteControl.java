package controle;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Disco;

public class ClienteControl {

	/**
	 * ArrayList simula um banco de dados
	 */
	private static ArrayList<Cliente> tabelaCliente;
	private static ArrayList<Disco> discosCliente;
	private static ClienteControl instancia;

	/**
	 * Padrao singleton viabiliza manipular um unico objeto na memoria
	 * 
	 * 
	 * Apenas este metodo deve ser utilizado
	 * 
	 * @return
	 */
	public static ClienteControl getInstancia() {

		if (instancia == null) {
			instancia = new ClienteControl();
			tabelaCliente = new ArrayList<>();
			
			// pre cadastro
			tabelaCliente.add(new Cliente("admin", "admin"));
		}
		return instancia;
	}

	/**
	 * Construtor da classe privado impedindo que seja instanciada
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
		for (Cliente cliente : tabelaCliente) {
			if (cliente.getCpf() == cpf) {
				cliente.setNome(c.getNome());
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Cliente c, int idCliente) {
		for (Cliente cliente : tabelaCliente) {
			if (cliente.getCpf() == idCliente) {
				tabelaCliente.remove(cliente);
				return true;
			}
		}
		return false;
	}

	// Collections.sort()
	public ArrayList<Cliente> listaCliente() {
		return tabelaCliente;
	}

	public Cliente efetuarLogin(String email, String senha) {
		for (Cliente c : tabelaCliente) {
			if (c.getEmail().equals(email) && c.getSenha().equals(senha)) {
				return c;
			}
		}

		return null;
	}
	
	public static ArrayList<Disco> getListaDesejo() {
		Cliente c = new Cliente();
				return c.getDiscosCliente();
	}
	public static void setListaDesejo(Disco discoSelecionado) {
		Cliente c = new Cliente();
		ArrayList<Disco> discosCliente = c.getDiscosCliente();
			discosCliente.add(discoSelecionado);
			c.setDiscosCliente(discosCliente);
	}

}