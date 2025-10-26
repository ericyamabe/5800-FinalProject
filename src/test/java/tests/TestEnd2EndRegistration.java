package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEnd2EndRegistration {
    String name = "name";
    String username = "username";
    String password = "password";

    @Test
    public void testRegistration() {
        Regsistration registration = new Registration();
        registration.setName(this.name);
        registration.setUsername(this.username);
        registration.setPassword(this.password);
        assertEquals( registration.doRegister(), true);
    }

    @Test
    public void testBadUsernameRegistration() {
        Regsistration registration = new Registration();
        registration.setName(this.name);
        registration.setUsername("Bad U$ername");
        registration.setPassword(this.password);
        assertThrows(registration.doRegister(), {
            throw new Exception("Invalid username");
        });
    }

    @Test
    public void testBbadPasswordRegistration() {
        Regsistration registration = new Registration();
        registration.setName(this.name);
        registration.setUsername(this.username);
        registration.setPassword("B@d");
        assertThrows(registration.doRegister(), {
            throw new Exception("Invalid password");
        });
    }

    @Test
    public void testBadNameRegistration() {
        Regsistration registration = new Registration();
        registration.setName("Bad Nam3");
        registration.setUsername(this.username);
        registration.setPassword(this.password);
        assertThrows(registration.doRegister(), {
            throw new Exception("Invalid name");
        });
    }
}
