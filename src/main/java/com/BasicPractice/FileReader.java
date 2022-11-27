package com.BasicPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public static void main(String[] args) throws IOException {
        File f  = new File(System.getProperty("user.dir")+"\\src\\main\\moreFiles\\abc.txt");
        java.io.FileReader f1 = new java.io.FileReader(f);

        int c = f1.read();
        StringBuilder fff = new StringBuilder();
        while(!(c ==-1)){
            fff.append(Character.toString(c));
            System.out.print(Character.toString(c));
            c = f1.read();
        }
        System.out.println("From the String buffer :: "+fff);

        f  = new File(System.getProperty("user.dir")+"\\src\\main\\moreFiles\\abc.txt");
        f1 = new java.io.FileReader(f);

        char[] x = new char[(int) f.length()];

        f1.read(x);
        for(char e:x){
            System.out.print(e);
        }


    }
}
