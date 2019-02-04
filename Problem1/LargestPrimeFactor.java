/**
 * This class has alternative implementation approaches for finding largest
 * prime factor of a given number. Different methods are implemented considering
 * different time complexity. Solution can be further optimized and left open
 * for modifications.
 * 
 * @author Dhrubo
 * @date 04-Feb-19
 * @license MIT 
 */

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

class LargestPrimeFactor{
    
    public static void main(String[] args) {
        long N = 600851475143L;
        Instant start = Instant.now();
        System.out.println("Largest Prime Factor of " + N + " is " + calculateLargestPrime(N));
        Instant end = Instant.now();
        System.out.println("Time taken : " + Duration.between(start, end).toMillis() + " milliseconds");
    }
    
    // following approaches can be further optimized by using probablistic primality check (Fermat primality test) first and then deterministic check (e.g. Miller's test) for absolute correctness, if required. 
    //In this case the Time complexity will be O(((sqrt(N)-2)/2*log(N))
    // Implementation of this approach is intensionally left open for YOU :)

    // Option 2 >> O((sqrt(N)-1)*(sqrt(N)-2)/2) >> more optimized
    private static long calculateLargestPrime(long N){
        long primeFactor = -1;
        // starting from prime number 3 and checking against incremented odd numbers upto square root of input number to optimize prime number check which is factor of input number. 
        for(long i=3;i< Math.floor(Math.sqrt(N));i+=2){  
            if(N%i==0) {             
                if(isPrime(i)) {                   
                    primeFactor = i ;                              
                }
            }
        }
        if(primeFactor == -1) { 
            return N;
        }else { 
            return primeFactor;
        }
    }

    // Option 2 >> Determining Primality of given number
    // Time Complexity O(sqrt(N))
    private static boolean isPrime(long num){
        boolean isPrime = true;
        // cosnidering upto sqrt of the input number. 
        for(long i=2;i< Math.sqrt(num);i++) {       
          if(num%i==0) {
            isPrime = false;
            break;
        }                       }
        return isPrime; 
    }

    // Option 1 - Calculating largest prime factor of given number
    // Time Complexity O((N-1)*sqrt(N))
    private static long calculateLargestPrime1(long N){
        long primeFactor = -1;
        for(long i=2;i< Math.floor(Math.sqrt(N));i++){
            if(N%i==0) {             
                if(isPrime1(i)) {                   
                    primeFactor = i ;                              
                }
            }
        }
        if(primeFactor == -1) { 
            return N;
        }else { 
            return primeFactor;
        }
    }
    // Option 1 - >> Determining Primality of given number
    // Time Complexity O(N-1)
    private static boolean isPrime1(long num){
        boolean isPrime = true;
        for(long i=2;i<num ;i++) {       
          if(num%i==0) {
            isPrime = false;
            break;
        }                       }
        return isPrime; 
    }
}
