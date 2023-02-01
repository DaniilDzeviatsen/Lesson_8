import java.util.Arrays;
import java.util.Scanner;


public class HomeWork8 {
    public static void main(String[] args) {
        System.out.println("Enter number of a Task");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 7) {
            throw new IllegalArgumentException("Попридержи коней, тут не так много заданий");
        }

        switch (number) {
            case 1:
                System.out.println("Enter year");
                int year = sc.nextInt();
                System.out.println("The year is leap?");
                System.out.println(DateTimeUtils.dateTimeUtils(year));
                break;
            case 2:
                int[] array = UserInputUtils.createMassive();
                System.out.print("Average value of all elements = ");
                System.out.println(ArrayUtils.calculateAverage(array));
                break;
            case 3:
                int[] array2 = UserInputUtils.createMassive();
                System.out.println(Arrays.toString(ArrayUtils.doReverse(array2)));
                break;
            case 4:
                int[] array3 = UserInputUtils.createMassive();
                System.out.println(ArrayUtils.findNubmer(array3));
                break;
            case 5:
                int[] array4 = UserInputUtils.createMassive();
                System.out.println("Your range is ");
                System.out.println(Arrays.toString(ArrayUtils.getPart(array4, 1, 3)));
                break;
            case 6:
                int[] array5 = UserInputUtils.createMassive();
                System.out.println(Arrays.toString(ArrayUtils.showPage(array5)));
                break;
        }

    }
}
