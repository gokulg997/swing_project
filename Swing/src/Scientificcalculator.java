import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;

public class Scientificcalculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op,ans;
	//private JTextField textField_1;
	double India=1;
	double China=10.05;
	double US=70.94;
	double Dubai=19.32;
	private JTextField textField_2;
	//double pie=3.1426;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientificcalculator window = new Scientificcalculator();
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
	public Scientificcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 790, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 584, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Standerd");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100,100,305,440);
				textField.setBounds(20,50,250,45);
			}
		});
		mnFile.add(mntmExit);
		
		JMenuItem mntmUnitConverter = new JMenuItem("Unit Converter");
		mntmUnitConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100,100,790,440);
			}
		});
		mnFile.add(mntmUnitConverter);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.setBounds(100, 100, 560, 440);
				textField.setBounds(20,30,450,46);
			
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmExit_1 = new JMenuItem("Exit");
		mntmExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mnFile.add(mntmExit_1);
		
		textField = new JTextField();
		textField.setBounds(10, 32, 512, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B=null;
				if(textField.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					B=strB.toString();
					textField.setText(B);}
			}
		});
		btnNewButton.setBounds(10, 99, 48, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B=null;
				if(textField.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					B=strB.toString();
					textField.setText(B);}
			}
		});
		btnCe.setBounds(66, 99, 48, 40);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(122, 99, 48, 40);
		frame.getContentPane().add(btnC);
		
		JButton button_2 = new JButton("+/-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("-"+num1);
			}
		});
		button_2.setBounds(178, 99, 48, 40);
		frame.getContentPane().add(button_2);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sqrt(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnSqrt.setBounds(234, 99, 53, 40);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.log(num1);
                textField.setText(String.valueOf(num1));
			}
			
		});
		btnL.setBounds(297, 99, 53, 40);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sin(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnSin.setBounds(360, 99, 53, 40);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sinh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnSinh.setBounds(423, 99, 57, 40);
		frame.getContentPane().add(btnSinh);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBounds(10, 149, 48, 40);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("4");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setBounds(10, 200, 48, 40);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(10, 251, 48, 40);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(10, 302, 104, 40);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("8");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBounds(66, 150, 48, 40);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("9");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
				
			}
		});
		button_12.setBounds(122, 150, 48, 40);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("/");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_13.setBounds(178, 149, 48, 40);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("%");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_14.setBounds(234, 150, 48, 40);
		frame.getContentPane().add(button_14);
		
		JButton btnPie = new JButton("pie");
		btnPie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(String.valueOf(3.1426));
			}
		});
		btnPie.setBounds(297, 150, 53, 40);
		frame.getContentPane().add(btnPie);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cos(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCos.setBounds(360, 149, 57, 40);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cosh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCosh.setBounds(423, 150, 63, 40);
		frame.getContentPane().add(btnCosh);
		
		JButton button_18 = new JButton("5");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_18.getText();
				textField.setText(Number);
			}
		});
		button_18.setBounds(66, 200, 48, 40);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("6");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_19.getText();
				textField.setText(Number);
			}
		});
		button_19.setBounds(122, 200, 48, 40);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("*");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_20.setBounds(176, 200, 48, 40);
		frame.getContentPane().add(button_20);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=(1/num1);
                textField.setText(String.valueOf(num1));
			}
				
			
		});
		btnx.setBounds(234, 200, 48, 40);
		frame.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y";
				
			}
		});
		btnXy.setBounds(297, 200, 57, 40);
		frame.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tan(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnTan.setBounds(360, 200, 57, 40);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tanh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnTanh.setBounds(423, 200, 63, 40);
		frame.getContentPane().add(btnTanh);
		
		JButton button_25 = new JButton("2");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_25.getText();
				textField.setText(Number);
			}
		});
		button_25.setBounds(66, 251, 48, 40);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("3");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_26.getText();
				textField.setText(Number);
			}
		});
		button_26.setBounds(122, 251, 48, 40);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("-");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_27.setBounds(176, 251, 48, 40);
		frame.getContentPane().add(button_27);
		
		JButton button_29 = new JButton(".");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_29.getText();
				textField.setText(Number);
			}
		});
		button_29.setBounds(122, 302, 48, 40);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("=");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
				if(op=="Cbr"){
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);}
				if(op=="x^y"){
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);}
				if(op=="Mod"){
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);}
							
							
		}
		});
		
		button_30.setBounds(234, 251, 48, 91);
		frame.getContentPane().add(button_30);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double g=Double.parseDouble(textField.getText());
				g=g*g;
				//textField.setText(g);
				textField.setText(String.valueOf(g));
			}
		});
		btnX.setBounds(297, 251, 57, 40);
		frame.getContentPane().add(btnX);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="Cbr";
			}
		});
		btnCbr.setBounds(360, 251, 57, 40);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.round(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnRund.setBounds(423, 251, 63, 40);
		frame.getContentPane().add(btnRund);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double g=Double.parseDouble(textField.getText());
				g=g*g*g;
				//textField.setText(g);
				textField.setText(String.valueOf(g));
			}
		});
		btnX_1.setBounds(297, 302, 57, 40);
		frame.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
				
			}
		});
		btnBin.setBounds(360, 302, 53, 40);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
			textField.setText(Integer.toHexString(a));
			
			}
		});
		btnHex.setBounds(423, 302, 57, 40);
		frame.getContentPane().add(btnHex);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="Mod";
			}
		});
		btnMod.setBounds(488, 99, 53, 40);
		frame.getContentPane().add(btnMod);
		
		JButton btnInx = new JButton("lnx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.log(num1);
                textField.setText(String.valueOf(num1));
			}
			
		});
		btnInx.setBounds(488, 149, 53, 40);
		frame.getContentPane().add(btnInx);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC_1.setBounds(484, 200, 57, 40);
		frame.getContentPane().add(btnC_1);
		
		JButton btnpie = new JButton("2*pie");
		btnpie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(String.valueOf(4*3.1426));
			}
		});
		btnpie.setBounds(484, 251, 57, 40);
		frame.getContentPane().add(btnpie);
		
		JButton btnOc = new JButton("Oc");
		btnOc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
				
			}
		});
		btnOc.setBounds(484, 302, 57, 40);
		frame.getContentPane().add(btnOc);
		
		JButton button_43 = new JButton("+");
		button_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {num1=Double.parseDouble(textField.getText());
			textField.setText("");
			op="+";
			}
		});
		button_43.setBounds(176, 302, 48, 40);
		frame.getContentPane().add(button_43);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(Color.WHITE);
		panel.setBounds(543, 96, 225, 246);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currancy Converter");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(32, 11, 164, 22);
		panel.add(lblNewLabel);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(69, 89, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		//textField_1 = new JTextField();
		//textField_1.setBounds(69, 105, 94, 22);
		//panel.add(textField_1);
		//textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(69, 138, 94, 22);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selected..", "India", "China", "US", "Dubai"}));
		comboBox.setBounds(69, 58, 94, 20);
		panel.add(comboBox);
		
		JButton btnNumdoubleparsedoubletextfieldgettext = new JButton("Convert");
		btnNumdoubleparsedoubletextfieldgettext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AbstractButton textField_1 = null;
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("India"));
				{
					String c=String.format("Rs %.2f",bp*India);
					lblNewLabel_1.setText(c);
				}
				if(comboBox.getSelectedItem().equals("China"));
				{
					String c=String.format("Rs %.2f",bp*China);
					lblNewLabel_1.setText(c);
				}
				if(comboBox.getSelectedItem().equals("US"));
				{
					String c=String.format("Rs %.2f",bp*US);
					lblNewLabel_1.setText(c);
				}
				if(comboBox.getSelectedItem().equals("Dubai"));
				{
					String c=String.format("Rs %.2f",bp*Dubai);
					lblNewLabel_1.setText(c);
				}
				
			}
		});
		btnNumdoubleparsedoubletextfieldgettext.setBounds(10, 190, 89, 23);
		panel.add(btnNumdoubleparsedoubletextfieldgettext);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
			}
		});
		btnClear.setBounds(126, 190, 89, 23);
		panel.add(btnClear);
		
		
	}
}
