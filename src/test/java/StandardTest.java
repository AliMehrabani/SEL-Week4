import org.junit.Test;

import static org.junit.Assert.*;

public class StandardTest {
    @Test
    public void testShowState() {
        Standard type = new Standard();
        assertEquals("getType must print current type properly", "standard", type.getType());
    }
}
