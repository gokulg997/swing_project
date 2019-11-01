import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Temperature2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperature2 window = new Temperature2();
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
	public Temperature2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		double num1 = 0;
		double num2;
		double result;
		String op="",ans;
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 95, 198, 156);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("sqrt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double	num1=Double.parseDouble(textField.getText());
				textField.setText("");
			String	op="stqr";
			}
		});
		btnNewButton_1.setBounds(0, 11, 57, 23);
		panel.add(btnNewButton_1);
		
		JButton btnx = new JButton("1/X");
		btnx.setBounds(67, 11, 57, 23);
		panel.add(btnx);
		
		JButton btnSin = new JButton("sin");
		btnSin.setBounds(131, 11, 57, 23);
		panel.add(btnSin);
		
		JButton button_17 = new JButton("%");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double	num1=Double.parseDouble(textField.getText());
				textField.setText("");
			String	op="-";
			}
		});
		button_17.setBounds(0, 45, 57, 23);
		panel.add(button_17);
		
		JButton btnExp = new JButton("Exp");
		btnExp.setBounds(67, 45, 57, 23);
		panel.add(btnExp);
		
		JButton btnCcos = new JButton("Cos");
		btnCcos.setBounds(131, 45, 57, 23);
		panel.add(btnCcos);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.setBounds(0, 81, 57, 23);
		panel.add(btnXy);
		
		JButton btnX = new JButton("X^2");
		btnX.setBounds(0, 115, 57, 23);
		panel.add(btnX);
		
		JButton btnIn = new JButton("In");
		btnIn.setBounds(67, 81, 57, 23);
		panel.add(btnIn);
		
		JButton btnN = new JButton("n!");
		btnN.setBounds(67, 115, 57, 23);
		panel.add(btnN);
		
		JButton btnTan = new JButton("tan");
		btnTan.setBounds(131, 79, 57, 23);
		panel.add(btnTan);
		
		JButton btnSec = new JButton("sec");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSec.setBounds(131, 115, 57, 23);
		panel.add(btnSec);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(228, 95, 196, 156);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton.getText();
				textField.setText(Number);
			}
		});
		btnNewButton.setBounds(0, 11, 42, 28);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setBounds(52, 11, 42, 28);
		panel_1.add(button);
		
		JButton button_1 = new JButton("9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBounds(101, 11, 42, 28);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Double num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 String op="/";
			}
		});
		button_2.setBounds(154, 11, 42, 28);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setBounds(0, 45, 42, 28);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("1");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		button_4.setBounds(0, 87, 42, 28);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("0");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setBounds(0, 128, 42, 28);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setBounds(52, 48, 42, 28);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBounds(101, 50, 42, 28);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double num1=Double.parseDouble(textField.getText());
				textField.setText("");
				String op="*";
			}
		});
		button_8.setBounds(154, 50, 42, 28);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("2");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(52, 90, 42, 28);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("3");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
			textField.setText(Number);
			}
		});
		button_10.setBounds(101, 90, 42, 28);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Double	num1=Double.parseDouble(textField.getText());
				textField.setText("");
			String	op="-";
			}
		});
		button_11.setBounds(154, 90, 42, 28);
		panel_1.add(button_11);
		
		JButton button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		button_12.setBounds(52, 128, 42, 28);
		panel_1.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				Double result;
				
				 Double num2=Double.parseDouble(textField.getText());
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
				if(op=="sqrt"){
					result=Math.sqrt(num1);
					ans=String.format("%.2f",result);
					textField.setText(ans);}

			}
		});
		button_13.setBounds(101, 128, 42, 28);
		panel_1.add(button_13);
		
		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double num1=Double.parseDouble(textField.getText());
				textField.setText("");
				String op="+";
			}
		});
		button_14.setBounds(154, 128, 42, 28);
		panel_1.add(button_14);
		
		textField = new JTextField();
		textField.setBounds(10, 29, 401, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSceintific = new JLabel("Sceintific");
		lblSceintific.setBounds(20, 81, 46, 14);
		frame.getContentPane().add(lblSceintific);
		
		JLabel lblStanderd = new JLabel("Standerd");
		lblStanderd.setBounds(244, 81, 46, 14);
		frame.getContentPane().add(lblStanderd);
		
		JLabel lblNewLabel = new JLabel("Edit");
		lblNewLabel.setBounds(10, 4, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(42, 4, 46, 14);
		frame.getContentPane().add(lblView);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(80, 4, 46, 14);
		frame.getContentPane().add(lblHelp);
	}

}
