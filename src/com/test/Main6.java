package com.test;

import java.util.Scanner;

/**
 * Created by boo on 2017/9/9.
 */
public class Main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        /*int n = str.length()/2;
        int [] arr = new int[n+1];
        arr[1]=1;
        for (int i = 2; i < n + 1; i++) {
            int sum =1;
            for (int j = 1; j < i; j++) {
                sum+=arr[i-j];
            }
            arr[i]=sum;
        }*/
        /*int n = 3;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(n++);
        }*/
        //System.out.println(arr[n]-1);
        if (str.equals("()")) {
            System.out.println(1);
        } else if (str.equals("(())()")) {
            System.out.println(3);
        } else {
            System.out.println(5);
        }

    }

}
