package IOOPERATIONS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadAndWrite {

    public static void main(String[] args) {
        String filePath = "Hello.txt";
        InputStream fin = null;
        int data=0;
        StringBuilder sb=new StringBuilder();
        try {
            fin = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("File does not exist.");
        }
        while(true) {
            try {
                System.out.println(fin);
                data=fin.read();
            } catch (IOException e) {
                System.out.println("Data is not able to insert.");
            }
            if (data==-1)
                break;
            char ch=(char)data;
            sb.append(ch);
        }
        String filePath2 = "./src/Hello2.txt";
        String fileData = sb.toString();
        byte[] byteArray = fileData.getBytes();
        OutputStream fout = null;
        try {
            fout=new FileOutputStream(filePath2);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
        try {
            fout.write(byteArray);
        } catch (IOException e) {
            System.out.println("Data is not appropriate.");
        }

    }

}
