import java.io.*;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("file3.txt");
        int n = 0;
        while ((n = fr.read()) != -1) // -1 indicates end of file
        {
            // it is printing UNICODE. We need to used casting
            System.out.print((char)n);
        }
        fr.close();

        System.out.println();
        char c = 'M';
        System.out.println((int)c); // UNICODE of char 'M' (ASCII is subset of UNICODE)


    }
}
