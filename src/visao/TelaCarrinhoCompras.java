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

public class TelaCarrinhoCompras extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarrinhoCompras frame = new TelaCarrinhoCompras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 11, 404, 56);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 78, 241, 141);
		contentPane.add(scrollPane);
		
		JTextArea txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		
		JButton btnComprar = new JButton("PROSSEGUIR COM A COMPRA");
		btnComprar.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnComprar.setBackground(new Color(250, 240, 230));
		btnComprar.setBounds(227, 230, 197, 23);
		contentPane.add(btnComprar);
		
		JButton btnvoltar = new JButton("CONTINUAR NAVEGANDO");
		btnvoltar.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnvoltar.setBackground(new Color(250, 240, 230));
		btnvoltar.setBounds(10, 230, 171, 23);
		contentPane.add(btnvoltar);
		
		JButton btnRemover = new JButton("REMOVER ITEM");
		btnRemover.setFont(new Font("Arial Black", Font.PLAIN, 9));
		btnRemover.setBackground(new Color(250, 240, 230));
		btnRemover.setBounds(302, 103, 122, 23);
		contentPane.add(btnRemover);
	}
}
