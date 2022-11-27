package com.BasicPractice;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileReader;

public class BufferedReader {

    public static void main(String[] args) throws IOException {
        File f  = new File(System.getProperty("user.dir")+"\\src\\main\\moreFiles\\abc1.txt");

        java.io.BufferedReader f1 = new java.io.BufferedReader(new FileReader(f));
        String c = null;
        while((c = f1.readLine()) !=null){
            System.out.println(c);
        }
    }
}
