/* What is the sum of the digits of the number 2^1000? */

import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args){
        BigInteger x = new BigInteger("2");
        BigInteger number = x.pow(1000);
        BigInteger sum = new BigInteger("0");
        BigInteger modulus = new BigInteger("10");

        while(number.compareTo(BigInteger.ZERO) == 1){  // while number > 0
            sum = sum.add(number.remainder(modulus));   // adds the rightmost digit to the sum
            number = number.divide(modulus);            // new number without rightmost digit
        }

        System.out.println("The sum of the digits of 2 ^ 1000 is " + sum);



    }
}
