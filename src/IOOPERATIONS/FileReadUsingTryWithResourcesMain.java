package IOOPERATIONS;

import java.io.*;

public class FileReadUsingTryWithResourcesMain {
    public static void main(String[] args) {
        String filePath="./src/java.txt";
        try(InputStream fin=new FileInputStream(filePath)){
            while (true){
                int data=fin.read();
                if(data==-1)
                    break;
                char ch=(char)data;
                System.out.print(ch);
                }
            }
        catch(FileNotFoundException e){
            System.out.println("The file doesnt exists");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
