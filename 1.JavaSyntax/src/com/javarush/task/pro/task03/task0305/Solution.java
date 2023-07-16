package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        boolean firstAndSecond = (a == b);
        boolean firstAndThird = (a == c);
        boolean secondAndThird = (b == c);
        if (firstAndSecond && secondAndThird)
            System.out.println(a + " " + b + " " + c);
        else if (firstAndSecond)
            System.out.println(a + " " + b);
        else if (firstAndThird)
            System.out.println(a + " " + c);
        else if (secondAndThird)
            System.out.println(b + " " + c);



    }
}
