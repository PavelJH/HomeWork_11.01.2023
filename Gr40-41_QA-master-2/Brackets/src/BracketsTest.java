import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsTest {

    @Test
    public void bracketsTest() {
        String line  = "( ( ( ) ) [ ] { } [ ] ) [ ]";
        assertTrue(Brackets.brackets(line));
    }

    @Test
    public void bracketsNegativeTest() {
        String line  = "( ( ( ) ) [ ] { } [ ] )  ]";
        assertFalse(Brackets.brackets(line));
    }

    //TODO Написать тест который провалится
    //TODO Исправить ошибку  в коде
    //
}