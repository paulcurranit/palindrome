import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void verifyTest() {
        boolean result = Palindrome.verify(121);
        assertTrue(result);
    }

    @Test
    public void verifyTest2() {
        boolean result = Palindrome.verify(-121);
        assertFalse(result);
    }

    @Test
    public void verifyTest3() {
        boolean result = Palindrome.verify(10);
        assertFalse(result);
    }

    @Test
    public void verifyWithoutStringTest() {
        boolean result = Palindrome.verifyWithOutString(121);
        assertTrue(result);
    }

    @Test
    public void verifyWithOutStringTest2() {
        boolean result = Palindrome.verifyWithOutString(-121);
        assertFalse(result);
    }

    @Test
    public void verifyWithoutStringTest3() {
        boolean result = Palindrome.verifyWithOutString(10);
        assertFalse(result);
    }
}
