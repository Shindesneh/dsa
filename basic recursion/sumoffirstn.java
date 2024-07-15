public class sumoffirstn {
    static void sum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;

        }
        System.out.println("the sum of first" + n + "numbers are" +sum);
    }

    public static void main(String[] args) {
        int n=6;
        sum(n);

    }


    }
