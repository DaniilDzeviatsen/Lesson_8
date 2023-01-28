import java.util.Scanner;

public class DateTimeUtils {
    public static void main(String[] args) {
        System.out.println("Enter an year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (dateTimeUtils(year)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }

    public static boolean dateTimeUtils(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

    }
}
