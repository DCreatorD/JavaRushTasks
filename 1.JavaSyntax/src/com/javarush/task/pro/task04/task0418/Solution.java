package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner sc = new Scanner(System.in);
        boolean status = sc.nextBoolean();
        if (status == true) {
            System.out.println((int) Math.ceil(glass));
        } else if (status == false) {
            System.out.println((int) Math.floor(glass));
        }

    }
}