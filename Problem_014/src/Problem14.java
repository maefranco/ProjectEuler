/* The following iterative sequence is defined for the set of positive integers:
 *      n → n/2 (n is even)
 *      n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 *      13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet
 * (Collatz Problem), it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */

public class Problem14 {
    public static long collatz(long x){
        long chainSize = 0;  // counter for size of chain

        while(x != 1){
            if(x % 2 == 0)
                x /= 2;
            else
                x = 3*x + 1;
            chainSize++;
        }

        chainSize++; // to account for adding 1 to the chain

        return chainSize;

    }
    public static void main(String[] args){
        long longestChain = 0;
        long num = 0;
        long temp;

        for(long i = 3; i < 1000000; i++){
            temp = collatz(i);

            if(temp > longestChain) {
                longestChain = temp;
                num = i;
            }
        }

        System.out.println("The starting number with the longest Collatz chain is " + num);
    }
}
