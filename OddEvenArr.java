package Array;
import java.util.*;

public class OddEvenArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Size of the Array: ");
        int l = s.nextInt();
        int[] arr = new int[l];

        for(int i=0; i<l; i++ ){
            arr[i] = s.nextInt();
        }

        for(int i=0; i<l; i++){
            if(arr[i] % 2 == 0){
                System.out.println("Even element: " + i);
            }
            else {
                System.out.println("Odd element: "+ i);
            }
        }
    }
}
