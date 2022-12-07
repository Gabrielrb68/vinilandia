package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.ClienteControl;
import modelo.Cliente;

import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class TelaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JTextField txtSenha;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtCEP;
	private JTextField txtAno;
	private ClienteControl usuarioControl;

	/**
	 * Create the frame.
	 */
	public TelaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
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

		JLabel lblNewLabel5 = new JLabel("Pronome: ");
		lblNewLabel5.setForeground(new Color(64, 0, 128));
		lblNewLabel5.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel5.setBounds(35, 152, 60, 14);
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

		JComboBox<String> cbDia = new JComboBox<>();
		cbDia.setForeground(new Color(64, 0, 128));
		cbDia.setFont(new Font("Arial Black", Font.PLAIN, 11));
		cbDia.setBounds(140, 209, 55, 22);
		for (int i = 1; i <= 31; i++) {
			cbDia.addItem(String.valueOf(i));
		}
		contentPane.add(cbDia);

		JComboBox<String> cbMes = new JComboBox<>();
		cbMes.setForeground(new Color(64, 0, 128));
		cbMes.setFont(new Font("Arial Black", Font.PLAIN, 11));
		cbMes.setBounds(205, 209, 55, 22);
		for (int i = 1; i <= 12; i++) {
			cbMes.addItem(String.valueOf(i));
		}
		contentPane.add(cbMes);
		
		
		JComboBox<String> cbPronome = new JComboBox<>();
		cbPronome.setBounds(140, 149, 86, 22);
		contentPane.add(cbPronome);
		cbPronome.addItem("Ele/Dele");
		cbPronome.addItem("Ela/Dela");
		cbPronome.addItem("Elu/Delu");
		cbPronome.addItem("Outro");
		cbPronome.addItem("Não Informar");


		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtEmail.getText().isBlank() && !txtNome.getText().isBlank() && !txtSenha.getText().isBlank()
						&& !txtCPF.getText().isBlank() && !txtCEP.getText().isBlank() && !txtAno.getText().isBlank()) {
					// Pega todos os dados do campo de texto
					String email = txtEmail.getText();
					String nome = txtNome.getText();
					String senha = txtSenha.getText();
					Long cpf = Long.valueOf(txtCPF.getText());
					Long cep = Long.valueOf(txtCEP.getText());

					// LocalDate datNascimento =
					String dia = (String) cbDia.getSelectedItem();
					String mes = (String) cbMes.getSelectedItem();
					String ano = txtAno.getText();

					LocalDate dataNasc = LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes),
							Integer.parseInt(dia));

					// Instancia um obj cliente
					Cliente c = new Cliente();

					// faz todos os sets no obj
					c.setNome(nome);
					c.setEmail(email);
					c.setSenha(senha);
					c.setCpf(cpf);
					c.setCep(cep);
					c.setDatNascimento(dataNasc);
					c.setGenero(String.valueOf(cbPronome.getSelectedItem()));
					
					//registra o cliente
					ClienteControl clienteControl = ClienteControl.getInstancia();
					boolean valida = clienteControl.insert(c);
					if (valida == true) {
						//cadastrou com sucesso
						//exibir msg

						JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

						dispose();
						TelaLogin telaLogin = new TelaLogin();
						telaLogin.setLocationRelativeTo(null);
						telaLogin.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valores Vazios!");
				}
			}
		});
		btnRegistrar.setBackground(new Color(255, 160, 122));
		btnRegistrar.setForeground(new Color(255, 255, 255));
		btnRegistrar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnRegistrar.setBounds(304, 143, 103, 23);
		contentPane.add(btnRegistrar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaInicial telaIncial = new TelaInicial();
				telaIncial.setLocationRelativeTo(null);
				telaIncial.setVisible(true);
			}
		});
		btnVoltar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBackground(new Color(255, 160, 122));
		btnVoltar.setBounds(304, 174, 103, 23);
		contentPane.add(btnVoltar);
	}
}
