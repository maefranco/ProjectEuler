/* Starting in the top left corner of a 2×2 grid, and only being able to
 * move to the right and down, there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 * Thoughts on this problem:
 *  1. It takes a total of 40 moves (20 right, 20 down) to get from the top left corner of a 20x20 grid
 *     to the bottom right
 *  2. This is a 40-choose-20 combinatorial problem (40! / 20! * (40-20)!
 */

public class Problem15 {
    public static void main(String[] args){
        int n = 40;
        int k = 20;
        long c = 1;

        if(k > (n-k))
            k = n-k;

        for(int i = 0; i < k; i++){
            c = (c * (n-i)) / (i + 1);
        }

        System.out.println("There are " + c + " routes from the top left to the bottom right of a 20 x 20 grid");

    }
}
