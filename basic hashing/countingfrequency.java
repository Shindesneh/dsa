
import java.util.*;

public class countingfrequency {
    static void countfreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, 9};
        int n = arr.length;
        countfreq(arr, n);
    }
}