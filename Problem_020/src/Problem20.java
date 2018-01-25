/* n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 */

import java.math.BigInteger;

public class Problem20 {
    public static BigInteger factorial(BigInteger x){
        if(x.compareTo(BigInteger.ZERO) <= 0)
            return BigInteger.ONE;
        else
            return(x.multiply(factorial(x.subtract(BigInteger.ONE))));
    }

    public static int sumFactorial(String s){
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            int digit = Integer.parseInt(s.substring(i, i+1));
            sum += digit;
        }

        return sum;
    }
    public static void main(String[] args){
        BigInteger number = factorial(BigInteger.valueOf(100));

        int sum = sumFactorial(number.toString());

        System.out.println("The sum of the digits of 100! is " + sum);
    }
}
