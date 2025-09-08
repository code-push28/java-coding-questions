package patterns;

public class patterns {

    

    /*

     Why practice pattern problems ? 
     They strengthen your understanding of loops , nested loops , 
     conditions and spatial reasoning 

     - Often used in interviews and coding challanges .


     Prerequisites : Basic java syntax 
     familiarity with loops
     printing and possible Scanner for input


     1. Filled Square 

        int n = 5;
           1 2 3 4 5
           * * * * * ---- 1
           * * * * * ---- 2
           * * * * * ---- 3
           * * * * * ----- 4
           * * * * * ----- 5
         
          

           Nested for loops 

           outer loop - number of rows 
           inner loop - number of column 


           2. Right angle triangle 
           n = 5;

           *           ----  1 , 1
           * *         ----- 2 , 2
           * * *      ------ 3 , 3
           * * * *   -----   4
           * * * * *   ----- 5
           
           
           
           

           3. inverted right angle triangle 

           * * * * *   --- 1 , 5  n
           * * * *    ---- 2 , 4 n-1
           * * * ---------- 3 , 3 n-1-1
           * * ------------- 4 , 2 n-1-1-1
           * -------------- 5, 1 n-1-1-1-1 
           
           
          4. Hollow square 

         
           1 2 3 4 5
     1     * * * * * 
     2     *       *
     3     *       *
     4     *       *
     5     * * * * *

     int n = 5
   

     i = 1 ;
     i = 5 ;
     
     j= 1;
     j = 5;


     5. Left aligned right angle triangle 
                             i ,  n-i
                       *  -- 1 , 4  , 5-1  , n -i
                     * *  --- 2 , 3 , 5-2 , n - i
                   * * *  --- 3 , 2 , 5-3 , n- i
                 * * * *   --- 4 , 1 , 5-4 , n-i
               * * * * *   --- 5 , 0 , 5-5 , n-i
               
               n = 5
               
               

      6.Pyramid Pattern
      spaces - n-i
      stars = 2*i - 1
      
                    *   --- 1     (2*1) - 1 = 1     
                   *** -- 3       (2*2)-1 = 3
                  ***** ----- 5    (2*3) - 1 = 5
                 ******* ---- 7    (2*4) - 1 = 7
                ********* --- 9    (2*5)  - 1 = 9

                n = 5

      7 . Inverted   triangle
      
      * * * * * 
        * * * * 
          * * * 
            * * 
              * 

            space - i-1 number of spaces , i = number of row 

              stars - n___1


              1. how many number of rows you have in your pattern 
                  n = 5

              2. number of spaces each row have    
              
              3. how many number of star in each row 



              8. Inverted Pyramid 

              ********* 
               *******  
                ***** 
                 *** 
                  *   



               
            


        
        
           
    
           
        
    
   */

   public static void main(String[] args){

    int n = 6;

    // filled square
    for(int i = 1 ; i<=n; i++){

        for(int j = 1; j<=n;j++){

            System.out.print("* ");

        }

        System.out.println("");





    }

    System.out.println("");

    // right angle triangle 

    for(int i = 1 ; i<=n;i++){

        for(int j = 1 ;j<=i;j++){
            System.out.print("* ");

        }

        System.out.println("");

    }

    System.out.println("");

    // inverted right angle triangle 

    for(int i = n; i>=1;i--){
        // 5 , 4 ,3 , 2

        for(int j = 1 ; j<=i;j++ ){
            System.out.print("* ");

        }

        System.out.println("");

    }

    System.out.println("");

    //Hollow square

    for(int i = 1;i<=n;i++){
        for(int j = 1; j<=n;j++){
            if(i== 1 || i == n || j==1 || j== n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }

        System.out.println("");

    }


    System.out.println();

    // Left Aligned right angle triangle 

    for(int i = 1; i<=n;i++){

        for(int j = 1 ; j<= n-i; j++){
            System.out.print(" ");
        }

        for(int k = 1; k<=i; k++){
            System.out.print("*");
        }

        System.out.println();

    } System.out.println();

    // Pyramid

    for(int i = 1; i<=n;i++){

        for(int j = 1 ; j<= n-i; j++){
            System.out.print(" ");
        }

        for(int k = 1; k<= 2*i-1;k++){
            System.out.print("*");
        }

        System.out.println();


    }

        System.out.println();

    // inverted triangle (left aligned)

    for(int i = 1; i<=n;i++){

        for(int j = 1; j<=i-1; j++){
            System.out.print(" ");
        }

        for(int k=n;k>=i;k--){

            System.out.print("*");

            //1 , 5...1= 5 stras 
            //2 , 5...2 = 5 ,4 ,3,2--- 4 stars
            //3 , 3

        }

        System.out.println();

    }

    System.out.println();

    // inverted pyramid 
    for(int i = 0; i<n;i++){



    


   }

 

    
}
