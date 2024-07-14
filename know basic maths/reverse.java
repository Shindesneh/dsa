import java.util.Scanner;
public class reverse {
    public static int reversenumber(int n){
        int revnum=0;
        while(n>0) {
            int rem = n % 10;
            revnum = (revnum * 10) + rem;
            n = n / 10;
        }
        return revnum;

        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=reversenumber(n);
        System.out.println("reverse of a number is"+reverse);
    }
    }

