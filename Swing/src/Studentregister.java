import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.AncestorEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;

public class Studentregister {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table;
	private JTable table_1;
	double total;
	double avg;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentregister window = new Studentregister();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Studentregister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 1000, 664);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 404, 374);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Students ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 65, 67, 14);
		panel.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirstName.setBounds(10, 101, 67, 14);
		panel.add(lblFirstName);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 115, 46, 14);
		panel.add(label_1);
		
		JLabel lblSecondName = new JLabel("SurName");
		lblSecondName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSecondName.setBounds(10, 134, 67, 14);
		panel.add(lblSecondName);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCourseCode.setBounds(10, 159, 67, 14);
		panel.add(lblCourseCode);
		
		JLabel lblTotalScore = new JLabel("Total Score ");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalScore.setBounds(10, 218, 67, 14);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAverage.setBounds(10, 260, 67, 14);
		panel.add(lblAverage);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRanking.setBounds(10, 293, 67, 14);
		panel.add(lblRanking);
		
		textField = new JTextField();
		textField.setBounds(87, 62, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(87, 98, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(87, 131, 86, 20);
		panel.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(87, 215, 86, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(87, 257, 86, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(87, 290, 86, 20);
		panel.add(textField_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 189, 163, 18);
		panel.add(separator);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMaths.setBounds(183, 65, 64, 14);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnglish.setBounds(183, 101, 64, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBiology.setBounds(183, 134, 64, 14);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComputer.setBounds(183, 162, 73, 14);
		panel.add(lblComputer);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhysics.setBounds(183, 193, 64, 14);
		panel.add(lblPhysics);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChemistry.setBounds(183, 234, 73, 14);
		panel.add(lblChemistry);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTamil.setBounds(183, 277, 73, 14);
		panel.add(lblTamil);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMalayalam.setBounds(183, 314, 73, 14);
		panel.add(lblMalayalam);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
						evt.consume();
				}
			}
		});
		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(266, 62, 86, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(266, 98, 86, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(266, 131, 86, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(266, 156, 86, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(266, 190, 86, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(266, 231, 86, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(266, 274, 86, 20);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(266, 311, 86, 20);
		panel.add(textField_14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"me123", "cs234", "ce345", "bt456"}));
		comboBox.setBounds(87, 156, 86, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Students Record", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(424, 11, 503, 382);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 73, 67, -34);
		panel_1.add(separator_1);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(-461, 417, 964, 179);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		table_2 = new JTable();
		table_2.setBounds(482, 5, 0, 0);
		panel_2.add(table_2);
		
		table = new JTable();
		table.setBounds(487, 5, 0, 0);
		panel_2.add(table);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 21, 321, 324);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
			}
		});
		btnClear.setBounds(169, 356, 89, 23);
		panel_1.add(btnClear);
		DefaultTableModel model=(DefaultTableModel) table.getModel();
		model.addRow(new String[] {
		textField.getText(),
		(String) comboBox.getSelectedItem(),
		textField_7.getText(),
		textField_8.getText(),
		textField_9.getText(),
		textField_10.getText(),
		textField_11.getText(),
		textField_12.getText(),
		textField_13.getText(),
		textField_14.getText(),
		textField_4.getText(),
		textField_5.getText(),
		textField_6.getText()
		});
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID","Course Code","Maths","English","Biology","Computer","Chemistry","Physics","Tamil","Malayalam","Total Score","Average","Ranking"},
			},

			
			new String[] {
					"Student_ID","Course Code","Maths","English","Biology","Computer","Chemistry","Physics","Tamil","Malayalam","Total Score","Average","Ranking"
			}
		));
		table_2.setBounds(10, 409, 918, 90);
		frame.getContentPane().add(table_2);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double t1 = Double.parseDouble(textField_7.getText());
	               double t2 = Double.parseDouble(textField_8.getText());
	               double t3 = Double.parseDouble(textField_9.getText());
	               double t4 = Double.parseDouble(textField_10.getText());
	               double t5 = Double.parseDouble(textField_11.getText());
	               double t6 = Double.parseDouble(textField_12.getText());
	               double t7 = Double.parseDouble(textField_13.getText());
	               double t8 = Double.parseDouble(textField_14.getText());
	               total = t1+t2+t3+t4+t5+t6+t7+t8;
	               String c = String.format("%.2f", total);
	               textField_4.setText(c);
	               avg = total/8;
	               String a = String.format("%.2f", avg);
	               textField_5.setText(a);
	               if(total>700)
	               {
	                   textField_6.setText("1");
	               }
	               else if(total>600 && total<700)
	               {
	                   textField_6.setText("2");
	               }
	               else if(total>500 && total<600)
	               {
	                   textField_6.setText("3");
	               }
	               else if(total>300 && total<500)
	               {
	                   textField_6.setText("4");
	               }
	               else if(total>100 && total<300)
	               {
	                   textField_6.setText("5");
	               }
	               else
	               {
	                   textField_6.setText("Fail");
	               }
	               DefaultTableModel model=(DefaultTableModel)table_2.getModel();
	              model.addRow(new String[] {
	                      textField.getText(),
	                      (String) comboBox.getSelectedItem(),
	                      textField_7.getText(),
	                      textField_8.getText(),
	                      textField_9.getText(),
	                      textField_10.getText(),
	                      textField_11.getText(),
	                      textField_12.getText(),
	                      textField_13.getText(),
	                      textField_14.getText(),
	                      textField_4.getText(),
	                      textField_5.getText(),
	                      textField_6.getText(),


	});
			}
		});
		btnAddReport.setForeground(new Color(154, 205, 50));
		btnAddReport.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAddReport.setBounds(325, 534, 89, 23);
		frame.getContentPane().add(btnAddReport);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table_2.getModel();
		        try
		        {
		            int rownum = table_2.getSelectedRow();
		            model.removeRow(rownum);
		        }
		        catch(Exception msg)
		        {
		            JOptionPane.showMessageDialog(null,"Please choose the particular row");
		        }


			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(443, 534, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnShowReport_2 = new JButton("Show Report");
		btnShowReport_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Report\n"+
						"Student Name:\t\t"+textField_1.getText()
						+textField_2.getText()+"\n===========================================================\t\t"
						+"\nMaths:\t\t"+textField_7.getText()
						+"\nEnglish:\t\t"+textField_8.getText()
						+"\nBiology:\t\t"+textField_9.getText()
						+"\nComputer:\t\t"+textField_10.getText()
						+"\nChemistry:\t\t"+textField_11.getText()
						+"\nPhysics:\t\t"+textField_12.getText()
						+"\nTamil:\t\t"+textField_13.getText()
						+"\nMalayalam:\t\t"+textField_14.getText()+"\n===========================================================\t\t"+"\nTotal score:\t\t"+textField_4.getText()+"\nAverage:\t\t"
								+textField_5.getText()+"\nRanking:\t\t"+textField_6.getText());
				
				        
						}
			
		});
		DefaultTableModel model_2=(DefaultTableModel) table_2.getModel();
		model_2.addRow(new String[] {
		textField.getText(),
		(String) comboBox.getSelectedItem(),
		textField_7.getText(),
		textField_8.getText(),
		textField_9.getText(),
		textField_10.getText(),
		textField_11.getText(),
		textField_12.getText(),
		textField_13.getText(),
		textField_14.getText(),
		textField_4.getText(),
		textField_5.getText(),
		textField_6.getText()
		});
		btnShowReport_2.setForeground(new Color(0, 0, 255));
		btnShowReport_2.setBounds(560, 534, 89, 23);
		frame.getContentPane().add(btnShowReport_2);
		
		JButton btnExit_2 = new JButton("Exit");
		btnExit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame, "Comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
					}

			}
		});
		btnExit_2.setForeground(new Color(255, 0, 0));
		btnExit_2.setBounds(672, 534, 89, 23);
		frame.getContentPane().add(btnExit_2);
		
		JButton btnNewButton_3 = new JButton("Reset");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);


				
			

			}
		});
		btnNewButton_3.setForeground(new Color(255, 0, 255));
		btnNewButton_3.setBounds(787, 534, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		textArea.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		
		JButton btnNewButton = new JButton("Add Report");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
				textField.getText(),
				(String) comboBox.getSelectedItem(),
				textField_7.getText(),
				textField_8.getText(),
				textField_9.getText(),
				textField_10.getText(),
				textField_11.getText(),
				textField_12.getText(),
				textField_13.getText(),
				textField_14.getText(),
				textField_4.getText(),
				textField_5.getText(),
				textField_6.getText()


				
			
		});
		btnNewButton.setBounds(191, 592, 103, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(329, 592, 103, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Report\n"+
						"Student Name:\t\t"+textField_1.getText()+textField_2.getText()
						//+==================================+
						+"\nMaths:\t\t"+textField_6.getText()
						+"\nEnglish:\t\t"+textField_7.getText()
						+"\nBiology:\t\t"+textField_8.getText()
						+"\nComputer:\t\t"+textField_9.getText()
						+"\nChemistry:\t\t"+textField_10.getText()
						+"\nPhysics:\t\t"+textField_11.getText()
						+"\nTamil:\t\t"+textField_12.getText()
						+"\nMalayalam:\t\t"+textField_13.getText());
						
				}
		});
		btnShowReport.setBounds(470, 592, 110, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(618, 592, 110, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(751, 592, 120, 23);
		frame.getContentPane().add(btnReset);
	}
});
		}	
}
