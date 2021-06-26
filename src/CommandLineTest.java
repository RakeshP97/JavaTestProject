import org.junit.Test;

public class CommandLineTest {


    @Test
    public void test_deploy(){
        System.out.println("Create a VM");
        String agentNo = CmdTest.getAgentNo();
        System.out.println("Requested agentNo::"+agentNo);
    }


}
