package printprogweek7;

import java.util.Scanner;

public class Prog1_OddEven {

    /* Write a java program that tells us that Input number is odd or even?
    HINT: use ternary operator (? :) */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int number = sc.nextInt();
        String msg = (number % 2 ==0) ? "The number is even" : "The number is odd";
        System.out.println(msg);
        sc.close();
        }
        }


