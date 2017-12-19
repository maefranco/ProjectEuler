/* The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static void main(String[] args){
        long number = 600851475143L;
        long lpf = 1;    //largest prime factor
        List<Long> factors = new ArrayList<>();

        for(long i = 2; i <= number; i++){
            while(number % i == 0){
                factors.add(i);
                number /= i;
            }
        }

        for (int i = 0; i < factors.size(); i++){
            if(lpf < factors.get(i))
                lpf = factors.get(i);
        }

        System.out.println("The largest prime factor of 600851475143 is " + lpf);
    }
}
