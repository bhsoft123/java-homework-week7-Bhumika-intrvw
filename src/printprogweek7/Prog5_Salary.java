package printprogweek7;
/*5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|*/

import java.util.Scanner;

public class Prog5_Salary {
        //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empId = sc.nextLine();
        System.out.println("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.println("Enter Basic Salary: ");
        int empSalary = sc.nextInt();
        Prog5_Salary obj = new Prog5_Salary();
        obj.printresult(empId,empName,empSalary);
        sc.close();
    }
        //method to calculate and print
       public static void printresult(String empId, String empName, int empSalary) {


        System.out.println("__________________________________________");
        System.out.println("|                                        |");
        System.out.println("|             Salary Slip                |");
        System.out.println("|________________________________________|");
        System.out.println("|   Employee ID    :    " + empId + "                |");
        System.out.println("|   Employee Name  :    " + empName + "              |");
        System.out.println("|________________________________________|");
        System.out.println("|   Basic Salary   :     " + empSalary + "           |");
        System.out.println("|   HRA            :    " + 0.10*empSalary + "           |");
        System.out.println("|   TA             :    " + 0.08*empSalary + "           |");
        System.out.println("|   DA             :    " + 0.09*empSalary + "           |");
        System.out.println("|   DA             :    " + 0.2*empSalary + "           |");
        System.out.println("|________________________________________|");
        System.out.println("|   Gross Salary   :    " + (empSalary+0.10*empSalary+0.08*empSalary+0.09*empSalary-0.2*empSalary) + "          |");
        System.out.println("|________________________________________|");
    }
}
