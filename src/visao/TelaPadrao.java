package visao;

import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.ClienteControl;
import controle.DiscoControl;
import modelo.Cliente;
import modelo.Disco;
import java.awt.Font;

public class TelaPadrao extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JTable tableDiscos;
	private DefaultTableModel modelo;
	private Disco discoSelecionado;
	private Cliente clienteSelecionado;
	private Boolean voltar = false;

	/**
	 * Construtor
	 */
	public TelaPadrao() {

		ClienteControl clienteControl = ClienteControl.getInstancia();
		ArrayList<Cliente> listaPessoa = clienteControl.listaCliente();
		for (Cliente cliente : listaPessoa) {
			if (clienteControl.getCPF() == cliente.getCpf()) {
				clienteSelecionado = cliente;
			}
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtPesquisa = new JTextField();
		txtPesquisa.setBackground(new Color(250, 235, 215));
		txtPesquisa.setBounds(27, 11, 176, 20);
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);

		JComboBox<String> cbFiltro = new JComboBox<>();
		cbFiltro.setForeground(new Color(255, 255, 255));
		cbFiltro.setBackground(new Color(255, 160, 122));
		cbFiltro.setBounds(317, 10, 107, 22);
		contentPane.add(cbFiltro);
		String Filtro[] = { "Nenhum", "Soul", "Eletrônico", "Rock", "Pop Rock", "Indie", "Bizarre" };
		for (int i = 0; i < Filtro.length; i++) {
			cbFiltro.addItem(Filtro[i]);
		}

		JButton btnDeslogar = new JButton("Deslogar");
		btnDeslogar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnDeslogar.setForeground(new Color(255, 255, 255));
		btnDeslogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaInicial telaIncial = new TelaInicial();
				telaIncial.setLocationRelativeTo(null);
				telaIncial.setVisible(true);
			}
		});
		btnDeslogar.setBackground(new Color(255, 160, 122));
		btnDeslogar.setBounds(269, 167, 144, 35);
		contentPane.add(btnDeslogar);

		JButton btnDesejo = new JButton("Lista de desejos");
		btnDesejo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnDesejo.setForeground(new Color(255, 255, 255));
		btnDesejo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clienteSelecionado != null) {
					dispose();
					TelaDesejos telaDesejos = new TelaDesejos(clienteSelecionado);
					telaDesejos.setLocationRelativeTo(null);
					telaDesejos.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "");
				}
			}
		});
		btnDesejo.setBackground(new Color(255, 160, 122));
		btnDesejo.setBounds(269, 57, 144, 44);
		contentPane.add(btnDesejo);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 57, 223, 193);
		contentPane.add(scrollPane);

		// criando e definindo configuracoes do jtable

		// carregando os dados do bd fake
		DiscoControl dC = DiscoControl.getInstancia();
		ArrayList<Disco> listaDiscos = dC.listaDiscos();

		tableDiscos = new JTable(modelo);
		tableDiscos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int linha = tableDiscos.getSelectedRow();
				Long id = (Long) tableDiscos.getValueAt(linha, 0);
				for (Disco disco : listaDiscos) {
					if (disco.getId() == id) {
						discoSelecionado = disco;
					}
				}
			}
		});
		scrollPane.setViewportView(tableDiscos);
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Nome" });
		DefaultTableModel pesquisa = new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Nome" });
		tableDiscos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome"
			}
		));

		// carregando os dados no jtable
		for (Disco disco : listaDiscos) {
			modelo.addRow(new Object[] { disco.getId(), disco.getNome() });
		}
		tableDiscos.setModel(modelo);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnPesquisar.setForeground(new Color(255, 255, 255));
		btnPesquisar.setBackground(new Color(255, 160, 122));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtPesquisa.getText().isBlank() && cbFiltro.getSelectedItem().equals("Nenhum")) {
					tableDiscos.setModel(modelo);
				} else {
					pesquisa.setRowCount(0);
					for (Disco disco : listaDiscos) {
						if (cbFiltro.getSelectedItem().equals("Nenhum")
								&& (disco.getNome().equalsIgnoreCase(txtPesquisa.getText()))) {
							if (disco.getNome().equalsIgnoreCase(txtPesquisa.getText())) {
								pesquisa.addRow(new Object[] { disco.getId(), disco.getNome() });
							}
						} else {
							if (txtPesquisa.getText().isBlank()) {
								if (disco.getGenero().equals(String.valueOf(cbFiltro.getSelectedItem()))) {
									pesquisa.addRow(new Object[] { disco.getId(), disco.getNome() });
								}
							} else {
								if ((disco.getGenero().equals(String.valueOf(cbFiltro.getSelectedItem())))
										&& (disco.getNome().equalsIgnoreCase(txtPesquisa.getText()))) {
									pesquisa.addRow(new Object[] { disco.getId(), disco.getNome() });
								}
							}
						}
					}
					tableDiscos.setModel(pesquisa);
				}
			}
		});
		btnPesquisar.setBounds(213, 10, 94, 23);
		contentPane.add(btnPesquisar);

		JButton btnAbrirDetalheDisco = new JButton("Selecionar Disco");
		btnAbrirDetalheDisco.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnAbrirDetalheDisco.setForeground(new Color(255, 255, 255));
		btnAbrirDetalheDisco.setBackground(new Color(255, 160, 122));
		btnAbrirDetalheDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaDisco telaDisco = new TelaDisco(discoSelecionado, clienteSelecionado, voltar);
				telaDisco.setLocationRelativeTo(null);
				telaDisco.setVisible(true);
			}
		});
		btnAbrirDetalheDisco.setBounds(269, 112, 145, 44);
		contentPane.add(btnAbrirDetalheDisco);

		JButton btnConfiguracoes = new JButton("Configuracoes");
		btnConfiguracoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaConfiguracoes telaConfiguracoes = new TelaConfiguracoes(clienteSelecionado);
				telaConfiguracoes.setLocationRelativeTo(null);
				telaConfiguracoes.setVisible(true);
			}
		});
		btnConfiguracoes.setForeground(Color.WHITE);
		btnConfiguracoes.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnConfiguracoes.setBackground(new Color(255, 160, 122));
		btnConfiguracoes.setBounds(269, 213, 144, 35);
		contentPane.add(btnConfiguracoes);
	}
}
