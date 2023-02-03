public class ArrayUtils {
    public static double calculateAverage(int[] array) {
        if (array.length < 0) {
            throw new IllegalArgumentException("введено некорректное значение");
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum / array.length;
    }

    public static int[] doReverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int r = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - i - 1] = r;
        }
        return array;
    }

    public static int getNumIndex(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }

        }
        return -1;

    }

    public static int[] getPart(int[] array, int indexFrom, int indexToExclusive) {
        if (indexFrom > indexToExclusive || indexFrom < 0 || indexToExclusive > array.length) {
            throw new IllegalArgumentException("введены некорректные значения");
        }
        int subArrayLength = indexToExclusive - indexFrom;
        int[] subArray = new int[subArrayLength];

        for (int i = indexFrom, j = 0; i < indexToExclusive; i++) {
            subArray[j] = array[i];
            j++;
        }
        return subArray;
    }

    public static int[] showPage(int[] array, int pageNum, int numOfElements) {
        if (array.length < (pageNum - 1) * numOfElements + 1 || pageNum < 1 || numOfElements < 1) {
            throw new IllegalArgumentException("wrong page number");
        }
        int indexFrom = (pageNum - 1) * numOfElements;
        int indexToExclusive = pageNum * numOfElements;
        if (indexToExclusive > array.length) {
            indexToExclusive = array.length;
        }
        int[] subArray = getPart(array, indexFrom, indexToExclusive);
        return subArray;


    }

}




