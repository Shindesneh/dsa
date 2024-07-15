import java.util.Scanner;

public class factorial {
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=factorial(n);
        System.out.println("the factorial of "+n+" are"+x);


    }
}
