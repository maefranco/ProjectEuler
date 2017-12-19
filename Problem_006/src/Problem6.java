/* The sum of the squares of the first ten natural numbers is
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the
 * first ten natural numbers and the square of the sum is 3025 − 385 = 2640
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */

public class Problem6 {
    public static void main(String[] args){
        int sumOfSquares = 0;
        int squareOfSums = 0;

        for(int i = 1; i <= 100; i++){
            sumOfSquares += (int) Math.pow(i, 2);   // squares i and casts as int
            squareOfSums += i;  // adds natural numbers 1-100
        }

        squareOfSums = (int) Math.pow(squareOfSums, 2); // squares value of squareOfSums

        System.out.println("The difference between the sum of the squares of the first one hundred\n" +
                "natural numbers and the square of the sum is " + (squareOfSums - sumOfSquares));
    }
}
