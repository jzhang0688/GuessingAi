package com.company;
import java.util.Scanner;

public class ScannerGuess {

    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int correct = 88;
        Scanner input = new Scanner(System.in);
        double numdouble = Math.random();
        int randomnum = (int) (numdouble * 100 + 1);
        System.out.println(randomnum);
        while (randomnum != correct) {
            if (input.nextLine().equals("too high"))
            {
                max = randomnum;
                randomnum = ((max + min) / 2);
                System.out.println(randomnum);
            }
            if (input.nextLine().equals("too low"))
            {
                min = randomnum;
                randomnum = ((min+max)/2);
                System.out.println(randomnum);
            }
            if (input.nextLine().equals("Correct"))
            {
                System.out.println("I got it!");
            }
        }

    }
}
