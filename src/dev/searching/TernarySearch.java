package dev.harini.searching;

/*
Best Case: O(1)
Average Case: O(log n base 3)
Worst Case: O(log n base 3)
 */

public class TernarySearch {
    public static int ternarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid1 = start + (end-start)/3;
            int mid2 = end + (start-end)/3;

            if(arr[mid1] == target){
                return mid1;
            }
            if(arr[mid2] == target){
                return mid2;
            }
            if(target < arr[mid1]){
                end = mid1-1;
            }
            else if(target > arr[mid2]){
                start = mid2+1;
            }
            else if(target > arr[mid1] && arr[mid2] > target){
                start = mid1+1;
                end = mid2-1;
            }
        }
        return -1;
    }
}
