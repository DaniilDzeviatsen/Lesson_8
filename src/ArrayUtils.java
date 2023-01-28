public class ArrayUtils {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
               System.out.println(calculateAverage(arr));
    }

public static double calculateAverage(int [] array) {
    double sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum = sum + array[i];
    }
    double ave = sum / array.length;
    return ave;
}
}
