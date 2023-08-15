package dev.harini.sorting;

/*
Cyclic Sort algorithm
Best case: O(n)
Average case: O(n)
Worst case: O(n)
Stable: No
In-place: Yes
Online: No
Adaptive: No
One pass sort/ one loop sort
Used when the array contains elements in the range 1 to n and the elements are distinct.
 */

public class CyclicSort {
    public static int[] cyclicSort(int[] arr){
        int length = arr.length-1;
        int i = 0;
        while(i < length){
            if(arr[i] != i+1){
                int correct = arr[i]-1;
                swapElements(arr, i, correct);
            }
            else{
                i++;
            }
        }
        return arr;
    }
 
  public static void swapElements(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
