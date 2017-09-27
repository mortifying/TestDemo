package com.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by boo on 2017/9/21.
 */
public class Main9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] =sc.nextInt();
        }
        System.out.println(findmin(a));
    }

    static int findmin(int[] a){
        Arrays.sort(a);
        int m = 1;
        for (int i=0;i<a.length;i++) {
            if (a[i] <= 0) {
                continue;
            }else {
                if (a[i] != m) {
                    return m;
                }
                m++;
            }
        }
        if (a[a.length-1]==0) {
            return 1;
        }else return m;
    }
}
