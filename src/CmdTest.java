import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * C:\Data\DEMO\JavaTestProject\src\Test\CmdTest.java
 *javac -cp "C:\Data\DEMO\JavaTestProject\libraires\*" C*.java
 *
 * java -jar -Durl=https://amazon.com -DuserName=Kevin -Dpassword=dias123 C:\Data\DEMO\JavaTestProject\libraires\junit-platform-console-standalone-1.6.2.jar -cp . --scan-class-path --reports-dir=reports
 *
 * java -cp "C:\Data\DEMO\JavaTestProject\libraires\junit-4.13.1.jar;C:\Data\DEMO\JavaTestProject\libraires\hamcrest-core-2.2.jar;."  org.junit.runner.JUnitCore FileName
 *
 * */
public class CmdTest {

    private static String agentNo;

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
