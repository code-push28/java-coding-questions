package arrays;

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
      
           * * * * * 
           * * * * * 
           * * * * * 
           * * * * * 
           * * * * * 
         
          

           Nested for loops 

           outer loop - number of rows 
           inner loop - number of column 


           2. Right angle triangle 
           n = 5;

           *          
           * *         
           * * *     
           * * * *   
           * * * * *   
           
           
           
           

           3. inverted right angle triangle 

           * * * * *  
           * * * *   
           * * * 
           * * 
           * 

      
       4. Hollow square 
          
         * * * * * 
         *       *
         *       *
         *       *
         * * * * *
           
          
    
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
      

        for(int j = 1 ; j<=i;j++ ){
            System.out.print("* ");

        }

        System.out.println("");

    }

    


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

 

    
}
