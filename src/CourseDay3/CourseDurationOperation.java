package CourseDay3;

public class CourseDurationOperation extends CourseOperation {
	public float getData(Course courses[]){
		float totalDuration=0.0F;
		int size=courses.length;
		int index=0;
		for(int i=0; i<courses.length; i++) {
			totalDuration=(float) (totalDuration+courses[i].getDuration());
			index++;
		}
		 float avgFees=totalDuration/(float)index;
		return avgFees;
	}
}
