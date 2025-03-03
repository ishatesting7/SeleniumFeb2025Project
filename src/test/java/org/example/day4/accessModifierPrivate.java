package org.example.day4;

public class accessModifierPrivate {

    private int m = 100;

    public static void main(String args[])
    {
        int m = 10;
        accessModifierPrivate obj = new accessModifierPrivate();
        System.out.println(obj.m);
        obj.method12();
    }
    private int method12()
    {
        return 10;
    }
}

//class accessMod
//{
//
//}
