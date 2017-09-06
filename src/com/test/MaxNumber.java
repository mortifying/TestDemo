package com.test;

import java.util.Scanner;

/**
 * Created by boo on 2017/9/5.
 */
public class MaxNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            for (int i=0;i<n;i++) {
                sb.append(sc.nextInt() +" ");
            }
            maxNumber(n,sb.toString());
        }
    }

    public static void maxNumber(int n,String str){

        String[] num = str.split(" ");
        StringBuffer sb = new StringBuffer();
        String max;
        for(int i = 0;i<n-1;i++){
            for(int j=i;j<n-i-1;j++){
                //int sublen = num[j].length() < num[j + 1].length() ? num[j].length() : num[j + 1].length();
                int sublen = 0;
                int maxstr = -1;
                if (num[j].length() < num[j + 1].length()) {
                    sublen = num[j].length();
                    maxstr = j + 1;
                } else {
                    sublen = num[j + 1].length();
                    maxstr = j;
                }
                if(num[j].substring(0, sublen).compareTo(num[j + 1].substring(0, sublen)) != 0){
                    if (num[j].compareTo(num[j + 1]) < 0) {
                        max = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = max;
                    }
                }else {
                    if (maxstr == j) {
                        if (num[j].substring(sublen).compareTo(num[j + 1]) < 0) {
                            max = num[j];
                            num[j] = num[j + 1];
                            num[j + 1] = max;
                        }
                    }else {
                        if (num[j].compareTo(num[j + 1].substring(sublen)) < 0) {
                            max = num[j];
                            num[j] = num[j + 1];
                            num[j + 1] = max;
                        }
                    }
                }

            }

        }
        for(int i =0;i<n;i++){
            sb.append(num[i]);
        }

        System.out.println(Integer.parseInt(sb.toString()));
    }

}
