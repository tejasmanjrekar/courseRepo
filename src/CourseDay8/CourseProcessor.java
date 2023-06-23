package CourseDay8;

import java.util.Scanner;

public class CourseProcessor {
    private static Course[] courses;
    Course c = new Course();

    public void acceptCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of courses = ");
        int n = sc.nextInt();
        courses=new Course[n];
        for(int i=0; i<courses.length ; i++) {
            System.out.println("Enter course details");
            System.out.println("Enter CourseDay8.Course Title = ");
            String title = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter CourseDay8.Course Duration = ");
            int duration = sc.nextInt();
            System.out.println("Enter CourseDay8.Course Providers Name = ");
            String provider = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter CourseDay8.Course Cost = ");
            int cost = sc.nextInt();
            Course course = new Course(title,duration,provider,cost);
            courses[i]=course;
        }

    }
    public void display() {
        for(int i=0; i<courses.length; i++) {
            System.out.println(courses[i]);
        }
    }
    public Course[]getArray(){
        return courses;
    }

    public float avgOfCourseFees(Course[] c){
        double totalCost=0.0;
        for(int i=0; i<c.length; i++) {
            totalCost=totalCost+c[i].getCost();
        }
        float avgFees=(float) (totalCost/c.length);
        return avgFees;
    }

}

