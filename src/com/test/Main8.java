package com.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by boo on 2017/9/20.
 */
public class Main8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){

            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);

        int sum =0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            if(sum>=t){
                sum=sum-a[i];
                break;
            }
        }
        sum =sum+a[n-1];
        System.out.println(sum);

    }
}
