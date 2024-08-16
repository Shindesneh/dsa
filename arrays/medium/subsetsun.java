import java.util.*;
public class subsetsun {

        public static void main(String[] args) {
            int[] arr= {2, 5, 6, 3, 9};
            int target = 100;
            int n = arr.length;
            boolean subset =sub(arr,target);
if(subset){
    System.out.println("the subset sum is found");
}
else{
    System.out.println("the subset sum is  not found");

}
        }

    static boolean sub(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) == target) {
                    System.out.println("yes");
                    return true;
                }
            }
        }

                return false;
            }
        }




