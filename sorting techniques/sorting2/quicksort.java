import java.util.*;
public class quicksort {
    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(high);//pvot be the last element
        int i=(low-1);//i is index of smaller element
        for(int j=low;j<high;j++){//j ranges from low to high
            if(arr.get(j)<=pivot) {
                i++;
                Collections.swap(arr, i, j);//swap i and j
            }
        }
        Collections.swap(arr,i+1,high);//swap (i+1) and high
        return i+1;
    }
    static void quicksort(List<Integer> arr,int low,int high){
if(low<high){
    int pi=partition(arr,low,high);//pi-partitioning index
quicksort(arr,low,pi-1);
quicksort(arr,pi+1,high);
}
    }

    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>(Arrays.asList(7,8,9,1,10,5));
        System.out.println("list before sorting "+arr);
        quicksort(arr,0,arr.size()-1);
        System.out.println("list after sorting "+arr);
    }
}