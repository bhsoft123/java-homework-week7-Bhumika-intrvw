package printprogweek7;

/*7. Write a java program input sales id, seller's name, sales amount, and salary basic and
        then fined this sales
        Commission
        Sales amount >= 50,000 35%
        Sales amount >= 30,000 20%
        >= 20,000 10%
        >= 10,000 5%
< 10,000 2%*/

import java.util.Scanner;

public class Prog7_Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter saler id:");
        String salerID= sc.nextLine();
        System.out.println("Enter saler name:");
        String salerName= sc.nextLine();
        System.out.println("Enter Basic Salary:");
        int salaryBasic = sc.nextInt();
        System.out.println("Enter sales amount:");
        int salesAmount = sc.nextInt();
        sc.close();
        double com = commission(salesAmount);
        System.out.println("Your commission is : " +com);
}
    public static double commission(int salesAmount1){
        if (salesAmount1 >= 50000){
            return salesAmount1*0.35;}
        else if (salesAmount1 >=30000 && salesAmount1<50000){
            return salesAmount1*0.2;}
        else if (salesAmount1 >= 20000 && salesAmount1 <30000){
            return salesAmount1*0.1;}
        else if (salesAmount1 >=10000 && salesAmount1 <20000){
            return salesAmount1*0.05;}
        else {
            return salesAmount1*0.02;}
}
}
