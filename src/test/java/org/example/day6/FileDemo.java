package org.example.day6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

    public static void main(String args[]) throws IOException {
    String path = "/Users/vikasbhandari/IdeaProjects/CucumberProject/SeleniumFeb2025Project/src/test/Readme.md";
    File myRef = new File(path);
    System.out.println(myRef.isFile());
    System.out.println(myRef.createNewFile());
    myRef.canWrite();
        FileWriter wr = new FileWriter("demo.txt",true);
        wr.write("I ma writing it");
        //wr.write(34);

    }
}
