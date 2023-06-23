package CourseDay12;



import java.util.Collection;

public class CourseCRUDExample {

    private static void delete() {

        DaoInterface<Course,Integer> di =
                new CourseDatabaseDao();
        di.deleteById(2);
    }
    private static void update() {
        DaoInterface<Course, Integer> di =
                new CourseDatabaseDao();
        Course rst = di.getOneById(3);
        rst.setProvider("Shala");
        rst.setDuration(66);
        di.update(rst);
    }
    private static void addNew() {
        DaoInterface<Course, Integer> di =
                new CourseDatabaseDao();

        Course rst = new Course(6,"Entryyy Level Java",45,"Oracle",332323);
        di.createNew(rst);
    }
    private static void showOne() {
        DaoInterface<Course, Integer> di =
                new CourseDatabaseDao();
        Course course =
                di.getOneById(5);
        if(course != null)
            System.out.println(course);
        else
            System.out.println("Course with this id not found");
    }
    private static void showAll() {
        DaoInterface<Course, Integer> di =
                new CourseDatabaseDao();
        Collection<Course> allCourse = di.getAll();
        for(Course course : allCourse)
            System.out.println(course);
        //allRestaurants.stream().forEach((rs) -> System.out.println(rs));

    }

    public static void main(String[] args) {
       showAll();
       showOne();
        //addNew();
       // showAll(); error
       update();
        //delete();
        showAll();
    }
}
