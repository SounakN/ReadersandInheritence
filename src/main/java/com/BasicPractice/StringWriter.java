package com.BasicPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringWriter {

    public static void main(String[] args) throws IOException {
        File f = new File(System.getProperty("user.dir") + "\\src\\main\\moreFiles\\abc1.txt");

        java.io.BufferedReader f1 = new java.io.BufferedReader(new FileReader(f));
        java.io.StringWriter sw = new java.io.StringWriter();
        int x = 0;
        while ((x = f1.read()) != -1) {
            sw.write((char) x);
        }

        String fi = sw.toString();
        System.out.println(fi);

        //Through Input Streams

        java.io.FileInputStream f2 = new java.io.FileInputStream(System.getProperty("user.dir") + "\\src" +
                "\\main\\moreFiles\\abc1.txt");

        java.io.StringWriter sw1 = new java.io.StringWriter();


        java.io.InputStreamReader f3 = new java.io.InputStreamReader(f2);
        BufferedReader br = new BufferedReader(f3);
        x = 0;
        while ((x = br.read()) != -1) {
            sw1.write(x);
        }
         fi = sw1.toString();
        System.out.println(fi);
    }
}
