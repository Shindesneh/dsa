import java.util.Scanner;
public class Prime {
    public static boolean isprime(int n){
        for(int i=1;i<=n;i++){
            if(n==2){
                return true;
            }
            if(n%2==0){
                return false;
            }
            if(n%i!=0){
                return true;
            }

        }
        return false;
            }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n)){
            System.out.println("it is prime");
        }
        else{
            System.out.println("it is not prime");
        }
    }
}
