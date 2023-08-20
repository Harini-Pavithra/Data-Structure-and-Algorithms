package dev.harini.sorting;

/*
Best Case Time Complexity: O(nlogn)
Worst Case Time Complexity: O(n^2)
Average Case Time Complexity: O(nlogn)
Space Complexity: O(logn)
Stable: No
In-Place: Yes
Online: No
Adaptive: No
 */


import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pivotIndex = findPivot(arr, start, end);
            quickSort(arr, start, pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }

    public static int findPivot(int[] arr, int start, int end){
        int pivot = arr[start];
        int low = 0;
        int high = arr.length-1;

        while(low < high){
            while(arr[low] <= pivot && low < end){
                low++;
            }
            while(arr[high] > pivot && high > start){
                high--;
            }
            if(low<high){
                swap(arr, low, high);
            }
        }
        swap(arr, start, high);
        return high;
    }
    public static void swap(int[] arr, int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
