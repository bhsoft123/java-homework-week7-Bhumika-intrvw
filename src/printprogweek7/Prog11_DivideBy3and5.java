package printprogweek7;

/*11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.*/

public class Prog11_DivideBy3and5 {
    public static void main(String[] args) {
        int i;
        System.out.println("\n\n Numbers between 1 to 100 which are divisible by 3 are :");
        for (i =1; i<=100; i++) {
            if (i % 3 == 0) {
                System.out.print(i +" ,"); }
        }
        System.out.println("\n\n Numbers between 1 to 100 which are divisible by 5 are:");
        for (i =1; i<=100; i++){
            if (i%5==0){
                System.out.print(i+ " ,");}
        }}}
