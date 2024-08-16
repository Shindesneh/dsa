import java.util.*;
public class sortarray {
    static void sortarr(ArrayList<Integer> arr,int n){
        int low=0,mid=0,high=n-1;
while(mid<=high){
    if(arr.get(mid)==0){
        int temp=arr.get(low);
        arr.set(low,arr.get(mid));
        arr.set(mid,temp);
        low++;
        mid++;
    }
    else if(arr.get(mid)==1){
        mid++;
        }
else{
        int temp=arr.get(mid);
        arr.set(mid,arr.get(high));
        arr.set(high,temp);
        high--;
    }
    }

}

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new Integer[]{0,2,3,1,4,2,5}));
        int n=7;
        sortarr(arr,n);
        System.out.println("after sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

}
