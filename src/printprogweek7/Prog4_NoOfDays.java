package printprogweek7;
// not completed for case 2 calling another method
import java.util.Scanner;

/**4. Number of Days In Month
        Write a method isLeapYear with a parameter of type int named year.
        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        If the parameter is not in that range return false.
        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
        otherwise return false.
        A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
        Example of input/Output:
        ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
        ● isLeapYear(1600); should return true since 1600 is a leap year
        ● isLeapYear(2017); should return false since 2017 is not a leap year
        ● isLeapYear(2000);should return true because 2000 is a leap year
        Write another method getDaysInMonth with two parameter month and year. Both of type
        int.
        If parameter month is < 1 or >12 return -1.
        If parameter year is <1 or >9999 than return -1.
        This method needs to return the number of days in the month. Be careful about leap years
        they have 29 days in month 2 (February).
        You should check if the year is a leap year using the method isLeapYear describe above.
        Example of input/Output:
        ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
        ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
        year.
        ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
        2018 is not a leap year.
        ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
        ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
        9999
        HINT: Use the switch statement.
        NOTE: Methods isLeapYear and getDaysInMonth need to be public static **/

public class Prog4_NoOfDays {
    //main method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
        System.out.println("Enter month and year: ");
        sc.useDelimiter("[\\s,]+");
        int month = sc.nextInt();
        year = sc.nextInt();
        System.out.println("The month of " + month +" in the year " + year +" has " +getDaysInMonth(month, year)+ " days");
        sc.close();
    }

    //method to check valid entries and find leap year
    public static boolean isLeapYear(int y) {
        if (y >= 1 && y <= 9999) {
            if (y % 4 == 0) {
                System.out.println("The year " + y + " is a leap year");
                return true;
            } else {
                System.out.println("The year " + y + " is not a leap year");
                return false;
            }
        } else {
            //System.out.println("invalid input");
            return false;
        }
    }
    /*
another way for isleapyear-
        public static boolean isLeapYear(int year){
            if (year < 1 || year > 9999){
                return false;
            }
            return (year % 4 == 0 && year % 100);
*/

    public static int getDaysInMonth(int month1, int year1) {

        if ((month1 < 1 || month1 > 12) || (year1 < 1 || year1 > 9999)) {
            return -1;
        }
        switch (month1) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear(year1) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;}
             }
        }

                /*case 1:
                    System.out.println("The month of January has 31 days");
                    break;
                case 2:
                    if (isLeapYear(year1) ) {
                    System.out.println("The month of February has 29 days"); }
                    else{
                    System.out.println("The month of February has 28 days");}
                    break;

                case 3:
                    System.out.println("The month of March has 31 days");
                    break;
                case 4:
                    System.out.println("The month of April has 30 days");
                    break;
                case 5:
                    System.out.println("The month of May has 31 days");
                    break;
                case 6:
                    System.out.println("The month of June has 30 days");
                    break;
                case 7:
                    System.out.println("The month of July has 31 days");
                    break;
                case 8:
                    System.out.println("The month of August has 31 days");
                    break;
                case 9:
                    System.out.println("The month of September has 30 days");
                    break;
                case 10:
                    System.out.println("The month of October has 31 days");
                    break;
                case 11:
                    System.out.println("The month of November has 30 days");
                    break;
                case 12:
                    System.out.println("The month of December has 31 days");
                    break;
                default:
                    System.out.println("-1");
            break;
            }
                   return 1;}
    }
    }*/
