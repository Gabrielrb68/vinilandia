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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCompra extends JFrame {

	private JPanel contentPane;
	private JTextField txtDonoCartao;
	private JTextField txtCartao;
	private JTextField txtSeguranca;
	private JTextField txtValidadeMes;
	private JTextField txtValidadeAno;

	/**
	 * Create the frame.
	 */
	public TelaCompra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setForeground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome do dono do cartão:");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setBackground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(26, 30, 163, 14);
		contentPane.add(lblNewLabel);

		txtDonoCartao = new JTextField();
		txtDonoCartao.setBounds(182, 28, 242, 20);
		contentPane.add(txtDonoCartao);
		txtDonoCartao.setColumns(10);

		JLabel lblNmeroDoCarto = new JLabel("Número do cartão:");
		lblNmeroDoCarto.setForeground(new Color(64, 0, 128));
		lblNmeroDoCarto.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNmeroDoCarto.setBackground(new Color(64, 0, 128));
		lblNmeroDoCarto.setBounds(26, 66, 163, 14);
		contentPane.add(lblNmeroDoCarto);

		txtCartao = new JTextField();
		txtCartao.setBounds(182, 64, 242, 20);
		contentPane.add(txtCartao);
		txtCartao.setColumns(10);

		JLabel lblCdigoDeSegurana = new JLabel("Código de segurança:");
		lblCdigoDeSegurana.setForeground(new Color(64, 0, 128));
		lblCdigoDeSegurana.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCdigoDeSegurana.setBackground(new Color(64, 0, 128));
		lblCdigoDeSegurana.setBounds(26, 99, 163, 14);
		contentPane.add(lblCdigoDeSegurana);

		txtSeguranca = new JTextField();
		txtSeguranca.setBounds(338, 95, 86, 20);
		contentPane.add(txtSeguranca);
		txtSeguranca.setColumns(10);

		JLabel lblValidade = new JLabel("Validade:");
		lblValidade.setForeground(new Color(64, 0, 128));
		lblValidade.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblValidade.setBackground(new Color(64, 0, 128));
		lblValidade.setBounds(26, 134, 163, 14);
		contentPane.add(lblValidade);

		txtValidadeMes = new JTextField();
		txtValidadeMes.setBounds(183, 132, 46, 20);
		contentPane.add(txtValidadeMes);
		txtValidadeMes.setColumns(10);

		txtValidadeAno = new JTextField();
		txtValidadeAno.setColumns(10);
		txtValidadeAno.setBounds(234, 132, 46, 20);
		contentPane.add(txtValidadeAno);

		JButton btnComprar = new JButton("COMPRAR!");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//verificar cartao
				JOptionPane.showMessageDialog(btnComprar, "Pedido a caminho, agradecemos sua compra");
			}
		});
		btnComprar.setForeground(new Color(255, 255, 255));
		btnComprar.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnComprar.setBackground(new Color(255, 160, 122));
		btnComprar.setBounds(26, 176, 163, 61);
		contentPane.add(btnComprar);

		JButton btnCancelar = new JButton("cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaPadrao telaPadrao = new TelaPadrao();
				telaPadrao.setLocationRelativeTo(null);
				telaPadrao.setVisible(true);
			}
		});
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBackground(new Color(147, 112, 219));
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnCancelar.setBounds(354, 236, 70, 14);
		contentPane.add(btnCancelar);
	}
}
