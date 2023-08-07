// Binary search or half-interval search, or logarithmic search, or binary chop
package dev.harini.searching;

/*
Best Case - O(1)
Average Case - O(log N)
Worst Case - O(log N)
*/

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        // assuming array is sorted
        int length = arr.length;
        int start = 0;
        int end = length - 1;

        while(start <= end)
        {
            // to avoid overflow bug
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
