class three{
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args){
        int n=5;
        pattern3(n);
    }
}
