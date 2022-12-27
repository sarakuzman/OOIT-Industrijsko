package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestFrame extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<String> dlm = new DefaultListModel<>();
	private JLabel lblPlava;
	private JLabel lblZelena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame frame = new TestFrame();
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
	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("Prvi frejm");
		lblNaslov.setFont(new Font("Serif", Font.BOLD, 20));
		panelNorth.add(lblNaslov);
		
		JPanel panelCentar = new JPanel();
		contentPane.add(panelCentar, BorderLayout.CENTER);
		GridBagLayout gbl_panelCentar = new GridBagLayout();
		gbl_panelCentar.columnWidths = new int[]{0, 0, 0, 50, 0, 0, 0, 0, 0, 0};
		gbl_panelCentar.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCentar.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelCentar.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCentar.setLayout(gbl_panelCentar);
		
		JLabel lblCrvena = new JLabel("Crvena");
		lblCrvena.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblCrvena = new GridBagConstraints();
		gbc_lblCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvena.gridx = 1;
		gbc_lblCrvena.gridy = 1;
		panelCentar.add(lblCrvena, gbc_lblCrvena);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 8;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 7;
		gbc_scrollPane.gridy = 0;
		panelCentar.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(dlm.get(list.getSelectedIndex()).equals(lblCrvena.getText())) {
					panelNorth.setBackground(Color.RED);
					panelCentar.setBackground(Color.RED);
				}else if(dlm.get(list.getSelectedIndex()).equals(lblPlava.getText())) {
					panelNorth.setBackground(Color.BLUE);
					panelCentar.setBackground(Color.BLUE);
				}else if(dlm.get(list.getSelectedIndex()).equals(lblZelena.getText())) {
					panelNorth.setBackground(Color.GREEN);
					panelCentar.setBackground(Color.GREEN);
				}
				
				
			}
		});
		scrollPane.setViewportView(list);
		list.setModel(dlm);
		
		JButton btnCrvena = new JButton("Oboji me");
		btnCrvena.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelNorth.setBackground(Color.RED);
				panelCentar.setBackground(Color.RED);
				dlm.add(0, lblCrvena.getText());
			}
		});
		GridBagConstraints gbc_btnCrvena = new GridBagConstraints();
		gbc_btnCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrvena.gridx = 5;
		gbc_btnCrvena.gridy = 1;
		panelCentar.add(btnCrvena, gbc_btnCrvena);
		
		
		
		
		
		lblPlava = new JLabel("Plava");
		lblPlava.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblPlava = new GridBagConstraints();
		gbc_lblPlava.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlava.gridx = 1;
		gbc_lblPlava.gridy = 3;
		panelCentar.add(lblPlava, gbc_lblPlava);
		
		JButton btnPlava = new JButton("Oboji me");
		btnPlava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelNorth.setBackground(Color.BLUE);
				panelCentar.setBackground(Color.BLUE);
				dlm.add(0, lblPlava.getText());
			}
		});
		GridBagConstraints gbc_btnPlava = new GridBagConstraints();
		gbc_btnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlava.gridx = 5;
		gbc_btnPlava.gridy = 3;
		panelCentar.add(btnPlava, gbc_btnPlava);
		
		lblZelena = new JLabel("Zelena");
		lblZelena.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblZelena = new GridBagConstraints();
		gbc_lblZelena.insets = new Insets(0, 0, 5, 5);
		gbc_lblZelena.gridx = 1;
		gbc_lblZelena.gridy = 5;
		panelCentar.add(lblZelena, gbc_lblZelena);
		
		JButton btnZelena = new JButton("Oboji me");
		btnZelena.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelNorth.setBackground(Color.GREEN);
				panelCentar.setBackground(Color.GREEN);
				dlm.add(0, lblZelena.getText());
			}
		});
		GridBagConstraints gbc_btnZelena = new GridBagConstraints();
		gbc_btnZelena.insets = new Insets(0, 0, 5, 5);
		gbc_btnZelena.gridx = 5;
		gbc_btnZelena.gridy = 5;
		panelCentar.add(btnZelena, gbc_btnZelena);
	}

}
