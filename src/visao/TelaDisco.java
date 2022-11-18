package visao;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class TelaDisco extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaDisco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Autor:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(204, 11, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Gênero:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(204, 36, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Descrição:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(204, 86, 69, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Preço:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(204, 61, 46, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblAutor = new JLabel("");
		lblAutor.setBounds(260, 12, 46, 14);
		contentPane.add(lblAutor);

		JLabel lblGenero = new JLabel("");
		lblGenero.setBounds(260, 37, 46, 14);
		contentPane.add(lblGenero);

		JLabel lblPreco = new JLabel("");
		lblPreco.setBounds(260, 62, 46, 14);
		contentPane.add(lblPreco);

		JLabel lblDesc = new JLabel("");
		lblDesc.setVerticalAlignment(SwingConstants.TOP);
		lblDesc.setBounds(282, 101, 142, 116);
		contentPane.add(lblDesc);
		
		JTextArea txtAreaComentario = new JTextArea();
		txtAreaComentario.setBackground(new Color(211, 211, 211));
		txtAreaComentario.setBounds(10, 164, 132, 53);
		contentPane.add(txtAreaComentario);
		
		JButton btnComentar = new JButton("Comentar");
		btnComentar.setBackground(new Color(255, 255, 128));
		btnComentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComentar.setBounds(162, 164, 88, 53);
		contentPane.add(btnComentar);
		
		JLabel lblNewLabel_4 = new JLabel("Avaliação:");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(152, 134, 69, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblAvaliacao = new JLabel("");
		lblAvaliacao.setBounds(227, 134, 46, 14);
		contentPane.add(lblAvaliacao);
		
		JButton btnLike = new JButton("Like");
		btnLike.setBackground(new Color(255, 255, 128));
		btnLike.setBounds(10, 130, 61, 23);
		contentPane.add(btnLike);
		
		JButton btnDislike = new JButton("Dislike");
		btnDislike.setBackground(new Color(255, 255, 128));
		btnDislike.setBounds(81, 130, 61, 23);
		contentPane.add(btnDislike);
		
		JLabel lblNewLabel_5 = new JLabel("insira foto aqui");
		lblNewLabel_5.setBounds(57, 50, 85, 14);
		contentPane.add(lblNewLabel_5);
		
	}
}
