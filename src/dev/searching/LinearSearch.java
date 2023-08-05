// Linear Search or Sequential Search
package dev.harini;
import java.io.*;

/*
Best Case - O(1)
Average Case - O(N)
Worst Case - O(N)
*/

public class LinearSearch {
    public static int search(int[] arr, int target) {
        int length = arr.length;
        for(int i=0;i<length;i++){
          if(arr[i] == target){
            return i;
          }
        }
        return -1;
    }
}
