/* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

import java.util.List;
import java.util.ArrayList;

public class Problem10 {
    public static void main(String[] args){
        // using Sieve of Erastothenes
        List<Integer> primes = new ArrayList<>();   // counts the number of primes
        List<Boolean> primesTest = new ArrayList<>();   // used to determine what are primes between 2-n
        int n = 2000000;
        long sum = 0;

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

        // sums contents of primes list
        for(int i = 0; i < primes.size(); i++)
            sum += primes.get(i);

        System.out.println("The sum of all primes below two million is " + sum);

    }
}
