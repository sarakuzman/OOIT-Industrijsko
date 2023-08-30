package stack;

import java.awt.EventQueue;
import java.util.Stack;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import drawing.Point;
import drawing.Rectangle;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class StackFrm extends JFrame {

	public boolean isOk;
	private JPanel contentPane;
	

	DefaultListModel<String> dlm = new DefaultListModel<String>();
	Stack<Rectangle> stack= new Stack<Rectangle>();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StackFrm frame = new StackFrm();
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
	public StackFrm() {
		

		
		setTitle(" II19-2019 Kuzman Sara ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		
		JList list = new JList();
		scrollPane.setRowHeaderView(list);
		pnlCenter.setLayout(gl_pnlCenter);
		list.setModel(dlm);
		

	
		JPanel pnlDown = new JPanel();
		contentPane.add(pnlDown, BorderLayout.SOUTH);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StackDlg stackdlg = new StackDlg();
				stackdlg.setVisible(true);
				if(stackdlg.isOk==true) {

					
					Rectangle rec= new Rectangle (new Point (Integer.parseInt(stackdlg.getTxtXCoord().getText()),
							(Integer.parseInt(stackdlg.getTxtYCoord().getText()))),
							(Integer.parseInt(stackdlg.getTxtWidth().getText())),
							(Integer.parseInt(stackdlg.getTxtHeight().getText())));
					stack.push(rec);
					dlm.add(0, "X: " + rec.getUpperLeftPoint().getX() + " , Y : " + rec.getUpperLeftPoint().getY() + 
							" , Width : " + rec.getWidth() + ", Height : " +  rec.getHeight());
					
					list.validate();
					System.out.println(stack);
				}
				setDelete(true);
				


			}

			private void setDelete(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dlm.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nothing to remove", "Error", JOptionPane.ERROR_MESSAGE);
					getToolkit().beep();
					return;
				}
				
				
				Rectangle rec = stack.peek();
		        StackDlg stackdlgdelete = new StackDlg();
		        
		        stackdlgdelete.getTxtXCoord().setText(String.valueOf(rec.getUpperLeftPoint().getX()));
		        stackdlgdelete.getTxtYCoord().setText(String.valueOf(rec.getUpperLeftPoint().getY()));
		        stackdlgdelete.getTxtWidth().setText(String.valueOf(rec.getWidth()));
		        stackdlgdelete.getTxtHeight().setText(String.valueOf(rec.getHeight()));

				
				stackdlgdelete.getTxtXCoord().setEditable(false);
				stackdlgdelete.getTxtYCoord().setEditable(false);
				stackdlgdelete.getTxtWidth().setEditable(false);
				stackdlgdelete.getTxtHeight().setEditable(false);
				stackdlgdelete.setVisible(true);
				
				
		
				if (stackdlgdelete.isDelete()==true) {
                    stack.pop();
                    dlm.removeElementAt(0);
                    deleteRectangle();
                }

            }

        
			
			private void deleteRectangle() {
				// TODO Auto-generated method stub
				
			}
		});
		
		GroupLayout gl_pnlDown = new GroupLayout(pnlDown);
		gl_pnlDown.setHorizontalGroup(
			gl_pnlDown.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlDown.createSequentialGroup()
					.addGap(82)
					.addComponent(btnAdd)
					.addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
					.addComponent(btnRemove)
					.addGap(103))
		);
		gl_pnlDown.setVerticalGroup(
			gl_pnlDown.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pnlDown.createSequentialGroup()
					.addGroup(gl_pnlDown.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRemove)
						.addComponent(btnAdd))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlDown.setLayout(gl_pnlDown);
		
	}
}
