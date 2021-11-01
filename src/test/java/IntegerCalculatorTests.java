import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerCalculatorTests {

    private IntegerCalculator integerCalculator1;
    private int sumA;
    private int sumB;

    @BeforeEach
    public void before(){
        integerCalculator1 = new IntegerCalculator();
    }

    @Test
    public void canSumSameNumber(){
        assertEquals(6, integerCalculator1.sum(3, 3));
    }
}
