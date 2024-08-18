import java.util.*;
public class leftrotationbyoneplace {
    static void solve(List<Integer> arr) {
        int temp = arr.get(0);
        for (int i = 0; i < arr.size() - 1; i++) {
            arr.set(i, arr.get(i + 1));

        }
        arr.set(arr.size() - 1, temp);
        for (int i = 0; i < arr.size()  ; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        solve(arr);
    }
    }

