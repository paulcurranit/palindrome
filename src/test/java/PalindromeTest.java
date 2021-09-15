import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void verifyTest() {
        assertTrue(Palindrome.verify(121));
    }

    @Test
    public void verifyTest2() {
        assertFalse(Palindrome.verify(-121));
    }

    @Test
    public void verifyTest3() {
        assertFalse(Palindrome.verify(10));
    }

    @Test
    public void verifyWithoutStringTest() {
        assertTrue(Palindrome.verifyWithOutString(121));
    }

    @Test
    public void verifyWithOutStringTest2() {
        assertFalse(Palindrome.verifyWithOutString(-121));
    }

    @Test
    public void verifyWithoutStringTest3() {
        assertFalse(Palindrome.verifyWithOutString(10));
    }
}
