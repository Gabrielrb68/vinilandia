package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class TelaConfiguracoes extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtSenha;
	private JTextField txtCEP;


	public TelaConfiguracoes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 351);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONFIGURAÇÕES");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblNewLabel.setBounds(32, 11, 236, 57);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBackground(new Color(250, 235, 215));
		txtNome.setForeground(new Color(250, 235, 215));
		txtNome.setBounds(33, 79, 144, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1.setBounds(242, 82, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNome = new JLabel("");
		lblNome.setBounds(329, 82, 155, 14);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1_1.setBounds(242, 107, 90, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Senha");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1_1_1.setBounds(242, 132, 90, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(250, 235, 215));
		txtEmail.setForeground(new Color(250, 235, 215));
		txtEmail.setColumns(10);
		txtEmail.setBounds(33, 104, 144, 20);
		contentPane.add(txtEmail);
		
		txtSenha = new JTextField();
		txtSenha.setBackground(new Color(250, 235, 215));
		txtSenha.setForeground(new Color(250, 235, 215));
		txtSenha.setColumns(10);
		txtSenha.setBounds(33, 129, 144, 20);
		contentPane.add(txtSenha);
		
		JLabel lblEmail = new JLabel("");
		lblEmail.setBounds(329, 107, 155, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nascimento:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1_1_1_1.setBounds(242, 157, 90, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNascimento = new JLabel("");
		lblNascimento.setBounds(329, 157, 155, 14);
		contentPane.add(lblNascimento);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Pronome:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1_1_1_1_1.setBounds(242, 182, 90, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblPronome = new JLabel("");
		lblPronome.setBounds(329, 182, 155, 14);
		contentPane.add(lblPronome);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 160, 122));
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Arial Black", Font.PLAIN, 12));
		comboBox.setBounds(33, 178, 144, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("CEP:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1_1_1_1_1_1.setBounds(242, 207, 90, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblCEP = new JLabel("");
		lblCEP.setBounds(329, 207, 155, 14);
		contentPane.add(lblCEP);
		
		txtCEP = new JTextField();
		txtCEP.setBackground(new Color(250, 235, 215));
		txtCEP.setForeground(new Color(250, 235, 215));
		txtCEP.setColumns(10);
		txtCEP.setBounds(33, 204, 144, 20);
		contentPane.add(txtCEP);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setBackground(new Color(255, 160, 122));
		btnSalvar.setBounds(337, 232, 107, 35);
		contentPane.add(btnSalvar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(255, 160, 122));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnVoltar.setBounds(337, 278, 107, 23);
		contentPane.add(btnVoltar);
	}
}
