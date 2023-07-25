package templerun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpikePitTest {

    private ByteArrayOutputStream outputStream;


    @BeforeEach
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void givenMinusOne_throwInvalidWidthException(){
        SpikePit spikePit = new SpikePit();
        assertThrows(SpikePit.InvalidWidthException.class,
                () -> new SpikePit(-1),
                "SpikePit width should be 0 to 20");
    }

    @Test
    public void given101_throwInValidWidthException(){
        SpikePit spikePit = new SpikePit();
        assertThrows(SpikePit.InvalidWidthException.class,() -> new
                SpikePit(101),"SpikePit should be 0 to 100");
    }

    @Test
    public void given100_whenTrapMethodCalled_displayTrapMessage(){
        SpikePit spikePit = new SpikePit(100);
        spikePit.trap();
        assertEquals("Trap is found " + 100 + " kmh speed!", outputStream.toString().trim());
    }

}
