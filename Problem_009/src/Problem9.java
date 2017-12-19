/* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        int c = 0;
        boolean tripletFound = false;

        for(a = 1; a < 1000/3; a++){
            for(b = a; b < 1000/2; b++){
                c = 1000 - a - b;

                if((int) Math.pow(a,2) + (int) Math.pow(b,2) == (int) Math.pow(c,2)){
                    tripletFound = true;
                    break;
                }
            }

            if(tripletFound){
                System.out.println("The Pythagorean triplet is " + a + ", " + b + ", " + c);
                System.out.println("The product of the Pythagorean triplet is " + a*b*c);
                break;
            }
        }
    }
}
