package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int m = 1;
            while (m <= 20) {
                if (i == 1 || i == 10 ) {
                    System.out.print("Б");
                        } else if (m == 1 || m == 20) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                       }
                m++;

            }
            System.out.println();
            i++;
        }

    }
}