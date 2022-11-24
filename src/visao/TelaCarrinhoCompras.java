package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCarrinhoCompras extends JFrame { 

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCarrinhoCompras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SEU CARRINHO DE COMPRAS!");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 11, 404, 56);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 272, 141);
		contentPane.add(scrollPane);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(10, 78, 272, 139);
		contentPane.add(txtArea);
		
		JButton btnComprar = new JButton("PROSSEGUIR COM A COMPRA");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//enviarpreco
				dispose();
				TelaCompra telaCompra = new TelaCompra();
				telaCompra.setLocationRelativeTo(null);
				telaCompra.setVisible(true);
			}
		});
		btnComprar.setForeground(new Color(255, 255, 255));
		btnComprar.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnComprar.setBackground(new Color(255, 160, 122));
		btnComprar.setBounds(227, 230, 197, 23);
		contentPane.add(btnComprar);
		
		JButton btnvoltar = new JButton("CONTINUAR NAVEGANDO");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaPadrao telaPadrao = new TelaPadrao();
				telaPadrao.setLocationRelativeTo(null);
				telaPadrao.setVisible(true);
			}
		});
		btnvoltar.setForeground(new Color(255, 255, 255));
		btnvoltar.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnvoltar.setBackground(new Color(255, 160, 122));
		btnvoltar.setBounds(10, 230, 171, 23);
		contentPane.add(btnvoltar);
		
		JButton btnRemover = new JButton("REMOVER ITEM");
		btnRemover.setForeground(new Color(255, 255, 255));
		btnRemover.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnRemover.setBackground(new Color(255, 160, 122));
		btnRemover.setBounds(302, 78, 122, 23);
		contentPane.add(btnRemover);
	}
}
