package visao;

import java.awt.Color;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.DiscoControl;
import modelo.Disco;
import javax.swing.JTable;

public class TelaPadrao extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JTable tableDiscos;
	private Disco discoSelecionado;

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

		JComboBox cbFiltro = new JComboBox();
		cbFiltro.setBackground(new Color(128, 0, 128));
		cbFiltro.setBounds(364, 10, 60, 22);
		contentPane.add(cbFiltro);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setBounds(258, 10, 96, 23);
		contentPane.add(btnPesquisar);

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
		scrollPane.setBounds(20, 55, 251, 195);
		contentPane.add(scrollPane);

		// criando e definindo configuracoes do jtable
		tableDiscos = new JTable();
		tableDiscos.setBounds(241, 42, -220, 208);
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Nome" });
		tableDiscos.setModel(modelo);
		scrollPane.add(tableDiscos);

		// carregando os dados do bd fake
		DiscoControl dC = DiscoControl.getInstancia();
		ArrayList<Disco> listaDiscos = dC.listaDiscos();

		// carregando os dados no jtable
		for (Disco disco : listaDiscos) {
			modelo.addRow(new Object[] { disco.getId(), disco.getNome() });
		}
		tableDiscos.setModel(modelo);

//		TelaDisco telaDisco = new TelaDisco(discoSelecionado);
//		telaDisco.setVisible(true);

		tableDiscos.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// Pega a linha selecionada
				int posicao = tableDiscos.getSelectedRow();

				tableDiscos.getValueAt(posicao, 0);

			}
		});
	}
}
