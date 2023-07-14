package evenNumberTest;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.asserts.Assertion.*;

public class NthEvenNumber {
    /*
    even(1) ➞ 0
// 0 is the first evenNumber
even(2) ➞ 2
// 2 is the second evenNumber
even(80) -> 158
even(100) ➞ 198
     */

    @Test
    public void nothing(){
    }

    @Test
    public void findNthEvenNumber(){
        EvenNumber evenNumber = new EvenNumber();
        int num = evenNumber.find(80);
        assertEquals(158,num);
    }
}
