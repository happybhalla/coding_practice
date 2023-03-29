package question;

public class PrimeNumber {

    static int count_p = 0 ;
    public static void printPrime(int n){

        for (int i =3 ;i<n ;i++){
            if ((i%2==0) || (i%3==0)){
                //printPrime(i);
            }else {
                //printPrime(i);
            System.out.println(i);
                count_p++;
            }
        }

        System.out.println(count_p);
    }

    static boolean isPrime(int n){
        //since 0 and 1 is not prime return false.
        if(n==1||n==0)return false;

        //Run a loop from 2 to square root of n
        for(int i=2; i*i<=n; i++){
            // if the number is divisible by i, then n is not a prime number.
            if(n%i==0)return false;
        }
        //otherwise, n is prime number.
        return true;
    }
    public static void main(String[] args) {
        printPrime(100);

        int N = 100;
        int count = 0;
        //check for every number from 1 to N
        for(int i=1; i<=N; i++){
            //check if current number is prime
            if(isPrime(i)) {
                count++;
                //System.out.print(i + " ");
            }
        }
        System.out.println(count);
    }
}
