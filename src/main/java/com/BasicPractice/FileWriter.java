package com.BasicPractice;

import java.io.File;
import java.io.IOException;

public class FileWriter {

    public static void main(String[] args) throws IOException {
        File f  = new File(System.getProperty("user.dir")+"\\src\\main\\moreFiles\\abc.txt");
        if(!f.exists()){
            f.createNewFile();
        }

        java.io.FileWriter f1 = new java.io.FileWriter(f,true);
        String val = "This is a new life";
        f1.write("\n");
        f1.write(val);

        f1.close();
    }
}
