class four{
    static void pattern3(int n){
        for(int j=1;j<n;j++){
        for(int i=1;i<=j;i++){
                System.out.print(i+" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args){
        int n=5;
        pattern3(n);
    }
}

//output
//1 
//1 2
//1 2 3
//1 2 3 4
