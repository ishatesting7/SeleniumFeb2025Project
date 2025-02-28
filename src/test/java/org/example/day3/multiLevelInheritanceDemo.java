package org.example.day3;
class inheritanceDemo1 {

    public void singleInheritanceDemo()
    {
        System.out.println("I am in singleInheritanceDemo");
    }
}
class multiLevelInheritanceDemo1 extends inheritanceDemo1
{
    public  static void main(String args[])
    {
        singleInheritanceDemo obj = new singleInheritanceDemo();
        obj.singleInheritanceDemo();
    }
}
class multiLevelInheritanceDemo2 extends multiLevelInheritanceDemo1
{
    public  static void main(String args[])
    {
        singleInheritanceDemo obj = new singleInheritanceDemo();
        obj.singleInheritanceDemo();
    }
}

class multiLevelInheritanceDemo3 extends multiLevelInheritanceDemo2
{
    public  static void main(String args[])
    {
        multiLevelInheritanceDemo3 obj = new multiLevelInheritanceDemo3();
        obj.singleInheritanceDemo();
    }

}


//BaseClass -- Initiate the Driver, Initiate the connection, Selection of browser, Initiation
//ChildClass extends BaseClass
//ChildClass1 --> Just your testcase1
//ChildClass2 extends BaseClass

