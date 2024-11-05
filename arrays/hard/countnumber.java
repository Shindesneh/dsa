


import java.util.*;


public class countnumber {
        public static int subarrays(int []a, int k) {
            int n = a.length; //size of the given array.
            int count = 0;

            // Step 1: Generating subarrays:
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {

                    //step 2:calculate XOR

                    int xorr = 0;
                    for (int K = i; K <= j; K++) {
                        xorr = xorr ^ a[K];
                    }

                    // step 3:check XOR and count:
                    if (xorr == k) count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            int[] a = {4, 2, 2, 6, 4};
            int k = 6;
            int ans = subarrays(a, k);
            System.out.println("The number of subarrays with XOR k is: " + ans);
        }
    }



