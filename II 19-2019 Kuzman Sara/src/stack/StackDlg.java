package stack;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class StackDlg extends JDialog {

	private final JPanel pnlCenter = new JPanel();
	private JButton okButton;
	private JButton cancelButton;
	private JTextField txtXCoord;
	private JTextField txtYCoord;
	private JTextField txtWidth;
	private JTextField txtHeight;
	public boolean isOk;
	private boolean delete=false;
	


	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			StackDlg dialog = new StackDlg();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public StackDlg() {
		
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		pnlCenter.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("X coordinate");
		
		JLabel lblNewLabel_1 = new JLabel("Y coordinate");
		
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
		
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(243, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		pnlCenter.setLayout(gl_pnlCenter);
		{
			JPanel pnlBtn = new JPanel();
			getContentPane().add(pnlBtn, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
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
							deleteRectangle();
						}
					
					}
					
				});
				okButton.setActionCommand("OK");
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						setDelete(false);
						
					}

					private void setDelete(boolean b) {
						// TODO Auto-generated method stub
						
					}
				});
				cancelButton.setActionCommand("Cancel");
			}
			GroupLayout gl_pnlBtn = new GroupLayout(pnlBtn);
			gl_pnlBtn.setHorizontalGroup(
				gl_pnlBtn.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_pnlBtn.createSequentialGroup()
						.addGap(219)
						.addComponent(okButton)
						.addGap(18)
						.addComponent(cancelButton)
						.addGap(91))
			);
			gl_pnlBtn.setVerticalGroup(
				gl_pnlBtn.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_pnlBtn.createSequentialGroup()
						.addGroup(gl_pnlBtn.createParallelGroup(Alignment.BASELINE)
							.addComponent(okButton)
							.addComponent(cancelButton))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			pnlBtn.setLayout(gl_pnlBtn);
		}
	}

	protected void deleteRectangle() {
		// TODO Auto-generated method stub
		
	}

	public JTextComponent getTxtXCoord() {
		// TODO Auto-generated method stub
		return txtXCoord;
	}

	public JTextComponent getTxtYCoord() {
		// TODO Auto-generated method stub
		return txtYCoord;
	}

	public JTextComponent getTxtWidth() {
		// TODO Auto-generated method stub
		return txtWidth;
	}

	public JTextComponent getTxtHeight() {
		// TODO Auto-generated method stub
		return txtHeight;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}

	public boolean isDelete() {
		// TODO Auto-generated method stub
		return false;
	}
}
