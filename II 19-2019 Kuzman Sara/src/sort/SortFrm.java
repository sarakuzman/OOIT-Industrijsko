package sort;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import drawing.Point;
import drawing.Rectangle;
import stack.StackDlg;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SortFrm extends JFrame {

	private JPanel contentPane;
	
	
	DefaultListModel<String> dlm = new DefaultListModel<String>();
	Stack<Rectangle> stack= new Stack<Rectangle>();
	ArrayList<Rectangle> arrayRect = new ArrayList<>();
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortFrm frame = new SortFrm();
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
	public SortFrm() {
		
		setTitle(" II19-2019 Kuzman Sara ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panelCenter = new GroupLayout(panelCenter);
		gl_panelCenter.setHorizontalGroup(
			gl_panelCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCenter.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelCenter.setVerticalGroup(
			gl_panelCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCenter.createSequentialGroup()
					.addGap(23)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		panelCenter.setLayout(gl_panelCenter);
		list.setModel(dlm);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortDlg sortdlg = new SortDlg();
				sortdlg.setVisible(true);
				
				if(sortdlg.isOk==true) {

					
					Rectangle rec= new Rectangle (new Point (Integer.parseInt(sortdlg.getTxtXCoord().getText()),
							(Integer.parseInt(sortdlg.getTxtYCoord().getText()))),
							(Integer.parseInt(sortdlg.getTxtWidth().getText())),
							(Integer.parseInt(sortdlg.getTxtHeight().getText())));
				
				
					arrayRect.add(rec);
					Collections.sort(arrayRect);
					
					dlm.add(arrayRect.indexOf(rec), " X: " + rec.getUpperLeftPoint().getX() +
							" ,Y: " + rec.getUpperLeftPoint().getY() + 
							" ,Width: " + rec.getWidth() + " ,Height: " + rec.getHeight());
					
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
		        SortDlg sortdlgdelete = new SortDlg();
		        
		        sortdlgdelete.getTxtXCoord().setText(String.valueOf(rec.getUpperLeftPoint().getX()));
		        sortdlgdelete.getTxtYCoord().setText(String.valueOf(rec.getUpperLeftPoint().getY()));
		        sortdlgdelete.getTxtWidth().setText(String.valueOf(rec.getWidth()));
		        sortdlgdelete.getTxtHeight().setText(String.valueOf(rec.getHeight()));

				
				sortdlgdelete.getTxtXCoord().setEditable(false);
				sortdlgdelete.getTxtYCoord().setEditable(false);
				sortdlgdelete.getTxtWidth().setEditable(false);
				sortdlgdelete.getTxtHeight().setEditable(false);
				sortdlgdelete.setVisible(true);				
				
		
				if (sortdlgdelete.isDelete()==true) {
                    arrayRect.remove(0);
                    dlm.removeElementAt(0);
                    
                }
                

            
				
				
			}
		});
		GroupLayout gl_panelSouth = new GroupLayout(panelSouth);
		gl_panelSouth.setHorizontalGroup(
			gl_panelSouth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSouth.createSequentialGroup()
					.addGap(104)
					.addComponent(btnAdd)
					.addGap(37)
					.addComponent(btnRemove)
					.addContainerGap(134, Short.MAX_VALUE))
		);
		gl_panelSouth.setVerticalGroup(
			gl_panelSouth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSouth.createSequentialGroup()
					.addGroup(gl_panelSouth.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(btnRemove))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelSouth.setLayout(gl_panelSouth);
	}

}
