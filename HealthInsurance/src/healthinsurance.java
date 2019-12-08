import java.awt.Component;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class healthinsurance extends JFrame{
	


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
	private String DOCNAME;
	private int DOCAGE;
	private int DOCPN;
	
	
	  

	public static void main(String []args){
		
	
	
		
		JFrame parent = new JFrame();
		
		healthinsurance p1 = new healthinsurance();
		
		 JOptionPane.showMessageDialog(parent, "Welcome to Universal Health Care System ");
		 
		 int OneResponse = JOptionPane.showConfirmDialog(null, "Do you want to Enroll ?", "Confirm",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		 
		 if (OneResponse == JOptionPane.YES_OPTION) 
		 {
			 
			 Lastname = JOptionPane.showInputDialog("Enter Your Last Name : ");
			 Firstname =JOptionPane.showInputDialog("Enter your first name : ");
			 email=JOptionPane.showInputDialog("Enter your Email  : ");
			 cemail=JOptionPane.showInputDialog("Confirm your Email : ");
			
			 
			 if (email.equals(cemail))
			 {
				 sage =JOptionPane.showInputDialog("Enter your age: ");
			     age = Integer.parseInt(sage);
				sex =JOptionPane.showInputDialog("Sex: ");
				DOB =JOptionPane.showInputDialog("Enter your Dob :"
				 		+ "        (year/date/month)");
				address =JOptionPane.showInputDialog("Enter your Home address: ");
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(parent, "Error!!\n"
				 		+ "Email Confirmation Failed!!\n"
				 		+ "Enter Your Email Again \n");
				 email=JOptionPane.showInputDialog("Enter your Email : ");
				 cemail=JOptionPane.showInputDialog("Confirm your Email : ");
				 
				 if (email.equals(cemail))
				 {
					 
					 
					 sage =JOptionPane.showInputDialog("Enter your age: ");
	    			 age = Integer.parseInt(sage);
	    			 sex =JOptionPane.showInputDialog("Sex :  ");
	    			 DOB=JOptionPane.showInputDialog("Enter your Dob: ");
	    			 address=JOptionPane.showInputDialog("Enter your Home address: ");
	    				
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(parent, "Sorry We cannot Enroll You");
				 }
			 }
		 }
		 
				
		 
		
		       else if (OneResponse == JOptionPane.NO_OPTION) 
	                {
		    	   
		    	        int TwoResponse = JOptionPane.showConfirmDialog(null, "Do you want to Quit ?", "Confirm",
	    			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    	
			    	 
			                 if ( TwoResponse == JOptionPane.YES_OPTION)
			                 {
			    		     JOptionPane.showMessageDialog(parent, "Thank You For Visiting us.  ");
			    		 
			    	         }
			    	      else if (TwoResponse == JOptionPane.NO_OPTION)
			    	         {
			    		 
			    	    	  int results = JOptionPane.showConfirmDialog(null, "Do you want to Enroll Again ?", "Confirm",
			    			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    		 
			    		 
			    	    	  if (results == JOptionPane.YES_OPTION) {
			    		    	
			    			  Lastname =JOptionPane.showInputDialog("Enter Your Last Name : ");
			    				 
			    				 Firstname=JOptionPane.showInputDialog("Enter your first name : ");
			    				 email=JOptionPane.showInputDialog("Enter your Email : ");
			    				 cemail=JOptionPane.showInputDialog("Confirm your Email : ");
			    				 
			    				 if (email.equals(cemail))
			    				 {
			    					 
			    					 sage =JOptionPane.showInputDialog("Enter your age: ");
					    			 age = Integer.parseInt(sage);
					    			 sex =JOptionPane.showInputDialog("Sex :  ");
					    			 DOB =JOptionPane.showInputDialog("Enter your Dob: (year/date/month)");
					    			 address=JOptionPane.showInputDialog("Enter your address: ");
					    				
			    				 }
			    				 else{
			    					 
			    					 JOptionPane.showMessageDialog(parent, "Error!!!\n "
			    					 		+ "Email Confirmation Failed ");
			    					 
			    					 email=JOptionPane.showInputDialog("Enter your Email : ");
				    				 cemail=JOptionPane.showInputDialog("Confirm your Email : ");
				    				 if (email.equals(cemail)){
				    					 sage  =JOptionPane.showInputDialog("Enter your age: ");
						    				age = Integer.parseInt(sage);
						    			    sex=JOptionPane.showInputDialog("Sex :  ");
						    			   DOB=JOptionPane.showInputDialog("Enter your Dob: ");
						    			  address=JOptionPane.showInputDialog("Enter your address: ");
						    				
				    				 }
				    				 else{
				    					 JOptionPane.showMessageDialog(parent, "Sorry You cannot enroll ");
				    				 }
			    				 
			    				 
				    				 
			    				 }
			    				 
			    				
			    			    }
			    	    	  else 
			    				 {
			    					 JOptionPane.showMessageDialog(parent, "Thank You For Visiting us.  ");
			    				 }
			    		 
	
			    	         } 
	              
	                }
	
	
	

			    	
		 
		 
		 JDialog.setDefaultLookAndFeelDecorated(true);
		 
		    Object[] selectionLevel = { "Platinum", "Gold", "Silver" };
		    String initialSelection = "Gold";
		    Object selectionOfLevel = JOptionPane.showInputDialog(null, "Types of health Insurance ",
		        "Choose One", JOptionPane.QUESTION_MESSAGE, null, selectionLevel, initialSelection);
		    JOptionPane.showMessageDialog(parent, selectionOfLevel);
		     String select = selectionOfLevel.toString();
		   if (select.equals("Platinum"))
		   {
			   JOptionPane.showMessageDialog(parent, "Welcome to Platinum ");
			   
			    JOptionPane.showMessageDialog(parent, "What Actually 'Platinum ' level Cover :\n "
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
		   else if(select.equals("Gold")) 
		  {
			  JOptionPane.showMessageDialog(parent, "Welcome to Gold ");
			  JOptionPane.showMessageDialog(parent, "What Actually 'GOld ' level Cover :\n "
			    		+ "Physician Office visit\n"
			    		+ "Dental and Vision coverage\n"
			    		+ "Upto $500,000 On Hospital room and Board\n"
			    		+ "Emergency Room visit\n"
			    		+ "Mental Health Care.");
			   
			  
		  }
		   else if(select.equals("Silver"))
		  {
			  JOptionPane.showMessageDialog(parent, "Welcome to Silver ");
			  JOptionPane.showMessageDialog(parent, "What Actually 'Silver ' level Cover :\n "
			    		+ "Physician Office visit\n"
			    		+ "Dental and Vision coverage\n"
			    		+ "Upto $ 100,000 On Hospital room and Board\n");
			  
			
		  }
		   JOptionPane.showMessageDialog(parent, "Choose a Doctor :");
		   
		  
			  healthinsurance john = new healthinsurance ();
				john.DOCNAME="Dr.John Rijal";
				john.DOCAGE=42;
				john.DOCPN=98745632;
				
				healthinsurance micheal = new healthinsurance();
				micheal.DOCNAME="Dr.Micheal Sherpa";
				micheal.DOCAGE =35;
				micheal.DOCPN= 23456789;
				
				healthinsurance Peblo = new healthinsurance();
				Peblo.DOCNAME="Dr.Peblo Maharjan";
				Peblo.DOCAGE =33;
				Peblo.DOCPN= 23458989;
				
				
				 JOptionPane.showMessageDialog(parent,"Description of Doctors :\n"
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
				    Object selections = JOptionPane.showInputDialog(null, "Name of Doctors:",
				        "Choose a Doctor:", JOptionPane.QUESTION_MESSAGE, null, selectiondoctor, initialSelections);
				    JOptionPane.showMessageDialog(parent, selections);
				    
				    
				    JOptionPane.showMessageDialog(null," Insurer Profile :\n"
				    		+ "==================================\n"
				    		+  "Name :"+Firstname+" "+Lastname+"\n"
				    				+ "Age : "+age+"\n"
				    						+ "Email : "+email+"\n"
				    								+ "Sex : "+sex+" \n"
				    										+ "Date of Birth : "+DOB+"\n"
				    												+ "Address : "+address+"\n"
				    														+ "Insurance Level : "+select+"\n"
				    																+ "Doctor Name :"+selections+"\n"
				    																		+ "Address : "+address+"\n"); 
				    																					 
				    																	


	}







	
}




	

