package com.BasicPractice;

import java.io.*;

public class OutputStreamWriter {

    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream(System.getProperty("user.dir")+"\\src" +
                "\\main\\moreFiles\\abc2.txt");
        java.io.OutputStreamWriter f1 = new java.io.OutputStreamWriter(f);
        f1.append("\n");
        f1.append("This is the new Life");
        f1.close();
    }
}
