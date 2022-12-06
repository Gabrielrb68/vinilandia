package visao;

import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.DiscoControl;
import modelo.Disco;

public class TelaPadrao extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JTable tableDiscos;
	private DefaultTableModel modelo;
	private Disco discoSelecionado;
	private JTable table;

	/**
	 * Construtor
	 */
	public TelaPadrao() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtPesquisa = new JTextField();
		txtPesquisa.setBackground(new Color(250, 235, 215));
		txtPesquisa.setBounds(20, 11, 228, 20);
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);

		JComboBox<String> cbFiltro = new JComboBox<>();
		cbFiltro.setBackground(new Color(128, 0, 128));
		cbFiltro.setBounds(364, 10, 60, 22);
		contentPane.add(cbFiltro);
		String Filtro[] = {""};
		

		JButton btnDeslogar = new JButton("Deslogar");
		btnDeslogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaInicial telaIncial = new TelaInicial();
				telaIncial.setLocationRelativeTo(null);
				telaIncial.setVisible(true);
			}
		});
		btnDeslogar.setBackground(new Color(128, 0, 128));
		btnDeslogar.setBounds(282, 197, 131, 53);
		contentPane.add(btnDeslogar);

		JButton btnDesejo = new JButton("Lista de desejos");
		btnDesejo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaDesejos telaDesejos = new TelaDesejos();
				telaDesejos.setLocationRelativeTo(null);
				telaDesejos.setVisible(true);
			}
		});
		btnDesejo.setBackground(new Color(128, 0, 128));
		btnDesejo.setBounds(282, 57, 131, 53);
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
		tableDiscos.setModel(modelo);

		// carregando os dados no jtable
		for (Disco disco : listaDiscos) {
			modelo.addRow(new Object[] { disco.getId(), disco.getNome() });
		}
		tableDiscos.setModel(modelo);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtPesquisa.getText().isBlank()) {
					pesquisa.setRowCount(0);
					for (Disco disco : listaDiscos) {
						if(disco.getNome().equalsIgnoreCase(txtPesquisa.getText())) {
							pesquisa.addRow(new Object[] { disco.getId(), disco.getNome() });
						}
					}
					tableDiscos.setModel(pesquisa);
				}else {
					tableDiscos.setModel(modelo);
				}
			}
		});
		btnPesquisar.setBounds(258, 10, 96, 23);
		contentPane.add(btnPesquisar);
		
		JButton btnAbrirDetalheDisco = new JButton("New button");
		btnAbrirDetalheDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaDisco telaDisco = new TelaDisco(discoSelecionado);
				telaDisco.setLocationRelativeTo(null);
				telaDisco.setVisible(true);
			}
		});
		btnAbrirDetalheDisco.setBounds(283, 134, 89, 23);
		contentPane.add(btnAbrirDetalheDisco);
	}
}
