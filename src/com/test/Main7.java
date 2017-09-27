package com.test;

import java.util.Scanner;

/**
 * Created by boo on 2017/9/9.
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int[] arr1 = new int[2];
            int k =0;
            int road =0;
            for (int s =0;s<2;s++) {
                arr1[s] = sc.nextInt();
            }
            int n = arr1[0] - 1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            /*for(int j=0;j<n;j++){
                if(){}
            }*/
        }
    }
}
