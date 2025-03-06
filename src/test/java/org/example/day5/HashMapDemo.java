package org.example.day5;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String args[])
    {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("username", 1234);
        hm.put("username1",5678);
        hm.put("test123",91011);
        hm.put("test123",91011);
        hm.put("test123",91011);

        for(String username :hm.keySet())
        {
            int password = hm.get(username);
            loginTest(username,password);
        }

    }

    static void loginTest(String user, int pass)
    {
        System.out.println("Username - "+ user + "   Password "+ pass);
    }

    /*
    env - url
    qa - qaurl.com
    stage - stageurl.com
     */
}
