package printprogweek7;

/*8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Prog8_Alphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any alphabet from A - F");
        char letter = sc.next().charAt(0);
        printCity(letter);

    }
    public static void printCity(char letter1){
        if (letter1 == 'A' || letter1 =='a'){
            System.out.println("Ahmedabad");}
        else if(letter1 == 'B' || letter1=='b'){
            System.out.println("Bengaluru");}
        else if (letter1 == 'C'|| letter1 == 'c') {
            System.out.println("Chandigarh"); }
        else if (letter1 == 'D' || letter1=='d'){
            System.out.println("Delhi");}
        else if (letter1== 'E' || letter1=='e'){
            System.out.println("Ellora");}
        else if (letter1 =='F' || letter1 =='f'){
            System.out.println("Faizabad");}
        else {
                System.out.println("Invalid entry");
            }}



}
