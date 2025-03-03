package org.example.day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateClassDemo {

    public static void main(String args[])
    {
        LocalDate obj = LocalDate.now();
        //Static - They are accessible using classname.methodName
        System.out.println(obj);

        LocalTime obj2 = LocalTime.now();
        //LocalTime obj3 = LocalTime.

        String m = "100";
        System.out.println(obj2);

        LocalDateTime obj3 = LocalDateTime.now();
        System.out.println(obj3);
        System.out.println(LocalDateTime.now());

        DateTimeFormatter objFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String str = obj3.format(objFormat);
        System.out.println(str);

    }
}
