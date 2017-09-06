package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by boo on 2017/9/6.
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m <= 1 || m >= 100) {
            System.out.println("ERROR!");
            return;
        }
        List<Integer> list = new LinkedList<>();
        for(int i = 1;i<=100;i++){
            list.add(i);
        }
        int k =0;
        while (list.size() >= m) {
            k = (k + m) % list.size() - 1;
            if (k < 0) {
                list.remove(list.size() - 1);
                k = 0;
            }else {
                list.remove(k);
            }
        }
        for (int i=0;i<list.size();i++) {
            if (i == 0) {
                System.out.print(list.get(i));
            } else {
                System.out.print("," + list.get(i));
            }
        }
    }
}
