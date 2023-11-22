import org.junit.Test;

import static org.junit.Assert.*;

public class DeliveryContextTest {
    @Test
    public void testInitialState() {
        DeliveryContext context = new DeliveryContext();
        assertEquals("Initial state must be in-transit", "Delivery state: in-transit"
                , context.getDeliveryState());
    }

    @Test
    public void testInitialType() {
        DeliveryContext context = new DeliveryContext();
        assertEquals("Initial type must be standard", "Shipping type: standard"
                , context.getShippingType());
    }

    @Test
    public void testSetCurrentState() {
        DeliveryContext context = new DeliveryContext();
        context.setCurrentState(new Delivered());
        assertEquals("New state must be set correctly", "Delivery state: delivered"
                , context.getDeliveryState());
    }

    @Test
    public void testSetCurrentType() {
        DeliveryContext context = new DeliveryContext();
        context.setCurrentType(new Express());
        assertEquals("New type must be set correctly", "Shipping type: express"
                , context.getShippingType());
    }
}
