package CourseDay5;

import java.util.Scanner;

public class CourseStore {
	private static Course[] courses;
static {
	courses = new Course[5];
	Course c1 = new Course(101,"Core Java", 150, "Udemy", 250);
	Course c2 = new Course(102,"OS", 120, "Unacademy", 200);
	Course c3 = new Course(103,"Python", 200, "Udemy", 350);
	Course c4 = new Course(104,"Oracle", 180, "Unacademy", 450);
	Course c5 = new Course(105,".Net", 120, "Unacademy", 300);
		courses[0]=c1;
		courses[1]=c2;
		courses[2]=c3;
		courses[3]=c4;
		courses[4]=c5;
}

	private Course c = new Course();
	int n;

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
	
	public static boolean isAvailable(Course course) {
		boolean status=true;
		for(int i=0; i<courses.length; i++) {
		status=course.equals(courses[i]);
	}
		return status; 
	}
	
	public static float getAvgDuration(String providerName) {
		int count=1;
		float cDuration=0.0F;
		for(int i=0; i<courses.length; i++) {
			if(providerName.equals(courses[i].getProvider()))
				cDuration=cDuration+courses[i].getDuration();
			count++;
			}
		float avgDuration = cDuration/(float)count;
		return avgDuration;
		}
	public static Course[] getArray() {
		return courses;
	}
	}


	


