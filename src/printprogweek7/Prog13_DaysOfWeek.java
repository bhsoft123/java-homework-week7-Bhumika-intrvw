package printprogweek7;
/*13. Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days” */

import java.util.Scanner;

public class Prog13_DaysOfWeek {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weekday in number: ");
        int day = sc.nextInt();
        dayofweek(day);
        sc.close();
    }
    //method to find and display day of the week
    public static void dayofweek(int day){
        switch(day){
            case 1: System.out.println("MONDAY"); break;
            case 2: System.out.println("TUESDAY"); break;
            case 3: System.out.println("WEDNESDAY");break;
            case 4: System.out.println("THURSDAY");break;
            case 5: System.out.println("FRIDAY");break;
            case 6: System.out.println("SATURDAY");break;
            case 7: System.out.println("SUNDAY");break;
            default:System.out.println("Week contains 1 to 7 days");
        }
    }
}
