import java.util.Scanner;
public class countdigits {
    public static int countdigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int digits=countdigits(n);
        System.out.println("the no of digits is"+digits);
    }
}
