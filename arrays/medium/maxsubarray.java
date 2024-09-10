import java.util.*;
public class maxsubarray {
    static int subarray(int[] arr) {
        int n = arr.length;
        int maxi=Integer.MIN_VALUE;
         int sum=0;
         for(int i=0;i<n;i++){
             sum+=arr[i];

         if(sum>maxi){
             maxi=sum;
         }
         if(sum<0){
              sum=0;

         }

         }

return maxi;
    }

    public static void main(String[] args) {
        int arr[]={3,4,5,1,2,-1,0};
        int n=7;
        int maxsum=subarray(arr);
        System.out.println("the maximum subarray sum is"+maxsum);

    }
}