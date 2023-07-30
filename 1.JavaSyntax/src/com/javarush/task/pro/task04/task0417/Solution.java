package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speedMS = sc.nextInt();
        int speedKMH = (int) Math.round(speedMS * 3.6);
        System.out.println(speedKMH);

    }
}