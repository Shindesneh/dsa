import java.util.Scanner;
public class Printdivisors {
    public static int divisor(int n){

     for(int i=1;i<=n;i++){
         if(n%i==0){
             System.out.println(i);
         }
     }
     return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the divisors are");
        int div=divisor(n);


    }

}
