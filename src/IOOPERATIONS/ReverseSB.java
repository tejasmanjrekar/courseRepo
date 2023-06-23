package IOOPERATIONS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReverseSB {
    public static void main(String[] args) {
        String filePath="./src/myself.txt";
        StringBuilder s1=new StringBuilder();
        StringBuilder revs1=new StringBuilder();
        InputStream fin=null;
        try{
            fin=new FileInputStream(filePath);
            while(true)
            {
                int data=fin.read();

                if(data==-1){
                    break;
                }
            char ch=(char)data;
                s1.append(ch);
            }
            revs1=s1.reverse();
            System.out.println(revs1);
        }catch (FileNotFoundException e){
            System.out.println("UNABLE TO LOCATE FILE");}
        catch(IOException e){
            e.printStackTrace();
        }

        finally {
            try{
                fin.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
