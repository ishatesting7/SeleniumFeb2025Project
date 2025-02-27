package org.example.day2;

import java.util.Scanner;

public class switchDemo {

    public static void main(String args[])
    {
        int i;
        /*
        switch(matching)
        {
        case 1:

        case 2:

        case 3:

        case 4:

        case 5:

        default:

        }
         */


        String m = "I am new to java I am learning";
        //Scanner s = new Scanner(System.in);
        //s.next();
        //Approach 1 - String --> Character Array --> Each character at a time --> Increment the count
        int countVowel = 0;
        int countConsonant = 0;
        char[] vowels = m.toCharArray();
        /*
        Array - Store same type of data -- vowels[0] = 'I'   vowels[1]= ' '  vowels[2]= 'a'  vowels[3] = 'm'
        vowels[4] = ' '   vowels[5]= 'n'  vowels[6]= 'e'  vowels[7] = 'w'
        vowels[8] = ' '   vowels[9]= 't'  vowels[10]= 'o'  vowels[11] = ' '
        vowels[12] = 'j'   vowels[13]= 'a'  vowels[14]= 'v'  vowels[15] = 'a'
         */

        for( i = 0;i<vowels.length;i++) // initializtion.... condition check... update(increment/decrement
        {
            switch (vowels[i])
            {

                //Increment and Decrement - post increment post decrement
                //pre increment pre decrement
                case 'A': countVowel++;
                break;

                case 'a': countVowel++;  //Increment happend first and then assignment happen
                break;

                case 'E': countVowel++;
                break;

                case 'e': countVowel++;
                break;

                case 'I': countVowel++;
                break;

                case 'i': countVowel++;
                break;

                case 'O': countVowel++;
                break;

                case 'o': countVowel++;
                break;

                case 'U': countVowel++;
                break;

                case 'u': countVowel++;
                break;

                default:
                    countConsonant++;


            }
        }


        System.out.println("The Number of Vowel in your string is - "+countVowel);
        System.out.println("The Number of Consonants in your string is - "+countConsonant);


        //Approach 2 - character Array of m.length()

    }
}
