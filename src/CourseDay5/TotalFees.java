package CourseDay5;

public class TotalFees implements CourseDataProcessor {
	/*
    This class accepts name of the Student (enrolledBy) as input and
	returns the total amount of fees of all courses enrolled by that
	student.

	The method must throw NoDataFoundException if there are no enrollments
	found for that student.

		 */
	private CourseEnrollment[] e;
	private Course[] c;

	@Override
	public float process(Object obj) throws NoDataFoundException {
		String name=(String)obj;
		e = CourseEnrollmentData.getEnrollmentArray();
		c= CourseStore.getArray();		
		float totalAmount=0.0f;
		int courseId=0;
		int eId = -1;
		for(int i=0;i<e.length;i++) {
			if(name.equals(e[i].getEnrolledBy())){
				eId=e[i].getEnrollmentId();
				courseId=e[i].getCourseId();
				for(int j=0;j<c.length;j++) {
					if(c[j].getCourseId()==courseId) {
						totalAmount=totalAmount+(float)c[j].getCost();
					}
				}
			}
			
		}
		if(eId==-1) {
			String details="Enter valid information";
			throw new NoDataFoundException(details, name);
		}
		return totalAmount;
		
	}

}
