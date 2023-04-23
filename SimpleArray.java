package Array;
import java.util.*;

public class SimpleArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Elements: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i=0; i<size; i++){ 
            arr[i] = s.nextInt();
        }   

        for (int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
