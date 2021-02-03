import components.Tyre;
import components.Window;
import engines.HybridEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    Vehicle car;
    HybridEngine hybridEngine;
    Tyre tyre;
    Window window;

    @Before
    public void setUp() throws Exception {

        hybridEngine =  new HybridEngine("");

        car = new Vehicle("Ford", "Model T", "Red", 5000, hybridEngine, tyre, window);
    }

    @Test
    public void getMake() {
    }

    @Test
    public void getModel() {
    }

    @Test
    public void getColour() {
    }

    @Test
    public void getPrice() {
    }

    @Test
    public void getEngine() {
    }

    @Test
    public void getTyre() {
    }

    @Test
    public void getWindow() {
    }
}