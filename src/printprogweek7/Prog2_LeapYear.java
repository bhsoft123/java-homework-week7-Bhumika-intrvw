package printprogweek7;

/*Write a java program to input any year like (ex.2007) and find out if it is leap year or
        not?*/

import java.util.Scanner;

public class Prog2_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if (year % 4 ==0){
        System.out.println("The year " + year + " is a Leap year"); }
        else {
            System.out.println("The year " + year + " is not a Leap year"); }
        sc.close();
        }}
