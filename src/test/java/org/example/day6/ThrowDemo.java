package org.example.day6;

public class ThrowDemo {

    public static void main(String args[])
    {
        try{
            getAge(13);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally Is Executing");
        }
    }
    static void getAge(int age) throws IllegalArgumentException
    {
        if(age<18)
        {
            throw new IllegalArgumentException("Age must be 18 or older");
        }
        System.out.println("User is Eligible");
    }
}
