import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void eatMeatReturnListOfFood() throws Exception {
        Feline feline = new Feline();
        List <String> actual=feline.eatMeat();
        List <String> expected=List.of("Животные", "Птицы", "Рыба");
        assertEquals (expected, actual);
    }
    @Test
    public void getFamilyReturnFeline() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals (expected, actual);

    }
    @Test
    public void getKittensReturnOne(){
        Feline feline = new Feline();
        String actual = String.valueOf(feline.getKittens());
        String expected = "1";
        assertEquals (expected, actual);
    }
}
