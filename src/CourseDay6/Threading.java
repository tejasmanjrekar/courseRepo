package CourseDay6;

import java.net.StandardSocketOptions;

public class Threading extends Thread{

    private int delayTime;

    public Threading(int delayTime){
        super();
        this.delayTime=delayTime;
    }
    public void run(){
        try {
            char ch;
            for (ch = 'A'; ch <= 'Z'; ch++) {
                Thread.sleep(delayTime);
                System.out.print(ch + " ");
                //System.out.println("\n");
            }

        }
        catch(InterruptedException e){
            System.out.println("Exception is caught");
        }


    }

}



