package dev.harini.sorting;

/*
Selection Sort/ In-Place comparison sort algorithm
Best case: O(n^2)
Average case: O(n^2)
Worst case: O(n^2)
Stable: No
In-place: Yes
Adaptive: No
Online: No
Rarely used, insertion sort can be preferred over selection sort as it is faster.
Selection sort is used when the array is almost sorted or when the array is small or array is sorted in reverse order.
 */

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int length = arr.length;
        // Find the max/min element and replace it with last/first element
        for(int i=0;i<length;i++){
            int last = length-1-i;
            int max_index = 0;
            for(int j=1;j<=last;j++){
                if(arr[j]>arr[max_index]){
                    max_index = j;
                }
            }
            swapElements(arr, max_index,last);
        }
        return arr;
    }

    private static void swapElements(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}
