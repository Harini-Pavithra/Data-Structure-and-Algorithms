// Golden Section Search
// Find the peak element in an array

package dev.harini.searching;

/*
Best Case Time Complexity: O(1)
Worst Case Time Complexity: O(log n)
Average Time Complexity: O(log n)
 */

public class GoldenSectionSearch {
    static double phi = (Math.sqrt(5)+1)/2.0;
    public static int goldenSearch(int[] arr){
        int start = 0;
        int end = arr.length-1;

        int mid1 = calculateMid1(start,end);
        int mid2 = calculateMid2(start,end);

        while(mid1 < mid2){
            if(arr[mid1] > arr[mid2]){
                end = mid2;
                mid2 = mid1;
                mid1 = calculateMid1(start,end);
            }
            else{
                start = mid1;
                mid1 = mid2;
                mid2 = calculateMid2(start,end);
            }
        }
        if(arr[mid1] < arr[mid1 -1]){
            return mid1-1;
        }
        if(arr[mid1] < arr[mid1 + 1]){
            return mid1 + 1;
        }
        return -1;
    }
  
    public static int calculateMid1(int start, int end) {
      // end-(start-end) or end+(end-start) both are same
        return (int)(end+(start-end)/phi);
    }
  
    public static int calculateMid2(int start, int end) {
        return (int)(start + (end - start)/phi);
    }
}
