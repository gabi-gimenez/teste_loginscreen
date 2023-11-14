import static  org.junit.Assert.*;

import org.example.LoginScreen;
import org.junit.Test;


public class LoginScreenTest {
    @Testes
    public void testSuccessfulLogin() {
        LoginScreen loginScreen  = new LoginScreen();
        assertTrue(loginScreen.login("ana.laura", "chocolate123"));
    }
    @Testes
    public void testFailedLogin() {
        LoginScreen loginScreen  = new LoginScreen();
        assertFalse(loginScreen.login("bruno.fernandes", "bolacha456"));
    }
    @Testes
    public void testAddUser() {
        LoginScreen loginScreen  = new LoginScreen();
        loginScreen.addUser("carla.stenico", "cerveja908");
        assertTrue(loginScreen.login("carla.stenico", "cerveja908"));
    }
}

