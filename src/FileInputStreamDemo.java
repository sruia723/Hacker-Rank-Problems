import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("file1.txt");

        // To increase the performance of read() operation
        BufferedInputStream bis = new BufferedInputStream(fis);
        int size = bis.available(); // gives size of the file.
        byte[] buffer = new byte[size];
        bis.read(buffer); // reading in byte format.
        String s = new String(buffer); //converts byte to String
        System.out.println(s);
        bis.close();
        fis.close();

        //System.out.println(size);
    }
}
