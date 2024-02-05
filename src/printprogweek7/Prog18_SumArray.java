package printprogweek7;
/* 18. Write a Java program to sum values of an array.*/

import java.util.stream.IntStream;

public class Prog18_SumArray {
    public static void main(String[] args) {
        int a [] = { 3,5,6,7,1};
        int b [] = {2,3,4};
        int sum = IntStream.of(a).sum();
        System.out.println(sum);
        }
}
