package CourseDay5;

import java.util.Scanner;

public class CourseManagement {

	public static void main(String[] args) {
		
	    TotalFees totalCost = new TotalFees();
	    Revenue totalRevenue = new Revenue();
	    try {
			float amount = totalCost.process("Ashutosh");
			System.out.println("Total Amount = "+amount);
		} catch (NoDataFoundException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	    
	    try {
		float revenue = totalRevenue.process(101);
		System.out.println("Total Revenue = "+revenue);
	   } 
	   catch (NoDataFoundException f) {
		String message = f.getMessage();
		System.out.println(message);
	   } 
	}

}
