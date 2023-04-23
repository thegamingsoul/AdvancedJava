package Array;
import java.util.*;

public class FloatSumArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Array Size: ");
        int l = s.nextInt();
        float[] arr = new float[l];

        for (int i=0; i<l; i++){
            arr[i] = s.nextFloat();
        }
        float sum = 0;
        System.out.println("Sum of all elements: ");

        for(int i=0; i<l; i++){
            sum = sum + arr[i];
        }
        System.out.print(sum);

    }
}
