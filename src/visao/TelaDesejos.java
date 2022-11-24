package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDesejos extends JFrame {

	private JPanel contentPane;
	private JTextField txtLista;

	/**
	 * Create the frame.
	 */
	public TelaDesejos() {
		setBackground(new Color(128, 128, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
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
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaPadrao telaPadrao = new TelaPadrao();
				telaPadrao.setLocationRelativeTo(null);
				telaPadrao.setVisible(true);
			}
		});
		btnVoltar.setForeground(new Color(64, 0, 128));
		btnVoltar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnVoltar.setBounds(335, 227, 89, 23);
		contentPane.add(btnVoltar);
	}
}
