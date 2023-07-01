package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String first = keyboard.nextLine();
        String second = keyboard.nextLine();
        String third = keyboard.nextLine();

        System.out.println(third);
        System.out.println(second.toUpperCase());
        System.out.println(first.toLowerCase());

    }
}
