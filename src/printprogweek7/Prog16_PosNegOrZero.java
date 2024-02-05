package printprogweek7;
/*16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”*?
 */

import java.util.Scanner;

public class Prog16_PosNegOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive or negative number:");
        int num= sc.nextInt();
        if(num >0){
            System.out.println(num +" is positive number");}
        else if (num <0){
            System.out.println(num +" is negative number");}
        else {
            System.out.println(num +" is zero");}
        sc.close();
        }
}
