public class gcd{
    public static void main(String[] args) {
        int a = 8, b = 4;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            System.out.println("GCD is " + b);
        } else {
            System.out.println("GCD is " + a);
        }
    }
}

