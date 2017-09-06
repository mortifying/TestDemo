package com.test;

import java.util.Scanner;

/**
 * Created by boo on 2017/9/6.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            int max = 0;
            StringBuffer sb = new StringBuffer();
            String maxStr = "";
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    sb.append(str.charAt(i));
                    if (sb.length() >= max) {
                        max = sb.length();
                        maxStr = sb.toString();
                    }
                }else {
                    //sb = new StringBuffer();
                    sb.delete(0, sb.length());
                }
            }
            System.out.println(maxStr);
            if(!maxStr.equals("")){

                System.out.println(max);
            }
        }
    }
}
