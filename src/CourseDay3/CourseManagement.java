package CourseDay3;

import java.util.Scanner;

public class CourseManagement {

	public static void main(String[] args) {
	Course[] courses = new Course[4];
	Course c1 = new Course("Core Java", 150, "Udemy", 250);
	Course c2 = new Course("OS", 120, "Unacademy", 200);
	Course c3 = new Course("Python", 200, "Udemy", 350);
	Course c4 = new Course("Oracle", 180, "Unacademy", 450);
		courses[0]=c1;
		courses[1]=c2;
		courses[2]=c3;
		courses[3]=c4;
		CourseCostOperation cO = new CourseCostOperation();
		CourseDurationOperation dO = new CourseDurationOperation();
		float avgCost = cO.getData(courses);
		float avgDuration = dO.getData(courses);
		System.out.println("Average Cost = "+avgCost);
		System.out.println("Average Duration = "+avgDuration);
		
		
	}

}
