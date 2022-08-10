package Homework.Homework1;

import java.io.FileWriter;
import java.io.IOException;

public class createFile {
    static void saveFile(String name, String str) throws IOException{
        FileWriter fw = new FileWriter(name);
        fw.write(str);
        fw.flush();
        fw.close();
    }  
}
