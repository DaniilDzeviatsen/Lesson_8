import java.util.Arrays;
import java.util.Scanner;

public class UserInputUtils {
    public static void main(String[] args) {
        int [] array=createMassive();
        System.out.println(Arrays.toString(array));
    }
public static int [] createMassive(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array length");
    int arrlength=sc.nextInt();
    int [] array = new int[arrlength];
    for (int i=0; i<arrlength; i++){
        System.out.println("Enter value of "+ i+ " element");
        array[i]=sc.nextInt();
    }return array;
}
}
