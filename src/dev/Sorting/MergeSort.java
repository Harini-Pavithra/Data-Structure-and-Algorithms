package dev.harini.sorting;

/*
Best Case Time Complexity: O(nlogn)
Worst Case Time Complexity: O(nlogn)
Average Case Time Complexity: O(nlogn)
Space Complexity: O(n)
Stable: Yes
In-Place: No
Online: No
Adaptive: No
 */


class MergeSort {
    public static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = start + (end - start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            mergeIntervals(arr,start,mid,end);
        }
    }

    public static void mergeIntervals(int[] arr, int start, int mid, int end){
        // Find the length of the two subarrays to be merged
        int len1 = mid-start+1;
        int len2 = end-mid;

        // Create two temporary subarrays
        int[] left = new int[len1];
        int[] right = new int[len2];

        // Copy the elements of the original array into the temporary subarrays
        for(int i=0;i<len1;i++){
            left[i] = arr[start+i];
        }
        for(int j=0;j<len2;j++){
            right[j] = arr[mid+j+1];
        }

        int i=0,j=0,k=start;
        while(i<len1 && j<len2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<len1){
                arr[k] = left[i];
                i++;
                k++;
        }
        while(j<len2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
