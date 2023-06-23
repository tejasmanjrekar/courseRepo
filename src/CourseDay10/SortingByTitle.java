package CourseDay10;
import java.util.*;
public class SortingByTitle implements  CourseDataSorter{
    Comparator<Course> compare = new SortByTitleUsingComparator();

    @Override
    public Collection<Course> sortCourses(Collection<Course> courses) {
        Set<Course> sortedCourses = new TreeSet<Course>(compare);
        List<Course> unsortedCourses=(ArrayList<Course>)courses;
        sortedCourses.addAll(unsortedCourses);
        Collection<Course>list=sortedCourses;
        return list;
    }
}
