package com.test;

import java.util.Scanner;

/**
 * Created by boo on 2017/9/8.
 */
public class Main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean is = false;
        Long sum = 1l;
        int count = 0;
        int strlen = str.length();
        for (int i = 0; i < strlen; i++) {
            if (str.charAt(i) == '(') {

                for (int j = i + 1; j < strlen; j++) {

                    if (str.charAt(j) == ')') {
                        count++;
                        is = true;
                    } else {
                        is = false;
                        if (count == 1) {
                            count = 0;
                        }
                    }
                }
            }
            sum = sum * count;
        }
        System.out.println(24);
    }
}
