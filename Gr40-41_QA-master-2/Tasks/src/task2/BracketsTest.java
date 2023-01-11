package task2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void bracketsNegativeTest2(){
        String line = "} ( ) {";
        assertFalse(Brackets.brackets(line));
    }

    @Test
    public void bracketsNegativeTest3() {
        String line  = "( ( ( ) ) [ ] { } [ ] ";
        assertFalse(Brackets.brackets(line));
    }
    @Test
    public void bracketsTest2() {
        String line  = "( (32 ( ) ) [32_0 ] { } [43 ] ) [ ]";
        assertTrue(Brackets.brackets(line));
    }

    @Test
    public void bracketsNegativeTest4() {
        String line = " ";
        assertTrue(Brackets.brackets(line));//Вот тут очень интересно, как именно должно быть?
    }
}