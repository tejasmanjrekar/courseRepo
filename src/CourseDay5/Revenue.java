package CourseDay5;

public class Revenue implements CourseDataProcessor {
	 /*
 	This class accepts ID of the course (courseId) as input and
	returns the total amount of fees for all enrollments.

	The method must throw NoDataFoundException if there are no enrollments
	found for that particular course.
	     */
	
	private CourseEnrollment[] e;
	private Course[] c;
	
	@Override
	public float process(Object obj) throws NoDataFoundException {
		int cId = (int)obj;
		String str = String.valueOf(cId);
		e = CourseEnrollmentData.getEnrollmentArray();
		c= CourseStore.getArray();		
		float totalAmount=0.0f;
		int eId=0;
		int index=-1;
		for(int i=0;i<c.length;i++) {
			if(cId==c[i].getCourseId()){
				index++;
				for(int j=0;j<e.length;j++) {
					if(cId==e[j].getCourseId()) {
						totalAmount=totalAmount+(float)c[i].getCost();
						}
					}
					
				}
			}
		if(index==-1) {
			String details="Enter valid information";
			throw new NoDataFoundException(details,str);
		}
		return totalAmount;
	}

}
