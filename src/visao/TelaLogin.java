package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.ClienteControl;
import modelo.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JTextField txtSenha;

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setBounds(166, 11, 122, 57);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("EMAIL:");
		lblNewLabel_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(81, 93, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("SENHA:");
		lblNewLabel_2.setForeground(new Color(64, 0, 128));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(81, 135, 57, 14);
		contentPane.add(lblNewLabel_2);

		txtEmail = new JTextField();
		txtEmail.setBounds(135, 90, 187, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		txtSenha = new JTextField();
		txtSenha.setBounds(137, 132, 185, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);

		JButton btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBackground(new Color(255, 160, 122));
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// verificar o login
				String email = txtEmail.getText();
				String senha = txtSenha.getText();
				
				ClienteControl clienteControl = ClienteControl.getInstancia();
				Cliente c = clienteControl.efetuarLogin(email, senha);
					
				if(email.equals("Bruna") && (senha.equals("Bruna"))) {
					dispose();
					TelaManutencao telaManutencao = new TelaManutencao();
					telaManutencao.setLocationRelativeTo(null);
					telaManutencao.setVisible(true);
				}else {
					if(c!=null) {
						dispose();
						TelaPadrao telaPadrao = new TelaPadrao();
						telaPadrao.setLocationRelativeTo(null);
						telaPadrao.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(btnContinuar, "Dados incorretos");
					}
				}
			}
		});
		btnContinuar.setForeground(new Color(255, 255, 255));
		btnContinuar.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnContinuar.setBounds(151, 185, 156, 40);
		contentPane.add(btnContinuar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaInicial telaIncial = new TelaInicial();
				telaIncial.setLocationRelativeTo(null);
				telaIncial.setVisible(true);
			}
		});
		btnVoltar.setBackground(new Color(255, 160, 122));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnVoltar.setBounds(10, 227, 89, 23);
		contentPane.add(btnVoltar);
	}
}
