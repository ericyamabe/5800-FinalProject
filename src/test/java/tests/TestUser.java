package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestUser {
    private String name = "Test User";
    private String username = "testuser";
    private String password = "testpassword";

    @Test
    public void nameTest() {
        User user = new User();
        user.setName(this.name);
        String testName = user.getName();
        assertEquals(testName, this.name);
    }

    @Test
    public void badNameTest() {
        User user = new User();
        assertThrows(user.setName("Bad Nam3"), {
            throw new Exception("Invalid name");
        });
    }

    @Test
    public void usernameTest() {
        User user = new User();
        user.setUsername(this.username);
        String testUsername = user.getUsername();
        assertEquals(testUsername, this.username);
    }

    @Test
    public void badUsernameTest() {
        User user = new User();
        assertThrows(user.setUsername("BadU$er"), {
            throw new Exception("Invalid username");
        });
    }

    @Test
    public void passwordTest() {
        User user = new User();
        user.setPassword(this.password);
        String testPassword = user.gePassword();
        assertEquals(testPassword, this.password);
    }

    @Test
    public void badPasswordTest() {
        User user = new User();
        assertThrows(user.setPassword("B@d"), {
            throw new Exception("Invalid password");
        });
    }

    @Test
    public void selectTest() {
        User user = new User();
        user.selectByUsername(this.username);
        assertThrows(user.setPassword("B@d"), {
            throw new Exception("Invalid Name");
        });
    }

    @Test
    public void badSelectTest() {
        User user = new User();
        user.selectByUsername("BadUser");
        assertThrows(user.setPassword("B@d"), {
            throw new Exception("Invalid User");
        });
    }
}
