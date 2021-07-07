package com.java;

import org.junit.Test;
import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 *
 * C:\Users\rakes\Repositiory\JavaTestProject>javac -cp "libraires\*" src\com\test\*.java
 *
 * C:\Users\rakes\Repositiory\JavaTestProject>java -jar libraires\junit-platform-console-standalone-1.6.2.jar --class-path=src;libraires\selenium-server-standalone-3.141.59.jar --scan-class-path --reports-dir=reports
 *
 *
 * javac -cp "libraires\*" src\com\java\*.java src\com\test\*.java
 *
 * java -jar libraires\junit-platform-console-standalone-1.6.2.jar --class-path=src;libraires\selenium-server-standalone-3.141.59.jar --scan-class-path --include-package=com.test
 * */
public class CmdTest {

    private static String agentNo;

    @Tag("abc")
    @Test
    public void test_setup(){
        String url = System.getProperty("url");
        String userName = System.getProperty("userName");
        String password = System.getProperty("password");

        System.out.println("Requested URL::"+ url);
        System.out.println("User trying to loggin ::"+ userName);
        System.out.println("Password used::"+ password);
        assertEquals(10,10);
    }

    @Tag("car")
    @Test
    public void test_agentCreate(){
       /** String persist = System.getProperty("persist");
        System.out.println("Persisted agent::"+ persist);

        String file = System.getProperty("file");
        System.out.println("Persisted agent::"+ file);

        String network = System.getProperty("network");
        System.out.println("Persisted agent::"+ network);*/

        agentNo="222";
        System.out.println("Persisted agentNo::" +agentNo);
        assertEquals(agentNo,10);

    }

    public static String getAgentNo() {

        return agentNo;
    }

}
