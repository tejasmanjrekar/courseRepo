package CourseDay6;

public class ThreadingMain extends Thread {

    public static void main(String[] args) {

        Threadingg threading1=new Threadingg(1000);
        Threading threading=new Threading(1000);

        threading.start();
        threading1.start();
        //System.out.print("\n");

        //threading.run();
    }
}
