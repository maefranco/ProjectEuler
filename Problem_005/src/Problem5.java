import java.util.ArrayList;

/* 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 */

import java.util.List;

public class Problem5 {

    public static boolean isDivisible(long n) {
        int count = 0;
        for (int i = 20; i >= 11; i--) {
            if (n % i == 0)
                count++;
        }

        if(count == 10)
            return true;
        else
            return false;
    }

    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static int findPrime(int n){
        int prime = 0;

        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                prime = i;
                n /= i;
            }
        }

        return prime;
    }

    public static void main(String[] args){
        long product = 2520;    // starts at number evenly divisible by 1-10
        List<Integer> factors = new ArrayList<>();

        for(int i = 11; i <= 20; i++){  // start at 11 since we know about 2520 for 1-10
            if(product % i != 0){
                if(isPrime(i))
                    factors.add(i); // adds prime numbers from 11-20
                else
                    // add prime factors of non-prime numbers from 11-20 that don't evenly divide into 2520
                    factors.add(findPrime(i));
            }

        }

        for(int i = 0; i < factors.size(); i++){
            product *= factors.get(i);

            if(isDivisible(product))
                continue;   // as soon as we find a number that returns true, break out of the loop
        }

        System.out.println("The smallest positive number that is evenly divisible by 1-20 is " + product);
    }
}
