package sort;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SortDlg extends JDialog {

	private JPanel contentPane;
	private JTextField txtXCoord;
	private JTextField txtYCoord;
	private JTextField txtHeight;
	private JTextField txtWidth;
	public boolean isOk;
	private boolean delete=false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortDlg frame = new SortDlg();
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
	public SortDlg() {
		
		setModal(true);
		setTitle(" II19-2019 Kuzman Sara ");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("X Coordinate");
		
		JLabel lblNewLabel_1 = new JLabel("Y Coordinate");
		
		JLabel lblNewLabel_2 = new JLabel("Width");
		
		JLabel lblNewLabel_3 = new JLabel("Height");
		
		txtXCoord = new JTextField();
		txtXCoord.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
				}
			}
		});
		txtXCoord.setColumns(10);
		
		txtYCoord = new JTextField();
		txtYCoord.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
				}
			}
		});
		
		txtYCoord.setColumns(10);
		
		txtWidth = new JTextField();
		txtWidth.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
				}
			}
		});
		txtWidth.setColumns(10);
		
		txtHeight = new JTextField();
		txtHeight.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
				}
			}
		});
		txtHeight.setColumns(10);
		
		
		
		GroupLayout gl_panelCenter = new GroupLayout(panelCenter);
		gl_panelCenter.setHorizontalGroup(
			gl_panelCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCenter.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
					.addGap(36)
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(203, Short.MAX_VALUE))
		);
		gl_panelCenter.setVerticalGroup(
			gl_panelCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCenter.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panelCenter.setLayout(gl_panelCenter);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(txtXCoord.getText().trim().isEmpty() ||
						txtYCoord.getText().trim().isEmpty() || 
						txtWidth.getText().trim().isEmpty()||
						txtHeight.getText().trim().isEmpty()) {
					
							isOk=false;
							getToolkit().beep();
							JOptionPane.showMessageDialog(null, "Fill in all the blanks", "Error", JOptionPane.ERROR_MESSAGE);
				}else {
					isOk=true;
					dispose();
					
				}
			
			}
		});
		  btnOk.setActionCommand("OK");

          panelSouth.add(btnOk);

          

          getRootPane().setDefaultButton(btnOk);
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setDelete(false);
			}
		});
		panelSouth.add(btnCancel);
	}


	public JTextField getTxtXCoord() {
		return txtXCoord;
	}

	public void setTxtXCoord(JTextField txtXCoord) {
		this.txtXCoord = txtXCoord;
	}

	public JTextField getTxtYCoord() {
		return txtYCoord;
	}

	public void setTxtYCoord(JTextField txtYCoord) {
		this.txtYCoord = txtYCoord;
	}

	public JTextField getTxtHeight() {
		return txtHeight;
	}

	public void setTxtHeight(JTextField txtHeight) {
		this.txtHeight = txtHeight;
	}

	public JTextField getTxtWidth() {
		return txtWidth;
	}

	public void setTxtWidth(JTextField txtWidth) {
		this.txtWidth = txtWidth;
	}

	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	
	
	

}
