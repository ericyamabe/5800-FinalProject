package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void nameTest() {
        User user = new User();
        user.setUsername(this.name);
        String testUsername = user.getUsername();
        assertEquals(testUsername, this.username);
    }

    @Test
    public void passwordTest() {
        User user = new User();
        user.setPassword(this.password);
        String testPassword = user.gePassword();
        assertEquals(testPassword, this.password);
    }

    @Test
    public void selectTest() {
        User user = new User();
        user->selectByUsername(this.username);
        assertEqual(user.getName(), this.name);
    }
}
