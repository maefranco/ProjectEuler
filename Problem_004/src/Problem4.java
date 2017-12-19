/* A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */



public class Problem4 {
    public static boolean isPalindrome(int x){
        String s = Integer.toString(x);

        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }

        return true;
    }
    public static void main(String[] args){
        int maxProduct = 0;
        int product;
        int num1 = 0;
        int num2 = 0;

        for(int i = 999; i >= 100; i--){
            for(int j = 999; j >= 100; j--){
                product = i * j;

                if(isPalindrome(product)) {
                    if (maxProduct < product) {
                        maxProduct = product;
                        num1 = i;
                        num2 = j;
                    }
                }
            }
        }

        System.out.println("The largest palindrome made from the product of 2 3-digit numbers is " + num1 + " x " + num2 + " = " + maxProduct);
    }
}
