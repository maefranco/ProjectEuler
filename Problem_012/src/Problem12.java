/* The sequence of triangle numbers is generated by adding the natural numbers.
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * Let us list the factors of the first seven triangle numbers:
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 * What is the value of the first triangle number to have over five hundred divisors?
 */

public class Problem12 {
    public static boolean checkNumDivisors(int x){
        int div = 2;
        // using the method described in https://mathschallenge.net/library/number/number_of_divisors
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0)
                div += 2;
        }

        return div > 500;

    }

    public static void main(String[] args){
        int triangleNumber;

        for(int i = 1; i <= Integer.MAX_VALUE; i++) {
            // Using the basic summation law, which will find the ith triangle number
            triangleNumber = (i * (i+1))/2;
            if (checkNumDivisors(triangleNumber)) {
                System.out.println("The first triangle number with over 500 divisors is " + triangleNumber);
                break;
            }
        }

    }
}