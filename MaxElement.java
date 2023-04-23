package Array;
import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Array Size: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        int max = 0;

        for (int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }

        for (int i=0; i<size; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Max Element: " + max);
    }
}
