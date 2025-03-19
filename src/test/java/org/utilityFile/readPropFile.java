package org.utilityFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropFile {

    public static void main(String args[]) throws IOException {
        Properties prop = new Properties();

        FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"/config.properties");

        prop.load(fi);

        String appurl = prop.getProperty("appurl");

        String user = prop.getProperty("username");

        String pass = prop.getProperty("password");

        String env = prop.getProperty("environment");

        System.out.println("Application URL - \n"+appurl+"Username "+user+"Password" +pass + "Environment "+ env);




    }

}
