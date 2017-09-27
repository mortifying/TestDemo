package com.test;

import java.util.Scanner;

/**
 * Created by boo on 2017/9/27.
 */
public class Main10 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {

            int m = cin.nextInt();
            if (m == 1) {
                System.out.println(1);
            } else {
                System.out.println(getPrice(m - 1)+1);
            }
        }
    }

    public static int getPrice(int m){

        int i = 2;
        int sum = 0;
        while (m >= i) {
            m -= i;
            sum += (i-2);
            i++;
        }


        return sum + m;
    }
}
