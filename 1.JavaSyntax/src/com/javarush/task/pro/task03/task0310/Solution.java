package com.javarush.task.pro.task03.task0310;

import java.util.Scanner;

/* 
Через тернии...
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
        boolean lower = (number < 5);
        boolean higher = (number > 5);
        boolean exist = (number == 5);

        if (lower)
            System.out.println("число меньше 5");
        else if (higher)
            System.out.println("число больше 5");
        else
            System.out.println("число равно 5");
    }
}
