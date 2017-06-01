package enokkamuanga;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Application {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double thirdnum;
	double fourthnum;
	double fifthnum;
	double one;
	double two;
	double three;
	double four;
	double five;
	double six;
	double seven;
	double eight;
	double nine; 
	double result;
	String operations;
	String answer;
	
	int a = 8, b = 6, c = 6, d = 4, f = 2;
	private JTextField textField_1;
	private JTextField txtActivateDiscount;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 626, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(55, 63, 508, 73);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnStandard = new JButton("Standard");
		btnStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() +     Integer.toString(a);
			
				textField.setText(String.valueOf(EnterNumber));
				
				firstnum = Double.parseDouble(textField.getText());
				//textField.setText("");
				//operations ="+";
				textField.setText(EnterNumber);
			
				
							}
		});
		btnStandard.setBounds(51, 147, 89, 23);
		frame.getContentPane().add(btnStandard);
		
		JButton btnOAP = new JButton("OAP");
		btnOAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SecondNumber = textField.getText() +     Integer.toString(b);

		textField.setText(String.valueOf(SecondNumber));
		secondnum = Double.parseDouble(textField.getText());
		textField.setText(SecondNumber);
			}
		});
		btnOAP.setBounds(51, 181, 89, 23);
		frame.getContentPane().add(btnOAP);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ThirdNumber = textField.getText() +     Integer.toString(c);

				textField.setText(String.valueOf(ThirdNumber));
				secondnum = Double.parseDouble(textField.getText());
				textField.setText(ThirdNumber);
			}
		});
		btnStudent.setBounds(51, 215, 89, 23);
		frame.getContentPane().add(btnStudent);
		
		JButton btnChild = new JButton("Child");
		btnChild.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String FourthNumber = textField.getText() +     Integer.toString(d);

				textField.setText(String.valueOf(FourthNumber));
				secondnum = Double.parseDouble(textField.getText());
				textField.setText(FourthNumber);
			}
		});
		btnChild.setBounds(51, 249, 89, 23);
		frame.getContentPane().add(btnChild);
		
		JButton btnDiscount = new JButton("Discount");
		btnDiscount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String FifthNumber = textField.getText() +     Integer.toString(f);

				textField.setText(String.valueOf(FifthNumber));
				secondnum = Double.parseDouble(textField.getText());
				textField.setText(FifthNumber);
			}
		});
		btnDiscount.setBounds(51, 284, 89, 23);
		frame.getContentPane().add(btnDiscount);
		
		JLabel lblQACinema = new JLabel("QA Cinema");
		lblQACinema.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblQACinema.setBounds(243, 11, 147, 41);
		frame.getContentPane().add(lblQACinema);
		
		JLabel lblEnokkamuanga = new JLabel("enokkamuanga");
		lblEnokkamuanga.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblEnokkamuanga.setBounds(575, 360, 35, 14);
		frame.getContentPane().add(lblEnokkamuanga);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operations =="+")
				{
				result = firstnum + secondnum + thirdnum + fourthnum + fifthnum;
				answer = String.format("%.2f", result);
				textField.setText("The total price is £"+answer);
				
				}
				else if (operations == "-")
				
				{
				result = firstnum - f;
				answer = String.format("%.1f", result);
				textField.setText("The total price is £"+answer);
				
				}
				else if (operations == "*")
				{
					result = firstnum * one;
					
					answer = String.format("%.2f", result);
					textField.setText("The total price is £"+answer);
				}
				
		}});
		btnTotal.setBounds(51, 317, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnReset.setBounds(229, 147, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnAnd = new JButton("And");
		btnAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum =  Double.parseDouble(textField.getText());
				secondnum = Double.parseDouble(textField.getText()); //(Integer.toString(d));
				textField.setText("");
				operations = "+";
			}
		});
		btnAnd.setBounds(229, 181, 89, 23);
		frame.getContentPane().add(btnAnd);
		
		JButton btnTimes = new JButton("Times");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				textField_1.setText("How many times");
				operations = "*";
			}
		});
		btnTimes.setBounds(229, 215, 89, 23);
		frame.getContentPane().add(btnTimes);
		
		JButton btnBlank = new JButton("Blank");
		btnBlank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						textField.setText(null);
			}
		});
		btnBlank.setBounds(229, 249, 89, 23);
		frame.getContentPane().add(btnBlank);
		
		textField_1 = new JTextField();
		textField_1.setBounds(393, 89, 158, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
				one = Double.parseDouble(textField.getText());
			}
		});
		btnOne.setBounds(408, 147, 43, 41);
		frame.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
				one = Double.parseDouble(textField.getText());
			}
		});
		btnTwo.setBounds(461, 147, 43, 41);
		frame.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
				one = Double.parseDouble(textField.getText());
			}
		});
		btnThree.setBounds(514, 147, 43, 41);
		frame.getContentPane().add(btnThree);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
				one = Double.parseDouble(textField.getText());
			}
		});
		btnFour.setBounds(408, 199, 43, 41);
		frame.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
				one = Double.parseDouble(textField.getText());
			}
		});
		btnFive.setBounds(461, 197, 43, 41);
		frame.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
				one = Double.parseDouble(textField.getText());
			}
		});
		btnSix.setBounds(514, 197, 43, 41);
		frame.getContentPane().add(btnSix);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");
				one = Double.parseDouble(textField.getText());
			}
		});
		btnSeven.setBounds(408, 249, 43, 41);
		frame.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
				one = Double.parseDouble(textField.getText());
			}
		});
		btnEight.setBounds(461, 249, 43, 41);
		frame.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
				one = Double.parseDouble(textField.getText());
			}
		});
		btnNine.setBounds(514, 249, 43, 41);
		frame.getContentPane().add(btnNine);
		
		JButton btnActivate = new JButton("Activate");
		btnActivate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =  Double.parseDouble(textField.getText());
				secondnum = Double.parseDouble (Integer.toString(d));
				textField.setText("");
				textField_1.setText("Press discount");
				operations = "-";
				
			}
		});
		btnActivate.setBounds(229, 284, 89, 23);
		frame.getContentPane().add(btnActivate);
		
		txtActivateDiscount = new JTextField();
		txtActivateDiscount.setText("Activate discount");
		txtActivateDiscount.setBounds(250, 89, 86, 20);
		frame.getContentPane().add(txtActivateDiscount);
		txtActivateDiscount.setColumns(10);
	}
}
