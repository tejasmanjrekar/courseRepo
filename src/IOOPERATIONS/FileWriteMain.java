package IOOPERATIONS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriteMain {
    public static void main(String[] args) {
        String filePath="./src/technologies.txt";
        String fileData="Java\nSpring\nSpringBoot\nAngular\nReact\nPython";
        OutputStream fout=null;
        try {
            fout = new FileOutputStream(filePath);
            byte dataBytes[] = fileData.getBytes();
            fout.write(dataBytes);
            System.out.println("Data has been written Successfully");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
                fout.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
