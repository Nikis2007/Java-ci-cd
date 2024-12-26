import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.App;

public class AppTest {
    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3)); // Проверяем, что 2 + 3 = 5
    }
}

