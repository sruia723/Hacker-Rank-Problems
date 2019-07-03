import java.io.*;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException{

        // FileOutputStream is a class under abstract class OutputStream.
        FileOutputStream fos = new FileOutputStream("file1.txt");

        // To increase the performance of write operations.
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String s = "Java is an object oriented programming language.";
        bos.write(s.getBytes()); // converts String to byte[]
        System.out.println("File has been created.");
        bos.close();
        fos.close();
    }
}
