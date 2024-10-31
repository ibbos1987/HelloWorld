package OOP;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("hämta användarnamn")
    void testGetUserName(){
        User user=new User("User", "password");
        assertEquals("User", user.getUserName());
    }

    @Test
    @DisplayName("hämta lösenord")
    void testGetPassword(){
        User user=new User("User", "password");
        assertEquals("password", user.getPassword());
    }

    @Test
    @DisplayName("change userName")
    void testChangeUserName(){
        User user=new User("User", "password");
        user.setUserName("newUser");
        assertEquals("newUser", user.getUserName());

    }

    @Test
    @DisplayName("test userName är >=4")
    void testUserNameToShort(){
        User user = new User("userName", "password");
        user.setUserName("apa");
        assertEquals("userName", user.getUserName());
    }

    @Test
    public void testSetUserNameWithValidValue() {
        // Arrange: create a User object with an initial userName
        User user = new User("userName", "password");

        // Act: set the userName to a value that is 4 characters or longer
        user.setUserName("newUser");

        // Assert: the userName should be updated
        assertEquals("newUser", user.getUserName());
    }

}
