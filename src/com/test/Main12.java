package com.test;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by boo on 2017/9/27.
 */
public class Main12 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        String str01 = cin.nextLine();
        //StringBuffer sb = new StringBuffer();
        int count = 0;
        for (int i=0;i<str.length();i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                if(str01.charAt(i)=='1'){
                    count++;
                }
            }else {
                if(str01.charAt(i)=='0'){
                    count++;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("0.00");
        float f = (float) count / (float) str.length();
        System.out.println(df.format(f* 100)  + "%");

    }
}
