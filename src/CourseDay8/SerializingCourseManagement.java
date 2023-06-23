package CourseDay8;

import CourseDay8.Course;
import CourseDay8.CourseProcessor;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializingCourseManagement {

    public static void main(String[] args) {
        CourseProcessor p = new CourseProcessor();


        String filePath = "courses.txt";
        try(
                FileOutputStream fout = new FileOutputStream(filePath);
                ObjectOutputStream oout = new ObjectOutputStream(fout);
        ){
            p.acceptCourse();
            Course[] courses=p.getArray();
            oout.writeObject(courses);
            System.out.println("Object array got Serialized successfully.");
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

}
