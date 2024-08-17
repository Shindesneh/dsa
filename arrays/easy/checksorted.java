public class checksorted {
    static boolean issorted(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){ //we know that for a sorted array the
                                // previous of every element is smaller than or
                                // equal to its current element.
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={12,13,14,25,35};
        int n=5;
        System.out.println("checking if array is sorted: "+issorted(arr,n));
    }
}
