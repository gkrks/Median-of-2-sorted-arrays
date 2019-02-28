import java.util.*;
import java.io.*;
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double d = 0;
        int m = nums1.length;
        int n = nums2.length;
        int l = m+n;
        int[] arr = new int[l];
        int k = 0;
        for(int i = 0; i < m; i++){
            arr[k] = nums1[i];
            k++;
        }
        for(int i = 0; i < n;i++){
            arr[k] = nums2[i];
            k++;
        }
        Arrays.sort(arr);
       int v = l-1;
       if(v%2 == 0){
           d = (double) arr[v/2];
       }
       else{
           int a = (l-1)/2;
           int b = (l+1)/2;
           d = (double) (arr[a]+arr[b])/2;
       }
        return d;
        
    } 
}
