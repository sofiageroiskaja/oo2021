package sofiageroiskaja.org;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void test_JUnit() {
        System.out.println("This is a test");
        String str = "This is a test";
        assertEquals("This is a test", str);
    }
}