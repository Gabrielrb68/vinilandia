package visao;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class TelaManutencao extends JFrame {
	
	ImageIcon image;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaManutencao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(104, 119, 223));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dedicamos esta tela para aquela que nos ajudou");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(97, 40, 479, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNosTemposSombrios = new JLabel("nos tempos mais sombrios entre os confins da programação");
		lblNosTemposSombrios.setForeground(Color.WHITE);
		lblNosTemposSombrios.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNosTemposSombrios.setBounds(49, 60, 616, 23);
		contentPane.add(lblNosTemposSombrios);
		
		JLabel lblEmJava = new JLabel("em Java -- que é fortemente tipado, é claro");
		lblEmJava.setForeground(Color.WHITE);
		lblEmJava.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblEmJava.setBounds(123, 79, 479, 23);
		contentPane.add(lblEmJava);
		
		JLabel lblNewLabel_1 = new JLabel("Bernardo Bencke, Gabriel Rosário, Luís Eduardo");
		lblNewLabel_1.setForeground(new Color(127, 255, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(163, 236, 364, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/coffee4.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(image));
		lblNewLabel_2.setBounds(257, 60, 319, 226);
		contentPane.add(lblNewLabel_2);
	}
}
