package CourseDay10;

import java.util.*;

public class DefaultCourseSorter implements CourseDataSorter{

    @Override
    public Collection<Course> sortCourses(Collection<Course> courses) {
        Set<Course> sortedCourses = new TreeSet<Course>();
        List<Course> unsortedCourses=(ArrayList<Course>)courses;
        sortedCourses.addAll(unsortedCourses);
        Collection<Course>list=sortedCourses;
        return list;
    }

}
