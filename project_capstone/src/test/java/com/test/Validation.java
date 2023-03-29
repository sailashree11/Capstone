package com.test;

public class Validation {

	public int DB_Validation() {
		
	 
		// TODO Auto-generated method stub
		
		 signup signup = new signup();
		 mysql sql = new mysql();
		 
		 String[] exp_details =signup.signup();
	
		 String[] act_details = sql.main();
		 int ret =0;
		 System.out.println("printing act_details and exp_details");
		 for (int i = 0; i < act_details.length; i++) {
			 System.out.println(act_details[i]);
			 System.out.println(exp_details[i]);
			 System.out.println(i);
			 if (exp_details[i].contains(act_details[i])) {
				 System.out.println("Details are Validated");
				 ret=1;
				
			}else {
				System.out.println("Details are not Validated");
			}
			
		}		 
		return ret;
		 
	}
	
	
	
	public int Validating_Table() {
		booking booking = new booking();
		int SearchFlight_Validation = booking.main();
		return SearchFlight_Validation;
		
		
	}
	
	
	public int BookShowValidate() {
		booking signup = new booking();
		int book_Validation = booking.main();
		return book_Validation;
		
	}
	
	

}
