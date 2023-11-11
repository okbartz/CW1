import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {


    private Dec2Hex dec2Hex = new Dec2Hex();

    @Before
    public void setUp() throws Exception {



    }

    @Test
    public void main() {

        assertEquals("Testing for empty value","there is no input provided", dec2Hex.main(new String[]{""}));

    }

    @Test
    public void normalNumberTest() {

        assertEquals("Testing for number value","A", dec2Hex.main(new String[]{"10"}));

    }
    @Test
    public void letterTest() {

        assertEquals("Testing for letter value","please use a positive integer input", dec2Hex.main(new String[]{"A"}));

    }
    @Test
    public void negativeNumberTest() {

        assertEquals("Testing for negative number value","please use a positive integer input", dec2Hex.main(new String[]{"-1"}));

    }

}
