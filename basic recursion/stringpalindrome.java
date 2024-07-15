import java.lang.String;
public class stringpalindrome {
static  boolean palindrome(String str){
  int start=0;
  int end=str.length()-1;
      if(str.charAt(start)!=str.charAt(end)){
          return false;
  }
      return true;

}

    public static void main(String[] args) {
        String str="madam";
        if(palindrome(str)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");

        }
    }

}