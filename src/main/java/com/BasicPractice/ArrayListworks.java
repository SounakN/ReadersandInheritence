package com.BasicPractice;

import java.util.*;

public class ArrayListworks {

    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>(Arrays.asList("Sehena","Amit","Roney"));
      /*  Set c = new TreeSet(Collections.reverseOrder());
        c.addAll(x);

        Collections.sort(x,Collections.reverseOrder());
        System.out.println(x);
        System.out.println(c);*/

        for(int i =0;i<x.size();i++){
            String temp = null;
            for(int j=0;j<x.size()-i-1;j++){
                if(x.get(j).toCharArray()[0] >x.get(j+1).toCharArray()[0]){
                    temp = x.get(j);
                    x.set(j,x.get(j+1));
                    x.set(j+1,temp);
                }
            }
        }
        System.out.println(x);
    }
}
