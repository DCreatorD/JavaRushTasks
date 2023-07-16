package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while (true) {
            if (console.hasNextInt()) {
                int number = console.nextInt();
                sum += number;
            }
            else if (console.hasNextLine()) {
                String word = console.nextLine();
                if (word.equals("ENTER")) {
                    break;
                }

            }
        }
        System.out.println(sum);
    }
}