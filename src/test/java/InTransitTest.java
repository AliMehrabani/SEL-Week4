import org.junit.Test;

import static org.junit.Assert.*;

public class InTransitTest {
    @Test
    public void testShowState() {
        InTransit state = new InTransit();
        assertEquals("getState must print current state properly", "in-transit", state.getState());
    }
}
