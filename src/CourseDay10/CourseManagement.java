package CourseDay10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CourseManagement {
    public static void main(String[] args) {

            Course c1 = new Course(103,"Core Java", 150, "Udemy", 250);
            Course c2 = new Course(102,"OS", 120, "Unacademy", 200);
            Course c3 = new Course(101,"Python", 200, "Udemy", 350);
            Course c4 = new Course(104,"Oracle", 180, "Unacademy", 450);
            List<Course> courses=new ArrayList<>();
            Collection<Course> list;
            courses.add(c1);
            courses.add(c2);
            courses.add(c3);
            courses.add(c4);
            System.out.println(courses);
            System.out.println("----------------------------------------------------");
            CourseDataSorter sort = new DefaultCourseSorter();
            list=sort.sortCourses(courses);
            for(Course course:list)
                System.out.println(course);
            System.out.println("------------------------------------------------");

            sort = new SortingByTitle();
            list=sort.sortCourses(courses);
            for(Course course:list)
                System.out.println(course);
    }
}
