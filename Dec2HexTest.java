import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {


    @Test
    public void main() {
	//testing for a empty value
        assertEquals("Testing for empty value","there is no input provided", Dec2Hex.main(new String[]{""}));

    }

    @Test
    public void normalNumberTest() {
	//Testing for a number value
        assertEquals("Testing for number value","A", Dec2Hex.main(new String[]{"10"}));

    }
    @Test
    public void letterTest() {
	//Testing for a letter value
        assertEquals("Testing for letter value","please use a positive integer input", Dec2Hex.main(new String[]{"A"}));

    }
    @Test
    public void negativeNumberTest() {
	//testing for a negative number value
        assertEquals("Testing for negative number value","please use a positive integer input", Dec2Hex.main(new String[]{"-1"}));

    }

}
