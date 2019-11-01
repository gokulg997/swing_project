import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	Double num1,num2,result;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI window = new BMI();
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
	public BMI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(50, 205, 50));
		panel.setBounds(0, 0, 536, 73);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblBodyMassIndex.setBounds(134, 23, 225, 27);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(50, 205, 50));
		panel_1.setBounds(0, 84, 536, 204);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(146, 19, 153, 28);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(146, 63, 153, 28);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Height");
		lblNewLabel.setBounds(69, 26, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(69, 70, 46, 14);
		panel_1.add(lblWeight);
		JLabel l2 = new JLabel("");
		l2.setBounds(274, 110, 159, 14);
		panel_1.add(l2);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				result=num2/(num1*num1);
				ans=String.format("%.2f",result);
				textField_2.setText(ans);
				if(result<18.5) {
					l2.setText("Under Weight");}
				
			else if(result<24.9) {
				l2.setText("Normal Weight");}
			else if(result<28.0){
				l2.setText("Over Weight");}
			else {
				l2.setText("Obese");}
			}
							
		});
		btnNewButton.setBounds(146, 150, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		btnClear.setBounds(245, 150, 89, 23);
		panel_1.add(btnClear);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(344, 150, 89, 23);
		panel_1.add(button_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 106, 118, 23);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("BMI");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(69, 110, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(50, 205, 50));
		panel_2.setBounds(0, 299, 536, 162);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
	}

}
