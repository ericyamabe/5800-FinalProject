package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLogin {
    String username = "username";
    String password = "password";

    @Test
    public void testLogin() {
        Login login = new Login();
        login->setUsername(this.username);
        login->setPassword(this.password);
        assertEquals( login->doLogin(), true);
    }
}
