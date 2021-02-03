import components.Engine;
import engines.ElectricEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricEngineTest {

    ElectricEngine electricEngine;

    @Before
    public void setUp(){
        electricEngine =  new ElectricEngine("100kW");
    }

    @Test
    public void canGetEngineSize(){
        assertEquals("100kW", electricEngine.getEngineSize());
    }
}