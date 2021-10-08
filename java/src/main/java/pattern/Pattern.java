package pattern;

public class Pattern {

    /*
      --*
      _*_*
      *_*_*_
     */
    private static void drawTriangle(int n ){

        for (int i = 0;i<n ;i++){

            for (int j = i ; j < n-1 ; j++){
                System.out.print(" ");
            }
            for(int j =0 ; j <= i ;j++){
               System.out.print("* ");
            }
        System.out.println();
        }

    }

    /*
        *
        * *
        * * *
    */
    private static void rightAngle(int n ){

        for (int i = 0 ;i <n;i++ ){

            for (int j= 0 ;j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    /*

            *
          * *
        * * *

     */

    private static void leftAngle(int n){
        for (int i =0 ; i<n ; i++){

            for (int j = 0; j < n-i ;j++){
                System.out.print(" ");
            }
            for (int j =n-i; j<=n;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
        * * *
        * *
        *
     */
    private static void downRightAngle(int n){

        for(int i =0;i <n ;i++){
           for(int j = 0 ; j< n-i; j++){
               System.out.print("*");
           }
           System.out.println();
        }
    }


    /*
             *
           * *
         * * *
     */
    private static void downLeftAngle(int n){

        for(int i =0;i <n ;i++){

            for(int j = 0 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        downLeftAngle(10);
    }
}
