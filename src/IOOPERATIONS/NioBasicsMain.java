/*import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioBasicsMain {
    private static void fileReadExample(){
        String filePath="./src/entertainment/movies.txt";
        Path currentPath= Paths.get(filePath);
        try(
            FileChannel fc=FileChannel.open(currentPath);
        ){
            long fileSize=fc.size();
            ByteBuffer buffer=ByteBuffer.allocate((int)fileSize);
            fc.read(buffer);
            byte[] data=new byte[(int)fileSize];
            buffer.flip();
            buffer.get(data);
            String fileInfo=new String(data);
            System.out.println(fileInfo);
        }catch(Exception e){
            e.printStackTrace();
    }
    private static void fileWriteExample(){
            String filePath
        }
}}
*/