package org.example.day4;

class OuterClass {

    int x = 10;

    public class InnerClass
    {
        int m = 100;
    }
    public class InnerClass2
    {
        int m = 50;
    }
}

public class InnerClass1
{

    public static void main(String args[])
    {
        OuterClass obj = new OuterClass();
        OuterClass.InnerClass objNew = obj.new InnerClass();
        System.out.println(objNew.m);

        OuterClass.InnerClass2 objNew1 = obj.new InnerClass2();
        System.out.println(objNew1.m);

    }
}


