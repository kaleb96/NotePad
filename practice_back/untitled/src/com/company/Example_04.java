package com.company;

import java.util.Arrays;

public class Example_04 {
    public static void main(String[] args) {
        String[] str = {"aye", "ye", "woo", "ma"};
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int answer = 0;

        for (String bab : babbling) {
            for (String dest : str) {
                bab = bab.replaceFirst(dest, " ");
                System.out.println("dest =" + dest);
                System.out.println("bab_0 = " + bab);
            }

            if (bab.replaceAll(" ", "").equals("")) answer++;
            System.out.println(bab);
        }


    }
}
