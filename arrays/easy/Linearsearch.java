import java.util.*;
public class Linearsearch {
    static int linearsearch(int[] arr,int n,int num){
//initialize the array
        for(int i=0;i<n;i++){
            if(arr[i]==num){ //let num be the index of array
return i;//return the value of the index
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n= arr.length;
        int num=4;
        System.out.println(linearsearch(arr,n,num));
    }
}
