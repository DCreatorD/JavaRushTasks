package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int a = console.nextInt();
            if (a > max && (a % 2) == 0) {
                max = a;
            }

        }
        System.out.println(max);
    }
}