import java.util.*;
public class majorityelement {
    //using moore's algorithm
    //optimal approach
    static int majority(int[] arr) {
        int count = 0;
        int element = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (count == 0) {

                element = arr[i];
                count = 1;
            } else if (arr[i]==element) {
                count++;
            }

            else{
                count--;
            }

        }
        //count1 is the stored element
        //so now we r checking if stored eement =majorityelement i.e,n/2
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                count1++;
            }
        }
        if (count1 >= n / 2) {
            return element;
        } else return -1;


    }

    public static void main(String[] args) {
        int arr[]={2,1,3,2,5,2,6,2,2};
        int ans=majority(arr);
        System.out.println("the majority element is "+ans);
    }

}
