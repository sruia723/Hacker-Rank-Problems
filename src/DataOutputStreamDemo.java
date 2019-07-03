import java.io.*;

public class DataOutputStreamDemo {

    public static void main(String[] args) throws IOException{

        // DataOutputStream is used to write different types of data onto the file.
        // Not used to create a file on hard disk.
        FileOutputStream fos = new FileOutputStream("file2.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(10);
        dos.writeUTF("Hello world"); // unified text format
        dos.writeDouble(3.14);
        System.out.println("File created.");
        dos.close();
        fos.close();
    }
}
