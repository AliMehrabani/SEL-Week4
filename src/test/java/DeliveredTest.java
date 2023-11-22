import org.junit.Test;

import static org.junit.Assert.*;

public class DeliveredTest {
    @Test
    public void testShowState() {
        Delivered state = new Delivered();
        assertEquals("getState must print current state properly", "delivered", state.getState());
    }
}
