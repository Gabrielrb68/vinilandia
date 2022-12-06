package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.ClienteControl;
import controle.DiscoControl;
import modelo.Cliente;
import modelo.Disco;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class TelaDesejos extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable tableDesejo;
	private DefaultTableModel modelo;

	/**
	 * Create the frame.
	 */
	public TelaDesejos() {
		setBackground(new Color(128, 128, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("LISTA DE DESEJOS");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
		lblNewLabel.setBounds(40, -35, 371, 138);
		contentPane.add(lblNewLabel);

		JButton btnRemover = new JButton("Remover");
		btnRemover.setBackground(new Color(255, 160, 122));
		btnRemover.setForeground(new Color(255, 255, 255));
		btnRemover.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnRemover.setBounds(335, 77, 89, 23);
		contentPane.add(btnRemover);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(255, 160, 122));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaPadrao telaPadrao = new TelaPadrao();
				telaPadrao.setLocationRelativeTo(null);
				telaPadrao.setVisible(true);
			}
		});
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnVoltar.setBounds(335, 114, 89, 23);
		contentPane.add(btnVoltar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 77, 276, 158);
		contentPane.add(scrollPane);
		
		ClienteControl cC = ClienteControl.getInstancia();
        ArrayList<Disco> listaDiscos = cC.getListaDesejo();
		//ArrayList<Disco> listaDesejo = 
		tableDesejo = new JTable(modelo);
		tableDesejo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int linha = tableDesejo.getSelectedRow();
				Long id = (Long) tableDesejo.getValueAt(linha, 0);
			}
		});
		scrollPane.setViewportView(tableDesejo);
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Nome" });
		tableDesejo.setModel(modelo);

		for (Disco disco : listaDiscos) {
			modelo.addRow(new Object[]{disco.getId(), disco.getNome()});
		}
	}
	
}
