import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	private JButton button_19;
	private JButton button_20;
	private JButton button_21;
	private JButton button_22;
	private JButton button_23;
	double num1;
	double num2;
	double result;
	String op,ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(40, 0, 334, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(25, 92, 89, 23);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(124, 92, 89, 23);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(223, 92, 89, 23);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(335, 92, 89, 23);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(25, 126, 89, 23);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(124, 126, 89, 23);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(223, 126, 89, 23);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("-");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_7.setBounds(335, 126, 89, 23);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("7");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.setBounds(25, 162, 89, 23);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("8");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(124, 162, 89, 23);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("9");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.setBounds(223, 162, 89, 23);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_11.setBounds(335, 162, 89, 23);
		frame.getContentPane().add(button_11);
		
		button_12 = new JButton(".");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_12.setBounds(25, 196, 89, 23);
		frame.getContentPane().add(button_12);
		
		button_13 = new JButton("0");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_13.getText();
				textField.setText(Number);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_13.setBounds(124, 196, 89, 23);
		frame.getContentPane().add(button_13);
		
		button_14 = new JButton("c");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		button_14.setBackground(new Color(240, 128, 128));
		button_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_14.setBounds(223, 196, 89, 23);
		frame.getContentPane().add(button_14);
		
		button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_15.setBounds(335, 196, 89, 23);
		frame.getContentPane().add(button_15);
		
		button_16 = new JButton("%");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_16.setBounds(25, 228, 89, 23);
		frame.getContentPane().add(button_16);
		
		button_17 = new JButton("00");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_17.getText();
				textField.setText(Number);
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_17.setBounds(124, 230, 89, 23);
		frame.getContentPane().add(button_17);
		
		button_18 = new JButton("B");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B=null;
				if(textField.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					B=strB.toString();
					textField.setText(B);
				}
			}
		});
		button_18.setBackground(new Color(128, 128, 0));
		button_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_18.setBounds(223, 228, 89, 23);
		frame.getContentPane().add(button_18);
		
		button_19 = new JButton("=");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+") {
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);}
				if(op=="-"){
					result=num1-num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);}
				if(op=="*"){
					result=num1*num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);}
				if(op=="/"){
					result=num1/num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);}			
				if(op=="%"){
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);}			
				
				
			}
		});
		button_19.setBackground(new Color(255, 255, 255));
		button_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_19.setBounds(335, 228, 89, 23);
		frame.getContentPane().add(button_19);
		
		button_20 = new JButton("OFF");
		button_20.setBackground(new Color(30, 144, 255));
		button_20.setBounds(335, 58, 89, 23);
		frame.getContentPane().add(button_20);
		
		button_21 = new JButton("ON");
		button_21.setBackground(new Color(255, 99, 71));
		button_21.setForeground(new Color(0, 0, 0));
		button_21.setBounds(223, 58, 89, 23);
		frame.getContentPane().add(button_21);
		
		button_22 = new JButton(")");
		button_22.setBounds(124, 58, 89, 23);
		frame.getContentPane().add(button_22);
		
		button_23 = new JButton("(");
		button_23.setBounds(25, 58, 89, 23);
		frame.getContentPane().add(button_23);
	}

}
