public class removeduplicates {
    static int removeduplicate(int arr[],int n){
        int i=0;
        for(int j=0;j< arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }

        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3};
        int n=6;
        int k=removeduplicate(arr,n);
        System.out.println("array after removal of duplicates is");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
