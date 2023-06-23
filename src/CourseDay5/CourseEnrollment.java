package CourseDay5;

import java.util.Objects;

public class CourseEnrollment {
	private int enrollmentId=201;
	private String enrolledBy;
	private int courseId;
	
	
	public CourseEnrollment() {
		super();
	}


	public CourseEnrollment(String enrolledBy, int courseId) {
		super();
		enrollmentId++;
		this.enrolledBy = enrolledBy;
		this.courseId = courseId;
	}


	public int getEnrollmentId() {
		return enrollmentId;
	}


	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}


	public String getEnrolledBy() {
		return enrolledBy;
	}


	public void setEnrolledBy(String enrolledBy) {
		this.enrolledBy = enrolledBy;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	@Override
	public String toString() {
		return "CourseEnrollment [enrollmentId=" + enrollmentId + ", enrolledBy=" + enrolledBy + ", courseId="
				+ courseId + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(courseId, enrolledBy, enrollmentId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseEnrollment other = (CourseEnrollment) obj;
		return courseId == other.courseId && Objects.equals(enrolledBy, other.enrolledBy)
				&& enrollmentId == other.enrollmentId;
	}
	
	
	
	

}
