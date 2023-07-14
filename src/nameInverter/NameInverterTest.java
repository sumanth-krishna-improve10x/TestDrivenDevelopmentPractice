package nameInverter;


import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {

    @Test
    public void nothing() {
    }

    // input:"", output:""

    @Test
    public void givenEmpty_returnsEmpty() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }

    @Test
    public void givenName_returnName() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("Name");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenSingleWordWithTrailingSpaces() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("Name ");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenSingleWordWithBeginingSpaces() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName(" Name ");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenFirstLast_returnLastFirst() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("First Last");
        assertEquals("last, first", invertedName);
    }
}
