package IOOPERATIONS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReadMain {
    public static void main(String[] args) {
        String filePath="./src/java.txt";
        InputStream fin=null;
        try{
            fin=new FileInputStream(filePath);
            while(true){
                int data=fin.read();
                if(data==-1)
                    break;
                char ch=(char) data;
                System.out.print(ch);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("The file doesn't exist.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                fin.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
