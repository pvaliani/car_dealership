import components.Engine;
import engines.ElectricEngine;
import engines.HybridEngine;
import engines.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolEngineTest {

    PetrolEngine PetrolEngine;

    @Before
    public void setUp(){
        PetrolEngine =  new PetrolEngine("2.4 litre");
    }

    @Test
    public void canGetEngineSize(){
        assertEquals("2.4 litre", PetrolEngine.getEngineSize());
    }
}