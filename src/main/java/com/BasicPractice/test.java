package com.BasicPractice;

import java.io.File;
import java.net.URL;
import java.util.Arrays;

public class test {



        public static void main(String args[]) {

            String vo = "aaaiieooooouu";
            char[] wo = {'a', 'e', 'o', 'i', 'u'};

            char[] cd = vo.toCharArray();
            int counter;
            for (int c = 0; c < wo.length; c++) {
                counter = 0;
                for (int c1 = 0; c1 < cd.length; c1++) {
                    if (wo[c] == cd[c1]) {
                        counter++;
                    }

                }
                System.out.println("The character : " + wo[c] + " has occured times :: " + counter);

            }
        }
}
