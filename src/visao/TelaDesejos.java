package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaDesejos extends JFrame {

	private JPanel contentPane;
	private JTextField txtLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDesejos frame = new TelaDesejos();
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
	public TelaDesejos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LISTA DE DESEJOS");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
		lblNewLabel.setBounds(40, -35, 371, 138);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 304, 174);
		contentPane.add(scrollPane);
		
		JTextArea txtAreaDesejo = new JTextArea();
		scrollPane.setViewportView(txtAreaDesejo);
		
		txtLista = new JTextField();
		txtLista.setBounds(338, 79, 86, 20);
		contentPane.add(txtLista);
		txtLista.setColumns(10);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setForeground(new Color(64, 0, 128));
		btnRemover.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnRemover.setBounds(335, 110, 89, 23);
		contentPane.add(btnRemover);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(new Color(64, 0, 128));
		btnVoltar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnVoltar.setBounds(335, 227, 89, 23);
		contentPane.add(btnVoltar);
	}
}
