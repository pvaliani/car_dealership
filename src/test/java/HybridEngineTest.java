import components.Engine;
import engines.ElectricEngine;
import engines.HybridEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridEngineTest {

    HybridEngine hybridEngine;

    @Before
    public void setUp(){
        hybridEngine =  new HybridEngine("50kW");
    }

    @Test
    public void canGetEngineSize(){
        assertEquals("50kW", hybridEngine.getEngineSize());
    }
}