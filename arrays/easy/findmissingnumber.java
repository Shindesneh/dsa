import java.util.*;
public class findmissingnumber {
    static int missingnumber(int[] arr,int n){
        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                return i;

        }
return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=5;
        int a=missingnumber(arr,n);
        System.out.println("the missing no. is "+a);
    }
}
