import java.util.Scanner;
public class TotalNumberOfDays {

    public static void main(String[] args) {
        // This program will print the total number of days in a month.
        int month;
        int year;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter year to check Leap year");
        year=input.nextInt();
        boolean Leap = (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0);        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Month to know number of days");
        month=in.nextInt();
        switch(month)
        {
            case 1 :
                System.out.println("No of days are 31");
                break;
            case 2 :
                if (Leap)
                    System.out.println("No of days are 29");
                else
                    System.out.println("No of days are 28");
                break;
            case 3 :
                System.out.println("No of days are 28");
                break;
            case 4 :
                System.out.println("No of days are 30");
                break;
            case 5 :
                System.out.println("No of days are 31");
                break;
            case 6 :
                System.out.println("No of days are 30");
                break;
            case 7 :
                System.out.println("No of days are 31");
                break;
            case 8 :
                System.out.println("No of days are 31");
                break;
            case 9 :
                System.out.println("No of days are 31");
                break;
            case 10 :
                System.out.println("No of days are 31");
                break;
            case 11 :
                System.out.println("No of days are 31");
                break;
            case 12 :
                System.out.println("No of days are 31");
                break;
            default :
                System.out.println("Invalid month entry");
                break;                
                
        }
        
    }
    
}
