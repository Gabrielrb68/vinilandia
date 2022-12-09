package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controle.ClienteControl;
import modelo.Cliente;
import modelo.Disco;
import javax.swing.JCheckBox;

public class TelaDisco extends JFrame {

	private JPanel contentPane;
	private Boolean jaPossui=false;

	/**
	 * Create the frame.
	 */
	public TelaDisco(Disco discoSelecionado, Cliente clienteSelecionado, Boolean voltar) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 328);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Autor:");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(187, 22, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Gênero:");
		lblNewLabel_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(187, 62, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Descrição:");
		lblNewLabel_2.setForeground(new Color(64, 0, 128));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 134, 69, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Preço:");
		lblNewLabel_3.setForeground(new Color(64, 0, 128));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(187, 98, 46, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblAutor = new JLabel("");
		lblAutor.setBounds(243, 22, 146, 18);
		contentPane.add(lblAutor);

		JLabel lblGenero = new JLabel("");
		lblGenero.setBounds(243, 61, 146, 14);
		contentPane.add(lblGenero);

		JLabel lblPreco = new JLabel("");
		lblPreco.setBounds(243, 98, 146, 14);
		contentPane.add(lblPreco);

		JLabel lblDesc = new JLabel("");
		lblDesc.setVerticalAlignment(SwingConstants.TOP);
		lblDesc.setBounds(89, 134, 335, 56);
		contentPane.add(lblDesc);

		JLabel lblNewLabel_4 = new JLabel("Avaliação:");
		lblNewLabel_4.setForeground(new Color(64, 0, 128));
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(162, 203, 69, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblAvaliacao = new JLabel("");
		lblAvaliacao.setBounds(172, 228, 99, 48);
		contentPane.add(lblAvaliacao);

		if (discoSelecionado != null) {
			// setar texto nos labels
			lblAutor.setText(discoSelecionado.getAutor());
			lblAvaliacao.setText(String.valueOf(discoSelecionado.getAvaliacao()));
			lblDesc.setText(discoSelecionado.getDescrição());
			lblGenero.setText(discoSelecionado.getGenero());
			lblPreco.setText(String.valueOf(discoSelecionado.getPreco()));

		}

		JLabel lblNewLabel_5 = new JLabel("insira foto aqui");
		lblNewLabel_5.setBounds(51, 63, 85, 14);
		contentPane.add(lblNewLabel_5);

		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBackground(new Color(255, 160, 122));
		btnComprar.setForeground(new Color(255, 255, 255));
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// adcionar disco ao carrinho
				dispose();
				TelaCompra telaCompra = new TelaCompra();
				telaCompra.setLocationRelativeTo(null);
				telaCompra.setVisible(true);
			}
		});
		btnComprar.setBounds(281, 221, 143, 23);
		contentPane.add(btnComprar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBackground(new Color(255, 160, 122));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(voltar) {
					dispose();
					TelaDesejos telaDesejos = new TelaDesejos(clienteSelecionado);
					telaDesejos.setLocationRelativeTo(null);
					telaDesejos.setVisible(true);
				}else {
					dispose();
					TelaPadrao telaPadrao = new TelaPadrao();
					telaPadrao.setLocationRelativeTo(null);
					telaPadrao.setVisible(true);
				}
			}
		});
		btnVoltar.setBounds(281, 255, 143, 23);
		contentPane.add(btnVoltar);

		JButton btnAdicionarDesejo = new JButton("Lista de Desejo +");
		btnAdicionarDesejo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Disco> discosFavoritos = clienteSelecionado.getDiscosCliente();
				if (discosFavoritos == null) {
					discosFavoritos = new ArrayList<>();
					discosFavoritos.add(discoSelecionado);
					clienteSelecionado.setDiscosCliente(discosFavoritos);
					JOptionPane.showMessageDialog(btnAdicionarDesejo, "Adcionado a lista de desejos");
				}else {
					for (Disco disco : discosFavoritos) {
						if(disco == discoSelecionado) {
							jaPossui=true;
						}
					}
					if(jaPossui) {
						JOptionPane.showMessageDialog(btnAdicionarDesejo, "Disco já adcionado");
					}else {
						discosFavoritos.add(discoSelecionado);
						clienteSelecionado.setDiscosCliente(discosFavoritos);
						JOptionPane.showMessageDialog(btnAdicionarDesejo, "Adcionado a lista de desejos");
					}
				}
			}
		});
		btnAdicionarDesejo.setBackground(new Color(255, 160, 122));
		btnAdicionarDesejo.setForeground(new Color(255, 255, 255));
		btnAdicionarDesejo.setBounds(281, 186, 143, 23);
		contentPane.add(btnAdicionarDesejo);
		
		JCheckBox chckbxLike = new JCheckBox("Like");
		chckbxLike.setBackground(new Color(34, 139, 34));
		chckbxLike.setBounds(10, 221, 97, 23);
		contentPane.add(chckbxLike);
		
		JCheckBox chckbxDislike = new JCheckBox("Dislike");
		chckbxDislike.setBackground(new Color(165, 42, 42));
		chckbxDislike.setBounds(10, 253, 97, 23);
		contentPane.add(chckbxDislike);
		
		if(clienteSelecionado.getDiscosLike()!=null) {
			for (Disco disco : clienteSelecionado.getDiscosLike()) {
				if(disco == discoSelecionado) {
					chckbxLike.setSelected(true);
					chckbxDislike.setEnabled(false);
				}
			}
		}
		
		if(clienteSelecionado.getDiscosDislike()!=null) {
				for (Disco disco : clienteSelecionado.getDiscosDislike()) {
					if(disco == discoSelecionado) {
						chckbxDislike.setSelected(true);
						chckbxLike.setEnabled(false);
					}
				}
		}
		
		chckbxLike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxLike.isSelected()) {
					ArrayList<Disco> discosLike = clienteSelecionado.getDiscosLike();
					if (discosLike == null) {
						discosLike = new ArrayList<>();
					}
					Float avaliacao = discoSelecionado.getAvaliacao() + 1;
					discoSelecionado.setAvaliacao(avaliacao);
					lblAvaliacao.setText(String.valueOf(discoSelecionado.getAvaliacao()));
					chckbxDislike.setEnabled(false);
					discosLike.add(discoSelecionado);
					clienteSelecionado.setDiscosLike(discosLike);
					
				}else {
					ArrayList<Disco> discosLike = clienteSelecionado.getDiscosLike();
					Float avaliacao = discoSelecionado.getAvaliacao() - 1;
					discoSelecionado.setAvaliacao(avaliacao);
					lblAvaliacao.setText(String.valueOf(discoSelecionado.getAvaliacao()));
					chckbxDislike.setEnabled(true);
					discosLike.remove(discoSelecionado);
					clienteSelecionado.setDiscosLike(discosLike);
				}
			}
		});
		
		chckbxDislike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDislike.isSelected()) {
					ArrayList<Disco> discosDislike = clienteSelecionado.getDiscosDislike();
					if (discosDislike == null) {
						discosDislike = new ArrayList<>();
					}
					Float avaliacao = discoSelecionado.getAvaliacao() - 1;
					discoSelecionado.setAvaliacao(avaliacao);
					lblAvaliacao.setText(String.valueOf(discoSelecionado.getAvaliacao()));
					chckbxLike.setEnabled(false);
					discosDislike.add(discoSelecionado);
					clienteSelecionado.setDiscosDislike(discosDislike);
				}else {
					ArrayList<Disco> discosDislike = clienteSelecionado.getDiscosDislike();
					Float avaliacao = discoSelecionado.getAvaliacao() + 1;
					discoSelecionado.setAvaliacao(avaliacao);
					lblAvaliacao.setText(String.valueOf(discoSelecionado.getAvaliacao()));
					chckbxLike.setEnabled(true);
					discosDislike.remove(discoSelecionado);
					clienteSelecionado.setDiscosLike(discosDislike);
				}
			}
		});
	}
}
