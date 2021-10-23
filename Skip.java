package Modul9.Homework;

import java.io.File;
import java.io.FileInputStream;

public class Skip {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Vesheron\\Desktop\\Notes.txt");
        FileInputStream fin = new FileInputStream(file);

        int ch;
        // skip first 10 bytes
        fin.skip(10);
        while ((ch = fin.read()) != -1) {
            System.out.print(ch);

        }
    }
}

