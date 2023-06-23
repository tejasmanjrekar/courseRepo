package CourseDay10;

import java.util.Comparator;

public class SortByTitleUsingComparator implements Comparator<Course>{

    public int compare(Course course1, Course course2) {
        String firstCourseTitle = course1.getTitle();
        String secondCourseTitle = course2.getTitle();
        int comparison=firstCourseTitle.compareTo(secondCourseTitle);
        return comparison;
    }
}
