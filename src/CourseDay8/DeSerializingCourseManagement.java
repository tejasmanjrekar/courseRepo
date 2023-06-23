package CourseDay8;

import CourseDay8.Course;
import CourseDay8.CourseProcessor;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializingCourseManagement {

    public static void main(String[] args) {
        CourseProcessor p=new CourseProcessor();
        Course[] courses=null;
        float avgCost=0.0f;
        String filePath="courses.txt";
        try(
                FileInputStream fin=new FileInputStream(filePath);
                ObjectInputStream oin=new ObjectInputStream(fin);
                ) {
            Object obj = oin.readObject();
            courses = (Course[]) obj;
            for (int i = 0; i < courses.length; i++) {
                System.out.println(courses[i]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        avgCost=p.avgOfCourseFees(courses);
        System.out.println("Average cost of courses:"+avgCost);
        }
    }

