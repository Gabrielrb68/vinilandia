package visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaPadrao extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;

	/**
	 * Create the frame.
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

		JTextArea txtAreaDiscos = new JTextArea();
		txtAreaDiscos.setBackground(new Color(250, 240, 230));
		txtAreaDiscos.setBounds(10, 56, 251, 194);
		contentPane.add(txtAreaDiscos);

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
		
		JButton btnCarrinho = new JButton("Carrinho");
		btnCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCarrinhoCompras telaCarrinho = new TelaCarrinhoCompras();
				telaCarrinho.setLocationRelativeTo(null);
				telaCarrinho.setVisible(true);
			}
		});
		btnCarrinho.setBackground(new Color(128, 0, 128));
		btnCarrinho.setBounds(282, 121, 131, 65);
		contentPane.add(btnCarrinho);
		
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
		
		JButton btnNewButton = new JButton("testeTemp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//enviar id do disco escolhido
				dispose();
				TelaDisco telaDisco = new TelaDisco();
				telaDisco.setLocationRelativeTo(null);
				telaDisco.setVisible(true);
			}
		});
		btnNewButton.setBounds(30, 42, 89, 23);
		contentPane.add(btnNewButton);
	}
}
