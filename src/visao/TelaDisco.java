package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controle.ClienteControl;
import modelo.Disco;

public class TelaDisco extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaDisco(Disco discoSelecionado) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 328);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Autor:");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(187, 22, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Gênero:");
		lblNewLabel_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(187, 62, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Descrição:");
		lblNewLabel_2.setForeground(new Color(64, 0, 128));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 134, 69, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Preço:");
		lblNewLabel_3.setForeground(new Color(64, 0, 128));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(187, 98, 46, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblAutor = new JLabel("");
		lblAutor.setBounds(243, 22, 146, 18);
		contentPane.add(lblAutor);

		JLabel lblGenero = new JLabel("");
		lblGenero.setBounds(243, 61, 146, 14);
		contentPane.add(lblGenero);

		JLabel lblPreco = new JLabel("");
		lblPreco.setBounds(243, 98, 146, 14);
		contentPane.add(lblPreco);

		JLabel lblDesc = new JLabel("");
		lblDesc.setVerticalAlignment(SwingConstants.TOP);
		lblDesc.setBounds(89, 134, 335, 56);
		contentPane.add(lblDesc);

		JLabel lblNewLabel_4 = new JLabel("Avaliação:");
		lblNewLabel_4.setForeground(new Color(64, 0, 128));
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(162, 203, 69, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblAvaliacao = new JLabel("");
		lblAvaliacao.setBounds(172, 228, 99, 48);
		contentPane.add(lblAvaliacao);

		if (discoSelecionado != null) {
			// setar texto nos labels
			lblAutor.setText(discoSelecionado.getAutor());
			lblAvaliacao.setText(String.valueOf(discoSelecionado.getAvaliacao()));
			lblDesc.setText(discoSelecionado.getDescrição());
			lblGenero.setText(discoSelecionado.getGenero());
			lblPreco.setText(String.valueOf(discoSelecionado.getPreco()));

		}

		JButton btnLike = new JButton("Like");
		btnLike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float avaliacao = discoSelecionado.getAvaliacao()+1;
				discoSelecionado.setAvaliacao(avaliacao);
				lblAvaliacao.setText(String.valueOf(discoSelecionado.getAvaliacao()));
			}
		});
		btnLike.setForeground(new Color(255, 255, 255));
		btnLike.setBackground(new Color(154, 205, 50));
		btnLike.setBounds(10, 221, 102, 23);
		contentPane.add(btnLike);
		

		JButton btnDislike = new JButton("Dislike");
		btnDislike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float avaliacao = discoSelecionado.getAvaliacao()-1;
				discoSelecionado.setAvaliacao(avaliacao);
				lblAvaliacao.setText(String.valueOf(discoSelecionado.getAvaliacao()));
			
			
			}
		});
		btnDislike.setForeground(new Color(255, 255, 255));
		btnDislike.setBackground(new Color(255, 69, 0));
		btnDislike.setBounds(10, 255, 102, 23);
		contentPane.add(btnDislike);

		JLabel lblNewLabel_5 = new JLabel("insira foto aqui");
		lblNewLabel_5.setBounds(51, 63, 85, 14);
		contentPane.add(lblNewLabel_5);

		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBackground(new Color(255, 160, 122));
		btnComprar.setForeground(new Color(255, 255, 255));
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// adcionar disco ao carrinho
				dispose();
				TelaCompra telaCompra = new TelaCompra();
				telaCompra.setLocationRelativeTo(null);
				telaCompra.setVisible(true);
			}
		});
		btnComprar.setBounds(281, 221, 143, 23);
		contentPane.add(btnComprar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBackground(new Color(255, 160, 122));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaPadrao telaPadrao = new TelaPadrao();
				telaPadrao.setLocationRelativeTo(null);
				telaPadrao.setVisible(true);
			}
		});
		btnVoltar.setBounds(281, 255, 143, 23);
		contentPane.add(btnVoltar);
		
		JButton btnAdicionarDesejo = new JButton("Lista de Desejo +");
		btnAdicionarDesejo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteControl.setListaDesejo(discoSelecionado);
			}
		});
		btnAdicionarDesejo.setBackground(new Color(255, 160, 122));
		btnAdicionarDesejo.setForeground(new Color(255, 255, 255));
		btnAdicionarDesejo.setBounds(281, 186, 143, 23);
		contentPane.add(btnAdicionarDesejo);

	}
}
