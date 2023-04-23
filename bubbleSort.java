package Array;
import java.util.*;

public class bubbleSort {
    public static void main (String [] args){
        int[] myArray = {7, 9, 3, 5, 2, 6, 1};
        bubble(myArray);
        System.out.println(Arrays.toString(myArray));
        //converts the array into a string format with square brackets
    }

    public static void bubble(int[] arr){          //void because nothing is being returned
        int n = arr.length;                        // the original array is being sorted
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){            //for each element multiple swaps are
                if(arr[j]>arr[j+1]){               //done -> two loops required
                    swap(arr, j, j+1);          
                }
            }
        }
    }

    //arr argument for swap function to modify the original array
    //if no array argument was given, the swap would not have affected the original array
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
