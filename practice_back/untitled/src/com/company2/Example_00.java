package com.company2;

import java.util.Arrays;
import java.util.Scanner;

public class Example_00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = sc.nextInt();

        int [] answer = new int[num];

        int nSum = num * (num + 1) / 2;
        int startNum = (total - nSum) / num;

        for(int i = 1; i < num + 1; i++) {
            answer[i - 1] = i + startNum;
        }

        System.out.println(Arrays.toString(answer));
    }


}
/*
        연속된 수의 표현 : ( x + 1) + ( x + 2 ) + ( x + 3 )
        연속된 수 1,2,3...
        x를 더해주면서 그 값을 찾음

        ex) num = 3, total 12;
        int nSum = 3 * 4 / 2 = 6
        int startNum = (12 - 6) / 3 = 2;
        x = 2로 [3, 4, 5]가 출력

 */
