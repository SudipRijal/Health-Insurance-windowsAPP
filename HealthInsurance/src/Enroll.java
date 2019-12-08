import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Enroll extends JFrame {

	private JPanel contentPane;
	private JTextField lastName;
	private JTextField firstName;
	private JTextField gender;
	private JTextField age;
	private JTextField dob;
	private JTextField address;
	private JTextField phoneNo;
	public static String DOCNAME;
	public static  int DOCAGE;
	public static int DOCPN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enroll frame = new Enroll();
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
	public Enroll() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setBounds(28, 24, 77, 14);
		contentPane.add(lblLastName);
		
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setBounds(228, 24, 63, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(28, 64, 77, 14);
		contentPane.add(lblGender);
		
		JLabel lblDateOfBirth = new JLabel("DOB :");
		lblDateOfBirth.setBounds(28, 100, 77, 14);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(231, 64, 48, 14);
		contentPane.add(lblAge);
		
		JLabel lblPhoneNumber = new JLabel("Phone No.");
		lblPhoneNumber.setBounds(228, 100, 77, 14);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(28, 136, 77, 14);
		contentPane.add(lblAddress);
		
		lastName = new JTextField();
		lastName.setBounds(92, 21, 112, 20);
		contentPane.add(lastName);
		lastName.setColumns(10);
		//get string from the textfield and store to lastname
		
		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(303, 21, 121, 20);
		contentPane.add(firstName);
		
		
		gender = new JTextField();
		gender.setColumns(10);
		gender.setBounds(92, 61, 112, 20);
		contentPane.add(gender);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(303, 61, 121, 20);
		contentPane.add(age);
		
		
		dob = new JTextField();
		dob.setColumns(10);
		dob.setBounds(95, 97, 109, 20);
		contentPane.add(dob);
		
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(92, 133, 175, 20);
		contentPane.add(address);
		
		
		phoneNo = new JTextField();
		phoneNo.setColumns(10);
		phoneNo.setBounds(303, 97, 121, 20);
		contentPane.add(phoneNo);
		
		
		JButton btnNewButton = new JButton("Select plane:");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JDialog.setDefaultLookAndFeelDecorated(true);
				 
				    Object[] selectionLevel = { "Platinum", "Gold", "Silver" };
				    HealthInsurances.initialSelection = "Gold";
				    Object selectionOfLevel = JOptionPane.showInputDialog(contentPane, "Types of health Insurance ",
				        "Choose One", JOptionPane.QUESTION_MESSAGE, null, selectionLevel, HealthInsurances.initialSelection);
				    JOptionPane.showMessageDialog(contentPane, selectionOfLevel);
				    HealthInsurances.select = selectionOfLevel.toString();
				   if (HealthInsurances.select.equals("Platinum"))
				   {
					   JOptionPane.showMessageDialog(contentPane, "Welcome to Platinum ");
					   
					    JOptionPane.showMessageDialog(contentPane, "What Actually 'Platinum ' level Cover :\n "
					    		+ "========================================\n"
					    		+ "Physician Office visit\n"
					    		+ "Dental and Vision coverage\n"
					    		+ "Up to $,1,000,000 On Hospital room and Board\n"
					    		+ "Maternity Care\n"
					    		+ "Ambulance Services\n"
					    		+ "Emergency Room visit\n"
					    		+ "Organ and Tissue Transplatation\n"
					    		+ "Kidney Dialysis\n"
					    		+ "Physical Therapy\n"
					    		+ "Mental Health Care.\n"
					    		+ "Durable Medical equipment.\n"
					    		+ "Infertility Treatment\n"
					    		+ "Prosthetic\n"
					    		+ "Sterillization");
					   
				  }
				   else if(HealthInsurances.select.equals("Gold")) 
				  {
					  JOptionPane.showMessageDialog(contentPane, "Welcome to Gold ");
					  JOptionPane.showMessageDialog(contentPane, "What Actually 'GOld ' level Cover :\n"
					  		+ "====================================\n "
					    		+ "Physician Office visit\n"
					    		+ "Dental and Vision coverage\n"
					    		+ "Upto $500,000 On Hospital room and Board\n"
					    		+ "Emergency Room visit\n"
					    		+ "Mental Health Care.");
					   
					  
				  }
				   else if(HealthInsurances.select.equals("Silver"))
				  {
					  JOptionPane.showMessageDialog(contentPane, "Welcome to Silver ");
					  JOptionPane.showMessageDialog(contentPane, "What Actually 'Silver ' level Cover :\n"
					  		+ "===========================================\n "
					    		+ "Physician Office visit\n"
					    		+ "Dental and Vision coverage\n"
					    		+ "Upto $ 100,000 On Hospital room and Board\n");
					  
					
				  }
			}
		});
		btnNewButton.setBounds(74, 182, 112, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSelctDoctor = new JButton("Select Doctor:");
		btnSelctDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(contentPane, "Choose a Doctor :");
				   
				  HealthInsurances john = new HealthInsurances ();
				  john.DOCNAME="Dr.John Rijal";
					john.DOCAGE=42;
					john.DOCPN=98745632;
					
					HealthInsurances micheal = new HealthInsurances ();
					micheal.DOCNAME="Dr.Micheal Sherpa";
					micheal.DOCAGE =35;
					micheal.DOCPN= 23456789;
					
					HealthInsurances Peblo = new HealthInsurances ();
					Peblo.DOCNAME="Dr.Peblo Maharjan";
					Peblo.DOCAGE =33;
					Peblo.DOCPN= 23458989;
					
					
					 JOptionPane.showMessageDialog(contentPane,"Description of Doctors :\n"
					 		+ "=======================================\n"
					 		+ "Name : "+john.DOCNAME+"\n"
					 		+ "Age is : "+john.DOCAGE+"\n"
					 				+ "Phone number is : "+john.DOCPN+"\n"
					 						+ "Education level: MBBS(Mississippi University for Women )\n"
					 						+ "               : MD (Boston University for Medicine)\n"
					 						+ "Works :   New York Bio Research Center.\n"
					 						+ "                Nervic Hospital\n"
					 						+ "Office hours : Mon- Fri (8:00am to 8:00pm)\n"
					 						+ "             :Sat (8:00 to 6:00pm)\n"
					 						+ "===================================\n"
					 						+ "Description of Doctor :\n"
						 		+ "Name : "+micheal.DOCNAME+"\n"
						 		+ "Age is : "+micheal.DOCAGE+"\n"
						 				+ "Phone number is : "+micheal.DOCPN+"\n"
						 				+ "Education level: MBBS(Texas University  )\n"
				 						+ "               : MD (Georgia University for Medicine)\n"
				 						+ "Works :   New Jersey Bio-tech Research Center.\n"
				 						+ "             : Ridgewood Community Hospital\n"
				 						+ "Office hours : Mon- Fri (8:00am to 9:00pm)\n"
				 						+ "             :Sat (9:00 to 5:00pm)\n"
				 						+ "===================================\n"
				 				+ "Name : "+Peblo.DOCNAME+"\n"
				 				+ "Age is : "+Peblo.DOCAGE+"\n"
				 				+ "Phone number is : "+Peblo.DOCPN+"\n"
				 						+ "Education level: MBBS(Buffalo University)\n"
				 						+ "               : MD (Madison University for Medicine)\n"
				 						+ "Works :  Madison- Square  Research Center.\n"
				 						+ "                Putnam Hospital\n"
				 						+ "Office hours : Mon- Fri (9:00am to 8:00pm)\n"
				 						+ "             :Sat (12:00 to 6:00pm)\n"
				 						+ "===================================\n");
					 Object[] selectiondoctor = { "Dr.John Rijal", "Dr.Micheal Sherpa", "Dr.Peblo Maharjan" };
					    String initialSelections = "john";
					    HealthInsurances.selections = JOptionPane.showInputDialog(contentPane, "Name of Doctors:",
					        "Choose a Doctor:", JOptionPane.QUESTION_MESSAGE, null, selectiondoctor, initialSelections);
					    JOptionPane.showMessageDialog(contentPane, HealthInsurances.selections);
			}
		});
		btnSelctDoctor.setBounds(222, 182, 121, 23);
		contentPane.add(btnSelctDoctor);
		
		JButton btnInsurerProfile = new JButton("Insurer Profile:");
		btnInsurerProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HealthInsurances.PN=phoneNo.getText();
				HealthInsurances.address=address.getText();
				HealthInsurances.DOB=dob.getText();
				HealthInsurances.sage=age.getText();
				HealthInsurances.sex=gender.getText();
				HealthInsurances.Firstname=firstName.getText();
				HealthInsurances.Lastname=lastName.getText();
				 JOptionPane.showMessageDialog(contentPane," Insurer Profile :\n"
				    		+ "==================================\n"
				    		+  "Name :"+HealthInsurances.Firstname+" "+HealthInsurances.Lastname+"\n"
				    				+ "Age : "+HealthInsurances.sage+"\n"
				    						+ "Email : "+HealthInsurances.email+"\n"
				    								+ "Sex : "+HealthInsurances.sex+" \n"
				    										+ "Date of Birth : "+HealthInsurances.DOB+"\n"
				    												+ "Phone Number : "+HealthInsurances.PN+"\n"
				    												+ "Address : "+HealthInsurances.address+"\n"
				    														+ "Insurance Level : "+HealthInsurances.select+"\n"
				    																+ "Doctor Name :"+HealthInsurances.selections+"\n"
				    																		); 
				    																					 
				    
				
			}
		});
		btnInsurerProfile.setBounds(148, 227, 131, 23);
		contentPane.add(btnInsurerProfile);
		
	
	}
}
