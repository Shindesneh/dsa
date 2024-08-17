public class largestelement {
    static int findlargest(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
            max=arr[i];
           }
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[]={10,5,2,16,18};
        int largest=findlargest(arr);
        System.out.println("largest element in an array: "+largest);

    }

}
