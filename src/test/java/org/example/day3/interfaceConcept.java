package org.example.day3;

public class interfaceConcept implements interfaceDemo{

    public void demo1() {
        System.out.println(" I am new to java");
        interfaceDemo.super.demo1();
        System.out.println(" I am new to java - part 2");

    }

    public void demo3() {

    }
    public static void main(String args[])
    {
        interfaceConcept obj = new interfaceConcept();
        obj.demo1();
        String abc;
    }
}
