public class fibonacci {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println("the fibonacci numbers upto "+10+"are");
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
