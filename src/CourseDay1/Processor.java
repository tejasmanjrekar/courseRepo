package CourseDay1;

import java.util.Scanner;

public class Processor {
	private Course[] courses;
	Course c = new Course();
	
public void acceptCourse() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of courses = ");
	int n = sc.nextInt();
	courses=new Course[n];
	for(int i=0; i<n ; i++) { 
		c.acceptDetails();
		courses[i]=c;
	}
	for(int i=0; i<n; i++) {
		System.out.println(courses[i]);
	}
}
}
