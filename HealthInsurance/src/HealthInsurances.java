import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HealthInsurances extends JFrame {

	private JPanel contentPane;
	public static  String Lastname ;
	public static String Firstname;
	public static String email;
	public static  String cemail;
	public static  String sage;
	public static  int age;
	public static  String sex;
	public static  String address;
	public static  String DOB;
	public static String PN;
	public String DOCNAME;
	public   int DOCAGE;
	public int DOCPN;
	public static String select;
	public static String initialSelection;
	public static Object selections;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthInsurances frame = new HealthInsurances();
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
	public HealthInsurances() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToUniversal = new JLabel("Welcome to Universal Health Insurance");
		lblWelcomeToUniversal.setBounds(90, 11, 223, 14);
		contentPane.add(lblWelcomeToUniversal);
		
		JButton btnNewButton = new JButton("Enroll");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				 email=JOptionPane.showInputDialog(contentPane,"Enter your Email  : ","Email",JOptionPane.INFORMATION_MESSAGE);
				 cemail=JOptionPane.showInputDialog(contentPane,"Confirm your Email : "," Confirm Email",JOptionPane.INFORMATION_MESSAGE);
				 
				 int i=0;
				 while(!email.equals(cemail)){
					 JOptionPane.showMessageDialog(contentPane, "Emails does not match!!!!","Error Message",JOptionPane.INFORMATION_MESSAGE);
					 email=JOptionPane.showInputDialog(contentPane,"Enter your Email  : ");
					 cemail=JOptionPane.showInputDialog(contentPane,"Confirm your Email : "); 
					 i++;
				 }
				Enroll en=new Enroll();
				 en.setVisible(true);
//				 int OneResponse = JOptionPane.showConfirmDialog(contentPane, "Do you want to Enroll ?", "Confirm",
//					        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//				 
//				 if (OneResponse == JOptionPane.YES_OPTION) 
//				 {
//					 
//					 Lastname = JOptionPane.showInputDialog(contentPane,"Enter Your Last Name : ");
//					 Firstname =JOptionPane.showInputDialog(contentPane,"Enter your first name : ");
//					
//					
//					 
//					 if (email.equals(cemail))
//					 {
//						 sage =JOptionPane.showInputDialog(contentPane,"Enter your age: ");
//					     age = Integer.parseInt(sage);
//						sex =JOptionPane.showInputDialog(contentPane,"Sex: ");
//						DOB =JOptionPane.showInputDialog(contentPane,"Enter your Dob :"
//						 		+ "        (year/date/month)");
//						address =JOptionPane.showInputDialog(contentPane,"Enter your Home address: ");
//					 }
//					 else
//					 {
//						 JOptionPane.showMessageDialog(contentPane, "Error!!\n"
//						 		+ "Email Confirmation Failed!!\n"
//						 		+ "Enter Your Email Again \n");
//						 email=JOptionPane.showInputDialog(contentPane,"Enter your Email : ");
//						 cemail=JOptionPane.showInputDialog(contentPane,"Confirm your Email : ");
//						 
//						 if (email.equals(cemail))
//						 {
//							 
//							 
//							 sage =JOptionPane.showInputDialog(contentPane,"Enter your age: ");
//			    			 age = Integer.parseInt(sage);
//			    			 sex =JOptionPane.showInputDialog(contentPane,"Sex :  ");
//			    			 DOB=JOptionPane.showInputDialog(contentPane,"Enter your Dob: ");
//			    			 address=JOptionPane.showInputDialog(contentPane,"Enter your Home address: ");
//			    				
//						 }
//						 else
//						 {
//							 JOptionPane.showMessageDialog(contentPane, "Sorry We cannot Enroll You");
//						 }
//					 }
//				 }
		}
		});
		btnNewButton.setBounds(166, 87, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
