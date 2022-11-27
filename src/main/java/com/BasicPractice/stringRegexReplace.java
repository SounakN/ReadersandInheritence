package com.BasicPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class stringRegexReplace {

    public static void main(String[] args) {
        String f = "SED@ def#@ #$DF1S";

      /*  StringBuilder ff = new StringBuilder(f);
        ff.reverse();*/


        f = f.replaceAll("[^0-9a-zA-Z\\s]","");
        System.out.println(f);
    }
}
