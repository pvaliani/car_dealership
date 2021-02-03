import components.Window;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WindowTest {

    Window window;

    @Before
    public void setUp(){
        window = new Window();
    }

    @Test
    public void canGetWindowType(){
     assertFalse(window.isTinted());
    }

    @Test
    public void canTintWindows(){
        window.setTinted();
        assertTrue(window.isTinted());

    }
}
