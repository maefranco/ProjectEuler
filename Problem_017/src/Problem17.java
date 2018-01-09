/* If the numbers 1 to 5 are written out in words:
 * one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters
 * and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance
 * with British usage.
 */

public class Problem17 {
    public static int countLetters(int x){
        int count = 0;
        int ones, tens, hundreds;

        if(x < 1000){
            ones = x % 10;
            tens = x / 10;
            if(x >= 100){
                hundreds = x / 100;
                tens %= 10;

                if(hundreds <= 2 || hundreds == 6)
                    count += 3;
                else if(hundreds == 3 || hundreds == 7 || hundreds == 8)
                    count += 5;
                else if(hundreds <= 5 || hundreds == 9)
                    count += 4;

                count += 7;     // to account for the word "hundred"

                if(ones != 0 || tens != 0)
                    count += 3;     // to account for the word "and"
            }
            if(tens == 1){
                if(ones == 0)
                    count += 3;
                else if(ones <= 2)
                    count += 6;
                else if(ones <= 4 || ones >= 8)
                    count += 8;
                else if(ones <= 6)
                    count += 7;
                else if(ones == 7)
                    count += 9;
            }
            else{
                if(tens != 0){
                    if(tens <= 3 || tens >= 8)
                        count += 6;
                    else if(tens <= 6)
                        count += 5;
                    else
                        count += 7;
                }

                if(ones != 0){
                    if(ones <= 2 || ones == 6)
                        count += 3;
                    else if(ones == 3 || ones == 7 || ones == 8)
                        count += 5;
                    else
                        count += 4;
                }
            }
        }
        else
            count += 11;    // "one thousand"

        return count;
    }

    public static void main(String[] args){
        int numLetters = 0;

        for(int i = 1; i < 1001; i++){
            numLetters += countLetters(i);
        }

        System.out.println(numLetters + " letters would be used if 1 - 1000 were written out in words");
    }
}
