package com.test;

import java.util.Scanner;

/**
 * Created by boo on 2017/9/27.
 */
public class Main11 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n];
        for (int i =0;i<n;i++) {
            a[i] = cin.nextInt();
        }
        cin.close();
        if(bubblesort(a,n)){
            System.out.println("no");
            return;
        }
        int start = 0;
        int end = 0;
        boolean flag =false;
        int temp = 0;
        for (int i =0;i<n-1;i++) {
            if (a[i] > a[i + 1] && !flag) {
                start = i;
                temp=start;
                flag = true;
            }
            if (a[i] < a[i + 1] && flag) {
                end = i;
                flag = false;
            }
        }
        if (start != temp) {
            System.out.println("no");
            return;
        }
        if (end == 0 && flag) {
            System.out.println("yes");
            return;
        }
        for(int i=start,j=end;i<= (start + end) / 2;i++,j--) {
            int tem =a[i];
            a[i]=a[j];
            a[j]=tem;
        }
        if (bubblesort(a, n)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    public static boolean bubblesort(int[] a,int n){
        //int i = n - 1;
        int pos = 0;
        for (int j = 0; j < n-1; j++) {
            if (a[j] > a[j + 1]) {
                pos = j + 1;
            }
        }
        if (pos == 0) {
            return true;
        } else return false;

    }
}
