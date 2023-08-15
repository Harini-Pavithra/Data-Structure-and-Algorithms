package dev.harini.sorting;

/*
Bubble Sort/ Sinking Sort/ Exchange Sort/ Comparison sort algorithm
Best case: O(n)
Average case: O(n^2)
Worst case: O(n^2)
Stable: Yes
In-place: Yes
Adaptive: Yes
Rarely used, insertion sort can be preferred over bubble sort as it is faster.
Bubble sort is used when the array is almost sorted or when the array is small, or array is sorted in reverse order.

Example:
5 1 4 2 8
1st Iteration (Compare 5 and 1, swap as 5>1): 1 5 4 2 8
2nd Iteration (Compare 5 and 4, swap as 5>4): 1 4 5 2 8
3rd Iteration (Compare 5 and 2, swap as 5>2): 1 4 2 5 8
4th Iteration (Compare 5 and 8, no swap as 5<8): 1 4 2 5 8
Now, the largest element is at the end of the array.

5th Iteration (Compare 1 and 4, no swap as 1<4): 1 4 2 5 8
6th Iteration (Compare 4 and 2, swap as 4>2): 1 2 4 5 8
7th Iteration (Compare 4 and 5, no swap as 4<5): 1 2 4 5 8
8th Iteration (Compare 5 and 8, no swap as 5<8): 1 2 4 5 8
Now, the second largest element is at the end of the array and goes on
*/

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        int length = arr.length-1;
        for(int i=0;i<length;i++){
            boolean swap = false;
            for(int j=i+1;j<length-i;j++){
                if(arr[j] < arr[j-1]){
                    swap = true;
                    // Swapping adjacent elements if they are in wrong order
                    swapElements(arr, j, j-1);
                }
                // If no swap is done in the inner loop, it means the array is sorted
                if(!swap){
                    break;
                }
            }
        }
        return arr;
    }
    public static void swapElements(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
