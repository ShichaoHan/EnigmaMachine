package enigma;

import org.junit.Test;
import ucb.junit.textui;
import static enigma.TestUtils.ALLROTORS;
import static enigma.TestUtils.UPPER;
import static org.junit.Assert.assertEquals;

/**
 * The suite of all JUnit tests for the enigma package.
 *
 * @Shichao Han
 */
public class UnitTest {

    /**
     * Run the JUnit tests in this package. Add xxxTest.class entries to
     * the arguments of runClasses to run other JUnit tests.
     */
    public static void main(String[] ignored) {
        textui.runClasses(PermutationTest.class, MovingRotorTest.class);
    }

    @Test
    public void checkMyMachine() {

        String[] myRotorsStrings = new String[5];
        myRotorsStrings[0] = "B";
        myRotorsStrings[1] = "BETA";
        myRotorsStrings[2] = "III";
        myRotorsStrings[3] = "IV";
        myRotorsStrings[4] = "I";

        Machine myTestMachine =
                new Machine(UPPER, 5, 3, ALLROTORS);
        assertEquals(5, myTestMachine.numRotors());
        assertEquals(3, myTestMachine.numPawls());
        myTestMachine.insertRotors(myRotorsStrings);
        myTestMachine.setPlugboard(new Permutation(
                "(HQ) (EX) (IP) (TR) (BY)", TestUtils.UPPER));
        myTestMachine.setRotors("AXLE");

        String convertedMsg = myTestMachine.convert(
                "QVPQS OKOIL PUBKJ ZPISF Xdw");
        System.out.println(convertedMsg);
        assertEquals("Wrong translation",
                "FROMHISSHOULDERHIAWATHA", convertedMsg);

    }

}


