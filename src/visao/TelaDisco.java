package visao;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaDisco extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaDisco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
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
	}
}
