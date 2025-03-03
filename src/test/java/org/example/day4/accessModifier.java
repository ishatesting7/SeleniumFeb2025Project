package org.example.day4;
 public class accessModifier {

     public int m = 100;

     public void method1()
     {
         System.out.println(" I am public accessmodifier ");
     }

     protected int n = 200;

     protected void method2()
     {
         System.out.println("I am protected");
     }
     public static void main(String args[])
     {
         accessModifiedDefault objD = new accessModifiedDefault();
         objD.method1();
         //objD.m
     }
    /*
    public - Access everywhere
    private
    protected - Different Package - Non Subclass - No
    default
    Access modifier - Can be applied to method and variable
     */

}
