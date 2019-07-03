import java.io.*;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("file3.txt");

        // To increase the performance of write operation.
        BufferedWriter bw = new BufferedWriter(fw);

        String s = "My name is Sanchit Ruia.\nKimmi is my best friend and lover.\nRaadhaa Krishnaa are our lovers." +
                "\nWe all are one flower.";
        bw.write(s);
        System.out.println("File created");
        bw.close();
        fw.close();
    }
}
