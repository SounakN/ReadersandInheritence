package com.BasicPractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class InputStreamReader {

    public static void main(String[] args) throws IOException {
        java.io.FileInputStream f = new java.io.FileInputStream(System.getProperty("user.dir")+"\\src" +
                "\\main\\moreFiles\\abc2.txt");

/*
        int e;

        while((e=f.read())!=-1){
            System.out.print((char)e);
        }*/
        

        java.io.InputStreamReader f1 = new java.io.InputStreamReader(f);
        int c;
        while((c=f1.read())!=-1){
            System.out.print((char)c);
        }

    }
}
