import java.util.*;
public class singlelement {
    static int singleelement(int[] arr,int n){
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3};
        int n=arr.length;
        int a=singleelement(arr,n);
        System.out.println("the single element in the array is "+a);
    }

}
