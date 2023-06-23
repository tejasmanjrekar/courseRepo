package CourseDay10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseProcessor {
    private ArrayList<Course>courses=new ArrayList<>();
    private Course course=new Course();

    public void acceptCourse(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter course details:");
        System.out.println("Enter course id");
        int id=sc.nextInt();
        System.out.println("Enter course title:");
        sc.nextLine();
        String title=sc.nextLine();
        System.out.println("Enter course duration:");
        int duration=sc.nextInt();
        System.out.println("Enter course Providers name:");
        String provider=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Course Cost:");
        int cost=sc.nextInt();
        Course course=new Course(id,title,duration,provider,cost);
        courses.add(course);
    }

    public void display(){
        for(Course course:courses){
            System.out.println(course);
        }
    }

    public void serialize(){
        String filePath="courses.txt";
        try(
                FileOutputStream fout=new FileOutputStream(filePath);
                ObjectOutputStream oout=new ObjectOutputStream(fout);
                ){
            oout.writeObject(courses);
            System.out.println("Object array got serialized successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void deSerialize(){
        String filePath="courses.txt";
        try(
                FileInputStream fin= new FileInputStream(filePath);
                ObjectInputStream oin=new ObjectInputStream(fin);
                ){
            Object obj=oin.readObject();
            courses=(ArrayList)obj;
            display();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void menu(){
        Scanner sc= new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.Create New Course");
            System.out.println("2.Store Course");
            System.out.println("3.Show all Courses");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    acceptCourse();
                    break;
                case 2:
                    serialize();
                    break;
                case 3:
                    deSerialize();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(ch!=4);
    }
}
