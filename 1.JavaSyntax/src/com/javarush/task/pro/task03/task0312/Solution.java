package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String first = console.nextLine();
        String second = console.nextLine();
        if (first.equals(second))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}
