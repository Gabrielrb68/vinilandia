package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setLocationRelativeTo(null);
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("BEM VINDO DE VOLTA A MUSICA!");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 11, 509, 23);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTRE NESSE MUNDO!");
		lblNewLabel_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(114, 90, 230, 45);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("DE VOLTA A AÇÃO!");
		lblNewLabel_2.setForeground(new Color(64, 0, 128));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(138, 180, 212, 36);
		contentPane.add(lblNewLabel_2);

		

		JLabel lblNewLabel_3 = new JLabel("BEM VINDO DE VOLTA A MUSICA!");
		lblNewLabel_3.setForeground(new Color(154, 53, 255));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(20, 17, 509, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("BEM VINDO DE VOLTA A MUSICA!");
		lblNewLabel_3_1.setForeground(new Color(193, 132, 255));
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(49, 25, 509, 23);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnCadastro = new JButton("CADASTRO");
		btnCadastro.setBackground(new Color(255, 160, 122));
		btnCadastro.setForeground(new Color(255, 255, 255));
		btnCadastro.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaRegistro telaRegistro = new TelaRegistro();
				telaRegistro.setLocationRelativeTo(null);
				telaRegistro.setVisible(true);
			}
		});
		btnCadastro.setBounds(155, 146, 135, 23);
		contentPane.add(btnCadastro);

		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(255, 160, 122));
		btnLogin.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaLogin telaLogin = new TelaLogin();
				telaLogin.setLocationRelativeTo(null);
				telaLogin.setVisible(true);
			}
		});
		btnLogin.setBounds(162, 227, 128, 23);
		contentPane.add(btnLogin);
	}
}
