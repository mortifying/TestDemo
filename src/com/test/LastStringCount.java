package com.test;

import java.util.Scanner;

/**
 * Created by root on 2017/9/5.
 */
public class LastStringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //int strLength = str.length();
        String substr = str.trim();
        //System.out.println(substr.lastIndexOf(" "));
        System.out.println(substr.length() - substr.lastIndexOf(" ") - 1);
    }
}
