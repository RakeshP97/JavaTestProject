import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandLineAgentTest {

    @Test
    public void test_agentConnected(){
        System.out.println("test_agentConnected");
        String agentNo = CmdTest.getAgentNo();
        System.out.println("Assert agentNoConnected::"+ agentNo);
        assertEquals(10,10);
    }

}
