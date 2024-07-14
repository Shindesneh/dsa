import java.util.Scanner;
public class Palindrome {
    public static boolean checkpalindrome(int n) {
        int revnum = 0;
        int anothernum=0;
        while (n > 0) {
            int rem = n % 10;
            revnum = (revnum * 10) + rem;
            n = n / 10;
        }
        if (anothernum == n) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int n = 123321;
        if (checkpalindrome(n)){
            System.out.println("number is a palindrome");
        }
else{
                System.out.println("number is not a palindrome");

            }
        }
    }
