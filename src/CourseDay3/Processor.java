package CourseDay3;

import java.util.Scanner;

public class Processor {
	private static Course[] courses;
	Course c = new Course();
	int n;
public void acceptCourse() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of courses = ");
	n = sc.nextInt();
	courses=new Course[n];
	for(int i=0; i<n ; i++) { 
		c.acceptDetails();
		courses[i]=c;
	}
}
	

	public double avgOfCourseFees(){
		double totalCost=0.0;
		for(int i=0; i<courses.length; i++) {
			totalCost=totalCost+courses[i].getCost();
		}
		 double avgFees=totalCost/(double)n;
		return avgFees;
	}
	
	public void displayCourses() {
		for(int i=0; i<courses.length; i++) {
			System.out.println(courses[i]);
		}
	}
	
	

	
}

