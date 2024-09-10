import java.util.*;
public class majorityelement2 {
    static int majority(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>(n/2)){
                return arr[i];
            }
        }
        return count;


    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,2,2};
        int n=6;
        int sol=majority(arr);
        System.out.println("the majority element is "+sol);



    }

}
