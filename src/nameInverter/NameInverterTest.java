package nameInverter;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenEmpty_ReturnsEmpty(){
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertedName(" ");
        assertEquals("",invertedName);
    }
}
