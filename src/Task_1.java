import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Enter an year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        checkYear(year);
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
