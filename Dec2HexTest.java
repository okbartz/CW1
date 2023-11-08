import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {
	
public Dec2HexTest()
{}
    Dec2Hex dec2hex;

    @Before
    public void setUp() throws Exception {

        dec2hex = new Dec2Hex();

    }

    @Test
    public void main() {

        assertEquals("Testing for empty value","there is no input provided", dec2hex.main(new String[]{""}));

    }

    @Test
    public void NormalNumberTest() {

        assertEquals("Testing for number value","A", dec2hex.main(new String[]{"10"}));

    }
    @Test
    public void LetterTest() {

        assertEquals("Testing for letter value","please use a positive integer input", dec2hex.main(new String[]{"A"}));

    }
    @Test
    public void NegativeNumberTest() {

        assertEquals("Testing for negative number value","please use a positive integer input", dec2hex.main(new String[]{"-1"}));

    }

}
