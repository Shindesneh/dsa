import java.util.*;
public class movezeroestoend {
    static int[] movezeroes(int n,int[] arr) {
        int j = -1;
        for( int i = 0;i < n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return arr;
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,0,3,0,4,5};
        int n=arr.length;
        int[] ans=movezeroes(n,arr);
        for(int i=0;i<n;i++){
            System.out.print("  "+arr[i]);

        }
            }
}