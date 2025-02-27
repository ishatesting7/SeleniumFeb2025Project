package org.example.day2;

public class addDigitFloatNumber {
    public static void main(String args[])
    {
        // Input number
        // Convert into String
        // Separate based on '.'
        double number = 23.4334d;

        String[] numberParts = String.valueOf(number).split("\\.");
        int sumNumberPart = sumOfDigit(numberParts[0]);
        int decimalNumberPart = sumOfDigit(numberParts[1]);
        System.out.println("Addition of the Decimal Number - "+sumNumberPart+"."+decimalNumberPart);
    }

    static int sumOfDigit(String num)
    {
        int sum = 0;
        for (char ch : num.toCharArray())
        {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }
}
