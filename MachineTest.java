package enigma;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import java.util.ArrayList;
import static enigma.TestUtils.ALLROTORS;
import static enigma.TestUtils.UPPER;
import static org.junit.Assert.assertEquals;

public class MachineTest {

    /**
     * Testing time limit.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(5);

    /* ***** TESTING UTILITIES ***** */
    private Machine _myTestMachine;
    private ArrayList<Rotor> _allRotors = (ArrayList<Rotor>) ALLROTORS;
    private String[] _myTestRotors1 = {"B", "BETA", "III", "IV", "I"};
    private String[] _myTestRotors2 = {"B", "BETA", "C", "IV", "I"};
    private Permutation _myPlugBoard;

    @Test
    public void checkSetRotors() {
        _myTestMachine = new Machine(UPPER, 5,
                3, _allRotors);
        _myTestMachine.insertRotors(_myTestRotors1);
        _myTestMachine.setRotors("AXLE");
        assertEquals("Wrong number of rotors",
                5, _myTestMachine.numRotors());
        assertEquals("Wrong number of pawls",
                3, _myTestMachine.numPawls());
        assertEquals("Wrong setting at the 2nd rotor from left.",
                0, _myTestMachine.getMyRotors()[1].setting());
        assertEquals("Wrong setting at the 3rd rotor from left.",
                23, _myTestMachine.getMyRotors()[2].setting());
        assertEquals("Wrong setting at the 4th rotor from left.",
                11, _myTestMachine.getMyRotors()[3].setting());
        assertEquals("Wrong setting at the 5th rotor from left.",
                4, _myTestMachine.getMyRotors()[4].setting());

    }

    @Test
    public void checkSetRotorsError() {
        _myTestMachine = new Machine(UPPER,
                5, 3, _allRotors);
        try {
            _myTestMachine.insertRotors(_myTestRotors2);
        } catch (EnigmaException excpt) {
            System.out.println(excpt);
        }
    }


    @Test
    public void checkConvertMsg() {
        _myTestMachine = new Machine(UPPER,
                5, 3, _allRotors);
        _myTestMachine.insertRotors(_myTestRotors1);
        _myTestMachine.setRotors("AXLE");
        _myPlugBoard = new Permutation(
                "  (HQ) (EX) (IP)  (TR)(BY)", UPPER);
        _myTestMachine.setPlugboard(_myPlugBoard);
        assertEquals("Incorrect encoding message.",
                "QVPQSOKOILPUBKJZPISFXDW",
                _myTestMachine.convert(
                        "FROMHISSHOULDERHIAWATHA"));
    }


    @Test
    public void checkMyMachineIntegration() {

        Machine myTestMachine =
                new Machine(UPPER,
                        5, 3, ALLROTORS);
        assertEquals(5,
                myTestMachine.numRotors());
        assertEquals(3,
                myTestMachine.numPawls());
        String[] myRotorsStrings = new String[5];
        myRotorsStrings[0] = "B";
        myRotorsStrings[1] = "BETA";
        myRotorsStrings[2] = "III";
        myRotorsStrings[3] = "IV";
        myRotorsStrings[4] = "I";
        myTestMachine.insertRotors(myRotorsStrings);
        myTestMachine.setPlugboard(new Permutation(
                "(HQ) (EX) (IP) (TR) (BY)",
                        TestUtils.UPPER));
        myTestMachine.setRotors("AXLE");

        String convertedMsg = myTestMachine.convert(
                "QVPQS OKOIL PUBKJ ZPISF Xdw");
        System.out.println(convertedMsg);
        assertEquals("Wrong translation",
                "FROMHISSHOULDERHIAWATHA",
                convertedMsg);
    }
}

