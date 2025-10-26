package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRegistration {
    String name = "name";
    String username = "username";
    String password = "password";

    @Test
    public void testLogin() {
        Regsistration registration = new Registration();
        registration->setName(this.name);
        registration->setUsername(this.username);
        registration->setPassword(this.password);
        assertEquals( registration->doRegister(), true);
    }
}
