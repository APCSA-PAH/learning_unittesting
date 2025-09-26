package apcsa.githubtrack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


// This is the class that will "store" all of our unit tests :)
public class AppTest {

    /* This is a model test that checks whether a Television object
     * gets created correctly. Study its structure and use it as a guide
     * for implementing the other tests!
     */
    @Test
    public void testTelevisionCreatedCorrectly() {
        Television tv = new Television("Samsung", 65.0);

        // Check that the object is not null
        assertNotNull(tv);

        // Check that the name was set correctly
        assertEquals("Samsung", tv.getName());

        // Check that the area was set correctly
        assertEquals(65.0, tv.getArea());
    }

    // TODO: Test that a new RemoteControl starts with the correct TV reference.
    // Hint: Use assertNotNull()
    @Test
    public void testRemoteControlStartsWithCorrectTV() {
        
    }

    // TODO: Test that charge() correctly increases the battery by the specified amount.
    @Test
    public void testChargeIncreasesBattery() {
        
    }

    // TODO: Test that charge() caps at 100.
    @Test
    public void testChargeCapsAt100() {
        
    }

    // TODO: Test that turnOn() only works if charged > 0.
    @Test
    public void testTurnOnOnlyIfCharged() {
        
    }

    // TODO: Test that turnOn() reduces charge by 10.
    @Test
    public void testTurnOnReducesCharge() {
        
    }

    // Test that getChannels() returns the expected channels as Strings. 
    // Hint: Use assertTrue()
    @Test
    public void testGetChannelsOutput() {
        
    }
    
}
