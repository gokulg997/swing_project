import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Converter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	Double num1,num2,result1,result2;
	String ans,ans2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
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
	public Converter() {
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
		
		textField = new JTextField();
		textField.setBounds(97, 94, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(97, 125, 86, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Height");
		lblNewLabel.setBounds(27, 97, 60, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(27, 128, 60, 17);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblUsMeasurement = new JLabel("US measurement");
		lblUsMeasurement.setBounds(97, 65, 86, 18);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setBounds(227, 65, 60, 18);
		frame.getContentPane().add(lblMetric);
		JLabel l2 = new JLabel("");
		l2.setBounds(227, 97, 46, 14);
		frame.getContentPane().add(l2);
		JLabel l3 = new JLabel("");
		l3.setBounds(227, 128, 46, 14);
		frame.getContentPane().add(l3);
		
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			num1=Double.parseDouble(textField.getText());
			num2=Double.parseDouble(textField_1.getText());
			result1=num1*.12*2.54;
			result2=num2/2.2046;
			ans=String.format("%.2f",result1);
			ans2=String.format("%.2f",result2);
			 l2.setText(ans);
			l3.setText(ans2);
			}
		});
		button.setBounds(97, 184, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(211, 184, 89, 23);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("Help");
		lblNewLabel_1.setBounds(10, 33, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(45, 33, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblM = new JLabel("m");
		lblM.setBounds(296, 97, 46, 14);
		frame.getContentPane().add(lblM);
		
		JLabel lblKg = new JLabel("kg");
		lblKg.setBounds(296, 128, 46, 14);
		frame.getContentPane().add(lblKg);
		
		
		
	}
}
