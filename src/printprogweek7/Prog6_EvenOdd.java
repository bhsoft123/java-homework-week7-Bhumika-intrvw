package printprogweek7;

/*6. Write a java program to input any number and find out if it’s odd or even*/

import java.util.Scanner;

public class Prog6_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");
        }
        sc.close();
    }}

