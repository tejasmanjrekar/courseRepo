package IOOPERATIONS;

import java.io.*;

public class BufferedInputStreamMain {

    public static void main(String[] args) {
        String filePath="./src/java.txt";
        try(
            InputStream fin= new FileInputStream(filePath);
            InputStream bin=new BufferedInputStream(fin);
            ){
            while (true){
                int data=bin.read();
                if(data==-1)
                    break;
                char ch=(char)data;
                System.out.print(ch);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("The file doesnt exist.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
