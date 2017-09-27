package com.test;

import java.util.Scanner;

/**
 * Created by boo on 2017/9/6.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.equals("") || str == null) {
            return;
        }

        int count = 0;
        int temp =0;
        int begin = -1;
        int end = -1;
        for(int i =0;i<str.length();i++){

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                if(count==0){
                    begin = i;
                }
                count++;
                //end = i;
                //temp = count;
                if (i == str.length() - 1) {
                    end = i;
                }
            }else {
                if (count > temp) {
                    temp = count;
                    end = i;
                }
                count = 0;
            }

        }

        //System.out.println(begin+"    "+end);
        if (temp == 0) {
            System.out.println("");
            System.out.println(0);
        }else {
            if (str.charAt(str.length()-1)>= '0' && str.charAt(str.length()-1) <= '9') {
                System.out.println(str.substring(begin, end + 1));
            } else {
                System.out.println(str.substring(begin,end));
            }

            System.out.println(temp);
        }

    }
}
