package printprogweek7;

/*12. Write a program that tells us input value is number or an alphabet or symbol.

ASCII value ranges-
        For capital alphabets 65 – 90
        For small alphabets 97 – 122
        For digits 48 – 57
        For symbols 32 - 47, 91 - 96, 123 - 127 up to 255*/

import java.util.Scanner;

public class Prog12_IdentifyInputValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or alphabet or symbol");
        char entry = sc.next().charAt(0);
        checkentry(entry);
        sc.close();
    }
    public static void checkentry(char entry){
        if ((entry >= 65 && entry <=90 )|| (entry >=97 && entry <= 122)){
            System.out.println(entry + " is an Alphabet");}
        else if (entry >= 48 && entry <=57){
            System.out.println(entry + " is a Digit");}
        else if ((entry >= 32 && entry <= 47) || (entry >= 91 && entry <= 96) || (entry >=123 && entry <= 255)){
            System.out.println(entry + " is a Symbol");}
        else {
            System.out.println("Unrecognised entry");}
        }
    }
