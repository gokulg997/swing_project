import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class ticket {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
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
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 22));
		frame.setBounds(100, 100, 867, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(234, 29, 331, 39);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(444, 97, 364, 320);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 59, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 57, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setBounds(10, 124, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(10, 166, 46, 14);
		panel_1.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(10, 210, 46, 14);
		panel_1.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(10, 255, 46, 14);
		panel_1.add(lblTime);
		
		JLabel lblTicketNo = new JLabel("Ticket No.");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTicketNo.setBounds(208, 124, 86, 14);
		panel_1.add(lblTicketNo);
		
		JLabel lblPrize = new JLabel("Prize");
		lblPrize.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrize.setBounds(208, 178, 46, 14);
		panel_1.add(lblPrize);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRoute.setBounds(208, 233, 46, 14);
		panel_1.add(lblRoute);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(66, 121, 86, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(66, 163, 86, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(66, 207, 86, 20);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(66, 252, 86, 20);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(208, 149, 86, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(208, 203, 86, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(208, 258, 86, 20);
		panel_1.add(textField_8);
		
		JButton btnNewButton_3 = new JButton("Confirm");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel model=(DefaultTableModel)table_1.getModel();
	              model.addRow(new String[] {
	                      textField_1.getText(),
	                     // (String) comboBox.getSelectedItem(),
	                      textField_7.getText(),
	                      textField_8.getText(),
	                      textField_9.getText(),
	                      textField_10.getText(),
	                      textField_11.getText(),
	                      textField_12.getText(),
	                     // textField_13.getText(),
	                      //textField_14.getText(),
	                      textField_4.getText(),
	                      textField_5.getText(),
	                      textField_6.getText(),});
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(127, 286, 89, 23);
		panel_1.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(63, 60, 312, -138);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Name");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(48, 132, 46, 14);
		frame.getContentPane().add(label);
		
		textField_9 = new JTextField();
		textField_9.setBounds(112, 130, 114, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(6, 157, 369, 12);
		frame.getContentPane().add(separator);
		
		JRadioButton std = new JRadioButton("Standerd");
		std.setBounds(6, 166, 109, 23);
		frame.getContentPane().add(std);
		
		JRadioButton single = new JRadioButton("Single Ticket");
		single.setBounds(117, 166, 109, 23);
		frame.getContentPane().add(single);
		
		JRadioButton adult = new JRadioButton("Adult");
		adult.setBounds(228, 166, 109, 23);
		frame.getContentPane().add(adult);
		
		JRadioButton firstclass = new JRadioButton("First Class");
		firstclass.setBounds(6, 202, 109, 23);
		frame.getContentPane().add(firstclass);
		
		JRadioButton ac = new JRadioButton("AC");
		ac.setBounds(117, 202, 46, 23);
		frame.getContentPane().add(ac);
		
		JRadioButton child = new JRadioButton("Child");
		child.setBounds(266, 202, 109, 23);
		frame.getContentPane().add(child);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selected...", "Andra", "Kerala", "Karnataka ", "Tamilnadu", "Goa", "Gujarath"}));
		comboBox.setBounds(10, 254, 105, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Selected...", "Andra", "Kerala", "Karnataka ", "Tamilnadu", "Goa", "Gujarath", ""}));
		comboBox_1.setBounds(125, 254, 102, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"No.of seats", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(237, 254, 100, 20);
		frame.getContentPane().add(comboBox_2);
		
		JRadioButton sleeper = new JRadioButton("Sleeper");
		sleeper.setBounds(183, 202, 70, 23);
		frame.getContentPane().add(sleeper);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 291, 369, 12);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(6, 424, 369, 12);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tax");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(34, 311, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sub Total");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(34, 350, 68, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(34, 391, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_10 = new JTextField();
		textField_10.setBounds(112, 309, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(112, 348, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(112, 389, 86, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_9.getText());
				String a=(String)comboBox.getSelectedItem();
				textField_2.setText(a);
				String b=(String)comboBox_1.getSelectedItem();
				textField_3.setText(b);
				//Time
				                Calendar timer=Calendar.getInstance();
				                timer.getTime();
				                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				                textField_5.setText(tTime.format(timer.getTime()));
				                //Date
				                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
				                textField_4.setText(tdate.format(timer.getTime()));
				                textField_8.setText("Any");
				                int num;
				                String s="";
				                num=1325;
				                s=s+num+1325;
				                textField_6.setText(s);
				                double t=0;
				                String m="";
				                if(single.isSelected()) {
				                t=t+500;
				                }
				                else
				                {
				                t=t+300;
				                }
				                if(sleeper.isSelected())
				                {
				                t=t+500;
				               
				                }
				                else
				                {
				                t=t+300;
				                }
				                m=m+t;
				                textField_11.setText(m);
				                double[]tot=new double[15];
				                double tot1 = Double.parseDouble(textField_10.getText());
				                double tot2 = Double.parseDouble(textField_11.getText());
				                double tot3 = (tot1+tot2);
				                String total=String.format("%.2f",tot3);
				                textField_12.setText(total);




				                			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(26, 443, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
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
				//textField_13.setText(null);
				//textField_14.setText(null);


				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(137, 443, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame, "Comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(248, 443, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 255));
		panel_2.setBounds(48, 490, 808, 144);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(10, 22, 788, 111);
		panel_2.add(table_1);
		//table_1.addAncestorListener(new AncestorListener() {
			//public void ancestorAdded(AncestorEvent event) {
			//}
			//public void ancestorMoved(AncestorEvent event) {
			//}
			//public void ancestorRemoved(AncestorEvent event) {
			//}
		//});
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No.of seats", "Time", "Date", "AC/Non-AC", "Price"},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Name", "Booking No", "From", "To", "No.of seats", "Time", "Date", "AC/Non-AC", "Price"
			}
		));
		
		
		
	}}