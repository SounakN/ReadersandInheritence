package com.BasicPractice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {

    public static void main(String[] args) throws IOException {
        File f  = new File(System.getProperty("user.dir")+"\\src\\main\\moreFiles\\abc1.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        java.io.BufferedWriter f1 = new java.io.BufferedWriter(new FileWriter(f,true));
        f1.write("\n");
        f1.write("This is not a life");
        f1.close();
    }
}
