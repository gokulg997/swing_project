import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Sample {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnLogIn;
	private JLabel lblForgotPassword;
	private JButton btnLogOut;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Page");
		frame.getContentPane().setFont(new Font("French Script MT", Font.PLAIN, 16));
		frame.setBounds(100, 100, 450, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnG = new JButton(new ImageIcon("C:\\Users\\USER\\Desktop\\e893d3f4d1ebea537db15134f269c05c.jpg"));
		btnG.setForeground(Color.BLUE);
		btnG.setBackground(Color.RED);
		btnG.setFont(new Font("Times New Roman", Font.BOLD, 42));
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnG.setBounds(-124, 0, 347, 264);
		frame.getContentPane().add(btnG);
		
		JLabel label = new JLabel("");
		label.setBounds(385, 104, 46, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField("GOKULG");
		textField.setBounds(310, 63, 86, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblGokulg = new JLabel("USERNAME");
		lblGokulg.setBounds(248, 63, 74, 22);
		frame.getContentPane().add(lblGokulg);
		
		lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setBounds(233, 104, 69, 14);
		frame.getContentPane().add(lblNewLabel);
		
		btnLogIn = new JButton("LOG IN");
		btnLogIn.setBackground(new Color(70, 130, 180));
		btnLogIn.setBounds(307, 144, 89, 23);
		frame.getContentPane().add(btnLogIn);
		
		lblForgotPassword = new JLabel("FORGOT PASSWORD?");
		lblForgotPassword.setBounds(276, 178, 133, 23);
		frame.getContentPane().add(lblForgotPassword);
		
		btnLogOut = new JButton("LOG OUT");
		btnLogOut.setBounds(310, 215, 89, 23);
		frame.getContentPane().add(btnLogOut);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(310, 98, 86, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblCreateNewAccount = new JLabel("create new account");
		lblCreateNewAccount.setBounds(276, 195, 120, 14);
		frame.getContentPane().add(lblCreateNewAccount);
	}
}
