package printprogweek7;
/*19. Write a Java program to calculate the average value of array elements*/

import java.util.stream.IntStream;

public class Prog19_CalcAverageOfArray {
    public static void main(String[] args) {
        int a[] = {3,4,2};
        double sum = IntStream.of(a).sum();
        int length = a.length;
        System.out.println(sum);
        System.out.println(length);
        double avg = sum/length;
        System.out.println("The average of array elements is : " +avg);
    }
}
