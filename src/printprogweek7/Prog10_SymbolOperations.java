package printprogweek7;

/*10. Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else*/

import java.util.Scanner;
//
public class Prog10_SymbolOperations {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\\s,]+");    // takin input in one line
        System.out.println("Enter expression ( a+b)/(a-b)/a*b/a/b with space in between (i.e. 3 + 4:) ");
        int x = sc.nextInt();
        char z = sc.next().charAt(0);
        int y = sc.nextInt();

        int d = calculate(x, y, z);  //calling calculate method
        System.out.print("= "+ d);
        sc.close();
        }
    public static int calculate(int x, int y, char z){
        int ans;
        if (z == '+'){
            ans = x+y;}
        else if (z =='-'){
            ans = x-y;}
        else if (z == '*'){
            ans = x*y;}
        else if (z =='/'){
            ans = x/y;}
        else {
            ans =0;}
        return ans;
            }
}
