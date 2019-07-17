/*
 File Class
 Creating new files, creating folders.
 Used to check whether file exits
*/

import java.io.*;

public class FileDemo {

    public static void main(String[] args) throws Exception{

        /*
        File mydir = new File("MyDir");
        mydir.mkdir(); // creates a directory/folder with name "MyDir"

        File f1 = new File(mydir,"item.txt");
        f1.createNewFile();
        */

        File f1 = new File("item.txt");
        if (f1.exists())
        {
            System.out.println("File already exists.");
            FileInputStream fis = new FileInputStream("item.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int size = fis.available();
            byte[] buffer = new byte[size];
            fis.read(buffer);
            String s = new String(buffer); // converts byte[] to String
            System.out.println(s);
            fis.close();
        }
        else
        {
            f1.createNewFile();
            FileOutputStream fos = new FileOutputStream(f1);
            fos.write(("My name is Sanchit Ruia,\nKimmi is my best friend.").getBytes());
            System.out.println("File created");
            fos.close();

        }
    }
}
