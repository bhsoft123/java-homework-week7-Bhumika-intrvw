package printprogweek7;
// not completed for lower case entry


import java.util.Scanner;
/*9. Same as above program-8 using switch statement*/

public class Prog9_SwitchAlphabetCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any alphabet from A - F");
        char letter = sc.next().charAt(0);
        printCity(letter);

    }
    public static void printCity(char letter1) {
        switch (letter1) {
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bengaluru");
                break;
            case 'C':
                System.out.println("Chandigarh");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Ellora");
                break;
            case 'F':
                System.out.println("Faizabad");
                break;
            default:
                System.out.println("Invalid entry");
                }
    }}