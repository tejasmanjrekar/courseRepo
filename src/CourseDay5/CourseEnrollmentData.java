package CourseDay5;

public class CourseEnrollmentData {
	private static CourseEnrollment[] enrollments;
	static {
		enrollments = new CourseEnrollment[5];		
		CourseEnrollment e1 = new CourseEnrollment("Ashutosh",101);
		CourseEnrollment e2 = new CourseEnrollment("Tejas",101);
		CourseEnrollment e3 = new CourseEnrollment("Ashutosh",102);
		CourseEnrollment e4 = new CourseEnrollment("Ashutosh",103);
		CourseEnrollment e5 = new CourseEnrollment("Tejas",104);
		enrollments[0]= e1;
		enrollments[1]= e2;
		enrollments[2]= e3;
		enrollments[3]= e4;
		enrollments[4]= e5;
	}
	private static CourseEnrollment e;
	
	public static CourseEnrollment[] getEnrollmentArray() {
		return enrollments;
	}
	
	

}
