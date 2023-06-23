package CourseDay3;

public class CourseCostOperation extends CourseOperation {
	public float getData(Course courses[]){
		float totalCost=0.0F;
		int size=courses.length;
		int index=0;
		for(int i=0; i<courses.length; i++) {
			totalCost=(float) (totalCost+courses[i].getCost());
			index++;
		}
		 float avgFees=totalCost/(float)index;
		return avgFees;
	}
}
