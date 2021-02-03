import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

//    make tyreType enum as extension

    Tyre tyre;

    @Before
    public void setUp(){
        tyre = new Tyre("offroad");
    }

    @Test
    public void canGetTyreType(){
        assertEquals("offroad", tyre.getTyreType());
    }



}
