package org.testNGlistenerDemo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ListenerDemo.class})
public class ListenerDemo2 {

    @Test
    public void Demo1()
    {
        System.out.println("I am in Listener");
    }
}
