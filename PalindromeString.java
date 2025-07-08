package strings;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

      /*
   Palindrome String

   A string is called a palindrome if it reads the same forwards and backwards.

   Example:
   original = "Pooja"
   reverse  = "ajooP"
   => Not a palindrome (original != reverse)

   Example:
   original = "mam"
   reverse  = "mam"
   => Palindrome (original == reverse)
*/


       StringBuilder sb = new StringBuilder(str);

       String reverse = sb.reverse().toString();

       if(str.equals(reverse)){
        System.out.println("String is palindrome ");
       }else{
        System.out.println("String is not palindrome");
       }



    }
    
}
