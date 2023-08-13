package dev.harini.sorting;

/*
Insertion Sort
Best Time Complexity: O(n)
Worst Time Complexity: O(n^2)
Average Time Complexity: O(n^2)
Stable: Yes
In-Place: Yes
Adaptive: Yes (it reduces its total number of steps i.e O(n) if given a partially sorted list, hence it increases its efficiency)
Online: Yes (can sort a list as it receives it)
Use for small or partially sorted arrays
 */

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        int length = arr.length;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swapElements(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }

    private static void swapElements(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
