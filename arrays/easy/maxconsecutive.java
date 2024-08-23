import java.util.*;
public class maxconsecutive {
    static int maxconsecutive(int arr[] ){
        int max=0;
        int count=0;
    for (int i=0;i<arr.length;i++){
        if(arr[i]==1){
            count++;
        }
        else{
            count=0;
        }
        max=Math.max(max,count);
    }
return max;
}

    public static void main(String[] args) {
        int arr[]={1,1,0,0,1,1,1,1};

        int ans=maxconsecutive(arr);
        System.out.println("the maximum consecutive integers are "+ans);
    }
}