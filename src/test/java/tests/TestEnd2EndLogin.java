package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEnd2EndLogin {
    String username = "username";
    String password = "password";

    @Test
    public void testLogin() {
        Login login = new Login();
        login.setUsername(this.username);
        login.setPassword(this.password);
        assertEquals( login.doLogin(), true);
    }

    @Test
    public void testBadUsernameLogin() {
        Login login = new Login();
        login.setUsername("b@dusername");
        login.setPassword(this.password);
        assertThrows(login.doLogin(), {
            throw new Exception("Invalid username or password");
        });
    }

    @Test
    public void testBadPasswordLogin() {
        Login login = new Login();
        login.setUsername(this.username);
        login.setPassword("bad password");
        assertThrows(login.doLogin(), {
            throw new Exception("Invalid username or password");
        });
    }
}
