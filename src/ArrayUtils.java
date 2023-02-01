import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(calculateAverage(arr));
        System.out.println(Arrays.toString(doReverse(arr)));
        System.out.println(findNubmer(arr));
        System.out.println(Arrays.toString(getPart(arr, 3, 7)));
        System.out.println(Arrays.toString(showPage(arr)));
    }

    public static double calculateAverage(int[] array) {
        if (array.length <= 0) {
            throw new IllegalArgumentException("введено некорректное значение");
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double ave = sum / array.length;
        return ave;
    }

    public static int[] doReverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int r = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - i - 1] = r;
        }
        return array;
    }

    public static int findNubmer(int[] array) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find");
        int num = sc.nextInt();
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] == num) {
                return i;
            }

        }
        return -1;

    }

    public static int[] getPart(int[] array, int indexFrom, int indexTo) {
        if (indexFrom > indexTo) {
            throw new IllegalArgumentException("начальный индекс должен быть больше конечного, введите корректные значения");
        }
        int subArrayLength = indexTo - indexFrom;
        int[] subArray = new int[subArrayLength];

        for (int i = indexFrom, j = 0; (i < indexTo && j < subArrayLength); i++, j++) {
            subArray[j] = array[i];

        }
        return subArray;
    }

    public static int[] showPage(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter page number");
        int pageNum = sc.nextInt();
        System.out.println("Enter number of elements on one page");
        int numOfElements = sc.nextInt();
        int[] subArray = new int[numOfElements];
        if (pageNum * numOfElements <= array.length) {
            for (int i = pageNum * numOfElements - numOfElements, k = 0; (i < pageNum * numOfElements && k < numOfElements); i++, k++) {

                subArray[k] = array[i];
            }
            return subArray;
        } else if (pageNum * numOfElements > array.length) {
            int[] subArray2 = new int[numOfElements * pageNum - array.length];
            for (int i = pageNum * numOfElements - numOfElements, k = 0; (i < array.length && k < numOfElements * pageNum - array.length); i++, k++) {
                subArray2[k] = array[i];
            }
            return subArray2;
        }
        return subArray;


    }

}




