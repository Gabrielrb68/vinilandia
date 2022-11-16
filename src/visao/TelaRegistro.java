package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class TelaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textSenha;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textGen;
	private JTextField textCEP;
	private JTextField textAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRegistro frame = new TelaRegistro();
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
	public TelaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
		lblNewLabel.setBounds(122, -22, 241, 84);
		contentPane.add(lblNewLabel);
		
		JLabel txtEmail2 = new JLabel("Email:");
		txtEmail2.setForeground(new Color(64, 0, 128));
		txtEmail2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtEmail2.setBounds(35, 51, 46, 14);
		contentPane.add(txtEmail2);
		
		JLabel txtSenha = new JLabel("Senha:");
		txtSenha.setForeground(new Color(64, 0, 128));
		txtSenha.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtSenha.setBounds(35, 76, 46, 14);
		contentPane.add(txtSenha);
		
		JLabel txtNome = new JLabel("Nome:");
		txtNome.setForeground(new Color(64, 0, 128));
		txtNome.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtNome.setBounds(35, 102, 46, 14);
		contentPane.add(txtNome);
		
		JLabel txtData = new JLabel("Aniversário:");
		txtData.setForeground(new Color(64, 0, 128));
		txtData.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtData.setBounds(35, 202, 108, 14);
		contentPane.add(txtData);
		
		JLabel txtGen = new JLabel("Gênero:");
		txtGen.setForeground(new Color(64, 0, 128));
		txtGen.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtGen.setBounds(35, 152, 46, 14);
		contentPane.add(txtGen);
		
		JLabel txtCEP = new JLabel("CEP:");
		txtCEP.setForeground(new Color(64, 0, 128));
		txtCEP.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtCEP.setBounds(35, 177, 46, 14);
		contentPane.add(txtCEP);
		
		JLabel txtCPF = new JLabel("CPF:");
		txtCPF.setForeground(new Color(64, 0, 128));
		txtCPF.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtCPF.setBounds(35, 127, 46, 14);
		contentPane.add(txtCPF);
		
		textEmail = new JTextField();
		textEmail.setBounds(140, 48, 86, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setBounds(140, 73, 86, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(140, 99, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(140, 124, 86, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textGen = new JTextField();
		textGen.setBounds(140, 149, 86, 20);
		contentPane.add(textGen);
		textGen.setColumns(10);
		
		textCEP = new JTextField();
		textCEP.setBounds(140, 174, 86, 20);
		contentPane.add(textCEP);
		textCEP.setColumns(10);
		
		textAno = new JTextField();
		textAno.setForeground(new Color(64, 0, 128));
		textAno.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textAno.setBounds(270, 210, 55, 20);
		contentPane.add(textAno);
		textAno.setColumns(10);
		
		JComboBox cbDia = new JComboBox();
		cbDia.setForeground(new Color(64, 0, 128));
		cbDia.setFont(new Font("Arial Black", Font.PLAIN, 11));
		cbDia.setBounds(140, 209, 55, 22);
		contentPane.add(cbDia);
		
		JComboBox cbMes = new JComboBox();
		cbMes.setForeground(new Color(64, 0, 128));
		cbMes.setFont(new Font("Arial Black", Font.PLAIN, 11));
		cbMes.setBounds(205, 209, 55, 22);
		contentPane.add(cbMes);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setForeground(new Color(64, 0, 128));
		btnRegistrar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnRegistrar.setBounds(318, 148, 89, 23);
		contentPane.add(btnRegistrar);
	}
}
