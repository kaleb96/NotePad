package com.company;

import java.util.Scanner;

public class Example_05 {
    public static void main(String[] args) {
        // n + n + 1 = 특정 수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0, cnt = 1;

        n -= cnt;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0)
                answer++;
        }
        System.out.println(answer + 1);
    }
}

//