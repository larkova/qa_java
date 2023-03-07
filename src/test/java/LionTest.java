import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Feline feline;
    @Test
    public void getKittensReturnTwo() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(2);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void getFoodReturnPredator() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test(expected = Exception.class)
    public void negativeCheckOfHaveMane() throws Exception {
        Lion lion=new Lion("выброс исключения", feline);
    }

}
