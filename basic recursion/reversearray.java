import java.util.Arrays;
public class reversearray{
    static void reverse(int[] array){
    int start=0;
    int end=array.length-1;
    while(start<end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
     }
    }

    public static void main(String[] args) {
        int[] array={2,3,4,5,6};
        reverse(array);
        for(int i:array){
        System.out.print(i+" ");
    }

}}