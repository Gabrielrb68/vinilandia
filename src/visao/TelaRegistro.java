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
	private JTextField txtEmail;
	private JTextField txtSenha;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtGen;
	private JTextField txtCEP;
	private JTextField txtAno;

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
		contentPane.setBackground(new Color(128, 128, 255));
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
		
		JLabel lblNewLabel2 = new JLabel("Senha:");
		lblNewLabel2.setForeground(new Color(64, 0, 128));
		lblNewLabel2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel2.setBounds(35, 76, 46, 14);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("Nome:");
		lblNewLabel3.setForeground(new Color(64, 0, 128));
		lblNewLabel3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel3.setBounds(35, 102, 46, 14);
		contentPane.add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Aniversário:");
		lblNewLabel4.setForeground(new Color(64, 0, 128));
		lblNewLabel4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel4.setBounds(35, 202, 108, 14);
		contentPane.add(lblNewLabel4);
		
		JLabel lblNewLabel5 = new JLabel("Gênero:");
		lblNewLabel5.setForeground(new Color(64, 0, 128));
		lblNewLabel5.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel5.setBounds(35, 152, 46, 14);
		contentPane.add(lblNewLabel5);
		
		JLabel lblNewLabel6 = new JLabel("CEP:");
		lblNewLabel6.setForeground(new Color(64, 0, 128));
		lblNewLabel6.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel6.setBounds(35, 177, 46, 14);
		contentPane.add(lblNewLabel6);
		
		JLabel lblNewLabel7 = new JLabel("CPF:");
		lblNewLabel7.setForeground(new Color(64, 0, 128));
		lblNewLabel7.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel7.setBounds(35, 127, 46, 14);
		contentPane.add(lblNewLabel7);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(140, 48, 86, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(140, 73, 86, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(140, 99, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(140, 124, 86, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtGen = new JTextField();
		txtGen.setBounds(140, 149, 86, 20);
		contentPane.add(txtGen);
		txtGen.setColumns(10);
		
		txtCEP = new JTextField();
		txtCEP.setBounds(140, 174, 86, 20);
		contentPane.add(txtCEP);
		txtCEP.setColumns(10);
		
		txtAno = new JTextField();
		txtAno.setForeground(new Color(64, 0, 128));
		txtAno.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtAno.setBounds(270, 210, 55, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
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
