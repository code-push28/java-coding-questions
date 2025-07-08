import java.util.Scanner;

class KarprekarNumber{
    public static void main(String[] args){
         /*
         karprekar number - A Karprekar number is a number whose square can be split into two parts that add up to the original number.
          
          A number n is a Karprekar number if:

          1. Square the number → n²

          2. Split the square into two parts (left and right)

          3. Add the two parts → if the result is equal to n, then it's a Karprekar number.

          Note: after splitting number into parts if right part contain single 0 that case will not be considered.
  
          */


         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();

         int square = number*number;

         String str = String.valueOf(square);

         int len = str.length();
         boolean isKarprekar = false;


         for (int i = 1; i<len;i++){
             String left = str.substring(0, i);

             String right = str.substring(i);
           
             
             int left_ = Integer.parseInt(left);
             int right_ = Integer.parseInt(right);


             if(right_!=0 && left_+right_==number){
                isKarprekar = true;
                break;
             }


         }

         if(number==1 || isKarprekar){
            System.out.println("Number is karprekar");
         }else{
            System.out.println("Number is not karprekar");
         }
}
