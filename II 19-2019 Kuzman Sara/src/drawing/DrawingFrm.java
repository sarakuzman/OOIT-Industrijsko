package drawing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class DrawingFrm extends JFrame {

	
	

	static Color outline=Color.BLACK;
	static Color area=Color.WHITE;
	public static Color fill;
	private JPanel contentPane;
	private PnlDrawing pnlDrawing= new PnlDrawing();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawingFrm frame = new DrawingFrm();
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
	public DrawingFrm() {
		setTitle(" II19-2019 Kuzman Sara ");
		setBounds(200, 200, 750, 690);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        pnlDrawing.setBackground(Color.WHITE);
        pnlDrawing.setBorder(null);
        contentPane.add(pnlDrawing,BorderLayout.CENTER);
        
		JPanel panelBtn = new JPanel();
		contentPane.add(panelBtn, BorderLayout.EAST);
		
		JButton btnPoint = new JButton("Point");
        btnPoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	PnlDrawing.obj=1;
            	
            	for(Shape shape : PnlDrawing.shapesArrList ) {
					shape.setSelected(false);
					
            }
            }
        });
		
        JButton btnLine = new JButton("Line");
        btnLine.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		PnlDrawing.obj=2;
        		for(Shape shape : PnlDrawing.shapesArrList ) {
					shape.setSelected(false);
					
            }
        	}
        	
        });

        JButton btnRectangle = new JButton("Rectangle");
        btnRectangle.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		PnlDrawing.obj=3;
        		for(Shape shape : PnlDrawing.shapesArrList ) {
					shape.setSelected(false);
					
            }
        	}
        	
        });

        JButton btnCircle = new JButton("Circle");
        btnCircle.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		PnlDrawing.obj=4;
        		for(Shape shape : PnlDrawing.shapesArrList ) {
					shape.setSelected(false);
					
            }
        	}
        });

        JButton btnDonut = new JButton("Donut");
        btnDonut.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		PnlDrawing.obj=5;
        		for(Shape shape : PnlDrawing.shapesArrList ) {
					shape.setSelected(false);
					
            }
        	}
        });

        JButton btnSelect = new JButton("Select");
        btnSelect.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if (PnlDrawing.shapesArrList.isEmpty()) {
        			JOptionPane.showMessageDialog(null, "Nothing to select!", "Information", JOptionPane.INFORMATION_MESSAGE);
        			return;
        		}else {
        			
        		PnlDrawing.obj=6;
        		
        		}
        		
        	}
        });

        JButton btnModify = new JButton("Modify");
        btnModify.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		for(Shape shape: PnlDrawing.shapesArrList) {
        			if(shape.isSelected()) {
        				shape.DialogEdit();
        				repaint();
        				return;
        			}
        		}
        		JOptionPane.showMessageDialog(null,"Please select an object to modify","Error",
        				JOptionPane.INFORMATION_MESSAGE);
        		
        	}
        });

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if(PnlDrawing.shapesArrList.isEmpty()) {
        			JOptionPane.showMessageDialog(null, "Nothing to delete!","Error",
        					JOptionPane.ERROR_MESSAGE);
        			return;
        		}
        		for (Shape shape : pnlDrawing.shapesArrList) {
        			if(shape.isSelected()) {
        				int ans = JOptionPane.showConfirmDialog(null,
        						"Are you sure you want to delete the selected object?",
        						"Warning",JOptionPane.YES_NO_OPTION);
        				if(ans==0) {
        					PnlDrawing.shapesArrList.remove(shape);
        				}
        				return;
        			}
        		}
        		JOptionPane.showMessageDialog(null,"Please select an object","Erroe", JOptionPane.INFORMATION_MESSAGE);
        	}
        	
        });

        JButton btnOutlineColor = new JButton("Outline Color");
        btnOutlineColor.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		outline = JColorChooser.showDialog(null, "Choose a color", Color.BLACK);
        		if(outline==null) {
        			outline=Color.BLACK;
        		}
        	}
        });

        JButton btnAreaColor = new JButton("Area Color");
        btnAreaColor.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		area = JColorChooser.showDialog(null, "Choose a color", Color.WHITE);
        		if(area==null) {
        			area=Color.WHITE;
        		}
        	}
        });

        
        
        
        GroupLayout gl_panelBtn = new GroupLayout(panelBtn);
        gl_panelBtn.setHorizontalGroup(
            gl_panelBtn.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panelBtn.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_panelBtn.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panelBtn.createSequentialGroup()
                            .addComponent(btnAreaColor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(Alignment.TRAILING, gl_panelBtn.createSequentialGroup()
                            .addGroup(gl_panelBtn.createParallelGroup(Alignment.TRAILING)
                                .addComponent(btnPoint, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(btnLine, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(btnRectangle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(btnCircle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(btnDonut, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(btnSelect, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(btnModify, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(btnDelete, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(btnOutlineColor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())))
        );
		
        gl_panelBtn.setVerticalGroup(
                gl_panelBtn.createParallelGroup(Alignment.LEADING)
                    .addGroup(gl_panelBtn.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPoint)
                        .addGap(12)
                        .addComponent(btnLine)
                        .addGap(18)
                        .addComponent(btnRectangle)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(btnCircle)
                        .addGap(18)
                        .addComponent(btnDonut)
                        .addGap(18)
                        .addComponent(btnSelect)
                        .addGap(18)
                        .addComponent(btnModify)
                        .addGap(18)
                        .addComponent(btnDelete)
                        .addGap(18)
                        .addComponent(btnOutlineColor)
                        .addGap(18)
                        .addComponent(btnAreaColor)
                        .addContainerGap(51, Short.MAX_VALUE))
            
		);
		panelBtn.setLayout(gl_panelBtn);
	}
}
