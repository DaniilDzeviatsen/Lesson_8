import java.util.Arrays;
import java.util.Scanner;


public class HomeWork8 {
    public static void main(String[] args) {
        System.out.println("Enter number of a Task");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1 -> {
                System.out.println("Enter year");
                int year = sc.nextInt();
                System.out.println("The year is leap?");
                System.out.println(DateTimeUtils.isYearLeap(year));
            }
            case 2 -> {
                int[] array = UserInputUtils.createMassive();
                System.out.print("Average value of all elements = ");
                System.out.println(ArrayUtils.calculateAverage(array));
            }
            case 3 -> {
                int[] array2 = UserInputUtils.createMassive();
                System.out.println(Arrays.toString(ArrayUtils.doReverse(array2)));
            }
            case 4 -> {
                int[] array3 = UserInputUtils.createMassive();
                System.out.println("Enter the element you need");
                int num = sc.nextInt();
                System.out.println(ArrayUtils.getNumIndex(array3, num));
            }
            case 5 -> {
                int[] array4 = UserInputUtils.createMassive();
                System.out.println("Enter first index");
                int indexFrom = sc.nextInt();
                System.out.println("Enter last exclusive index");
                int indexToExclusive = sc.nextInt();
                System.out.println("Your range is ");
                System.out.println(Arrays.toString(ArrayUtils.getPart(array4, indexFrom, indexToExclusive)));
            }
            case 6 -> {
                int[] array5 = UserInputUtils.createMassive();
                System.out.println("Enter quantity of pages");
                int pageNum = sc.nextInt();
                System.out.println("Enter number of elements on each page");
                int numOfElements = sc.nextInt();
                System.out.println("Your page contains:");
                System.out.println(Arrays.toString(ArrayUtils.showPage(array5, pageNum, numOfElements)));
            }
            default -> System.out.println("Wrong number");
        }

    }
}
