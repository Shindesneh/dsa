import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    public static boolean armstrong(int num){
        int k=String.valueOf(num).length();
        int sum=0;
        int n=num;
        while(n>0){
            int rem=n%10;
            sum+=Math.pow(rem,k);
            n=n/10;
        }
        return sum==num?true:false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (armstrong(n)) {
            System.out.println("it is an armstrong");
        }
        else{
            System.out.println("it is not an armstrong");
        }

    }
}
