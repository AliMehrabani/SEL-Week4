import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressTest {
    @Test
    public void testShowState() {
        Express type = new Express();
        assertEquals("getType must print current type properly", "express", type.getType());
    }
}
