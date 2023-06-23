package CourseDay6;

public class Threadingg extends Thread{
    private int delayTime;
     public Threadingg(int delayTime){
         super();
         this.delayTime=delayTime;
     }

    @Override
    public void run() {

        try {

            for (int i = 65; i <= 90; i++) {
                Thread.sleep(delayTime);

                System.out.print(i + " ");

            }
        }
        catch (InterruptedException e1) {
            System.out.println("Exception is caught");
        }
    }
}
