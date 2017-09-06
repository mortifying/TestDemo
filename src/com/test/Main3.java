package com.test;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by boo on 2017/9/6.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] w = new int[n];
        for (int i =0;i<n;i++){
            w[i] = sc.nextInt();
        }
        sc.close();
        if (n <= m) {
            Arrays.sort(w);
            System.out.println(w[n-1]);
            return;
        }
        int[] xy = new int[m];
        for(int i=0;i<m;i++){
            xy[i] = w[i];
        }
        int time=0;
        int count = m-1;
        while (count < n) {
            if (count != m - 1) {
                xy[0] = w[count];
            }
            Arrays.sort(xy);
            int min = xy[0];
            for(int i=0;i<m;i++) {
                xy[i] -= min;
            }
            time += min;
            count++;
        }
        Arrays.sort(xy);
        time += xy[m - 1];
        System.out.println(time);
    }
}
