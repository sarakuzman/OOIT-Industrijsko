package drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class DlgLine extends JDialog {

	private Color outline =Color.BLACK;
	private boolean outlineBool;
	private final JPanel pnlCenter = new JPanel();
	private JTextField txtXStart;
	private JTextField txtYStart;
	private JTextField txtXEnd;
	private JTextField txtYEnd;
	
	

	public Color getOutline() {
		return outline;
	}

	public void setOutline(Color outline) {
		this.outline = outline;
	}

	public boolean isOutlineBool() {
		return outlineBool;
	}

	public void setOutlineBool(boolean outlineBool) {
		this.outlineBool = outlineBool;
	}

	public JTextField getTxtXStart() {
		return txtXStart;
	}

	public void setTxtXStart(JTextField txtXStart) {
		this.txtXStart = txtXStart;
	}

	public JTextField getTxtYStart() {
		return txtYStart;
	}

	public void setTxtYStart(JTextField txtYStart) {
		this.txtYStart = txtYStart;
	}

	public JTextField getTxtXEnd() {
		return txtXEnd;
	}

	public void setTxtXEnd(JTextField txtXEnd) {
		this.txtXEnd = txtXEnd;
	}

	public JTextField getTxtYEnd() {
		return txtYEnd;
	}

	public void setTxtYEnd(JTextField txtYEnd) {
		this.txtYEnd = txtYEnd;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgLine dialog = new DlgLine();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgLine() {
		
		setModal(true);
		setTitle(" II19-2019 Kuzman Sara ");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		pnlCenter.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel("X start:");
		JLabel lblNewLabel_1 = new JLabel("Y start:");
		JLabel lblNewLabel_2 = new JLabel("X end:");
		JLabel lblNewLabel_3 = new JLabel("Y end:");
		txtXStart = new JTextField();
		txtXStart.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtXStart.setColumns(10);
		txtYStart = new JTextField();
		txtYStart.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtYStart.setColumns(10);
		txtXEnd = new JTextField();
		txtXEnd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtXEnd.setColumns(10);
		txtYEnd = new JTextField();
		txtYEnd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtYEnd.setColumns(10);
		
		JButton btnOutlineClr = new JButton("Outline color");
		btnOutlineClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				outline=  JColorChooser.showDialog(null, "Choose a color. ", Color.BLACK);
				outlineBool=true;
			}
		});
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(btnOutlineClr)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(47)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(txtYEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtXEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtYStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtXStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(185, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtXStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtYStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtXEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtYEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnOutlineClr)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlCenter.setLayout(gl_pnlCenter);
		{
			JPanel pnlButton = new JPanel();
			pnlButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(pnlButton, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(txtXStart.getText().trim().isEmpty() ||
								txtYStart.getText().trim().isEmpty()||
								txtXEnd.getText().trim().isEmpty()||
								txtYEnd.getText().trim().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Enter in all the values!",
										"Error", JOptionPane.INFORMATION_MESSAGE);
								dispose();
							}else {
								for(Shape shape : PnlDrawing.shapesArrList ) {
									if(shape.isSelected()) {
										
										((Line)shape).setStart(new Point
												(Integer.parseInt(txtXStart.getText()),
												Integer.parseInt(txtYStart.getText())));
										
										((Line)shape).setEnd(new Point
												(Integer.parseInt(txtXEnd.getText()),
												Integer.parseInt(txtYEnd.getText())));
										
										if (outlineBool==true) { 
											shape.setOutline(outline);
											outlineBool=false;
									}
							}
					}
				}
						dispose();
						return;
					}
				});
				okButton.setActionCommand("OK");
				pnlButton.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				pnlButton.add(cancelButton);
			}
		}
	}

	
	
}
