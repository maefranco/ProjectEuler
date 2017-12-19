/* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10,001st prime number?
 */

import java.util.List;
import java.util.ArrayList;

public class Problem7 {
    public static void main(String[] args){
        // using Sieve of Erastothenes
        List<Integer> primes = new ArrayList<>();   // counts the number of primes
        List<Boolean> primesTest = new ArrayList<>();   // used to determine what are primes between 2-n
        int n = 2000000;    // arbitrary number

        // initialize primesTest list to false for indices 0 and 1; true for indices 2-n
        primesTest.add(false);
        primesTest.add(false);
        for(int i = 2; i <= n; i++)
            primesTest.add(true);

        // eliminates all multiples of primes
        for(int i = 2; i <= (int) Math.sqrt(n); i++){
            if(primesTest.get(i)){
                for(int j = 2; i*j < n; j++){
                    primesTest.set(i*j, false);
                }
            }
        }

        // adds prime numbers to primes list
        for(int i = 0; i < primesTest.size() - 4; i++){
            if(primesTest.get(i+2))
                primes.add(i+2);
        }

        System.out.println("The 10,001st prime number is " + primes.get(10000));
    }
}
