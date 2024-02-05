package printprogweek7;
/* 17. Write a Java program to sort a numeric array and a string array.*/

import java.util.Arrays;

public class Prog17_SortArray {
    public static void main(String[] args) {
        int a[] = {4,3,9,1,0, 11};
        String b []  = {"Lucy", "Amy", "Charlie", "John"};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        }
}
