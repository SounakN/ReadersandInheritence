package com.BasicPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {

    public static void main(String[] args) {
        String val = "?1";
        Pattern p = Pattern.compile("^[\\W][\\s][\\d]$");
        Matcher m = p.matcher(val);
        boolean c = p.matcher(val).find();

        System.out.print(c);
        while( m.find()){
            System.out.println(m.group(0));
        }
    }

}
