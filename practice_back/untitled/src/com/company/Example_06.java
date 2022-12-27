package com.company;

import java.util.Arrays;

public class Example_06 {
    public static void main(String[] args) {
        //등비 등차수열

      int [] testCase = { 2, 4, 8 };
      int indexNum = testCase.length;
      int answer = 0;
      int del = testCase[1] - testCase[0];
      int del2 = testCase[indexNum-1] - testCase[indexNum-2];


      if(del == del2) {

          answer = testCase[indexNum-1] + del2;
          System.out.println(Arrays.toString(testCase) + " " +answer);
      } else {
          System.out.println("등비");
          int multiple = testCase[indexNum-1]/ testCase[indexNum-2];
          System.out.println(multiple);
          answer = testCase[indexNum-1] * multiple;
          System.out.println( Arrays.toString(testCase) + " " +answer);

      }

    }
}
/*
 testCase = { 1, 2, 3, 4 }

 [1, 2, 3, 4]	5

 testCase = {2, 4, 8 }
 [2, 4, 8]	16

 */