import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionWithParameterizedTest {
    private final String sex;
    private final boolean result;

    public LionWithParameterizedTest (String sex, boolean result) {
        this.sex=sex;
        this.result=result;

    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void checkOfHasMan () throws Exception {
        Lion lion = new Lion(sex);
        boolean actual= lion.doesHaveMane();
        assertEquals(result, actual);
    }

}



