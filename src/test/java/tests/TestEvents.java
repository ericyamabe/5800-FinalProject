package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEvents {
    int eventId = 1;
    String name = "Test Event";

    @Test
    public void nameTest() {
        Events event = new Event();
        event.setName(this.name);
        String testName = event.getName();
        assertEquals(testName, this.name);
    }

    @Test
    public void createTest() {
        Events event = new Events();
        event.setName(this.name);
        boolean status = event.createNew();
        assertEquals(status, true);
    }

    @Test
    public void selectTest() {
        Events event = new Events();
        event->select(this.eventId);
        assertEqual(event.getName(), this.name);
    }
}
