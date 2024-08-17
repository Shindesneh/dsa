import java.util.*;
public class FindUnion {
    static ArrayList<Integer> Findunion1(int[] arr1, int[] arr2, int n, int m) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        }
        for (int it : freq.keySet()) {
            Union.add(it);
        }
        return Union;
    }

    public static void main(String[] args) {
        int[] arr1={2,3,6,7,8,11,13};
        int[] arr2={1,2,3,4,5,6,7,8,9,12};
        int n=7;
        int m=10;
        ArrayList<Integer> Union=Findunion1(arr1,arr2,n,m);
        for(int val:Union){
            System.out.print(val+" ");

        }
    }
}
