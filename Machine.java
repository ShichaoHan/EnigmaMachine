package enigma;

import java.util.Collection;
import java.util.HashMap;

/**
 * Class that represents a complete enigma machine.
 *
 * @author Shichao Han
 */
class Machine {

    /**
     * Common alphabet of my rotors.
     */
    private final Alphabet _alphabet;

    /**
     * Number of rotors.
     */
    private int _numRotors;

    /**
     * Plugboard permutation.
     */
    private Permutation _plugBoard;

    /**
     * An HashMap of all the rotors.
     */
    private HashMap<String, Rotor> _allRotors = new HashMap<>();

    /**
     * The rotors of my machine.
     */
    private Rotor[] _myRotors;

    /**
     * Number of pawls of my machine.
     */
    private int _pawls;

    /**
     * A new Enigma machine with alphabet ALPHA, 1 < NUMROTORS rotor slots,
     * and 0 <= PAWLS < NUMROTORS pawls.  ALLROTORS contains all the
     * available rotors.
     */
    Machine(Alphabet alpha, int numRotors, int pawls,
            Collection<Rotor> allRotors) {
        _alphabet = alpha;
        _numRotors = numRotors;
        for (Rotor r : allRotors) {
            _allRotors.put(r.name().toUpperCase(), r);
        }
        _pawls = pawls;
        _myRotors = new Rotor[numRotors];
    }

    /**
     * Return the number of rotor slots I have.
     */
    int numRotors() {
        return _numRotors;
    }

    /**
     * Return the number pawls (and thus rotating rotors) I have.
     */
    int numPawls() {
        return _pawls;
    }

    /**
     * Set my rotor slots to the rotors named ROTORS from my set of
     * available rotors (ROTORS[0] names the reflector).
     * Initially, all rotors are set at their 0 setting.
     */
    void insertRotors(String[] rotors) {
        if (rotors.length != numRotors()) {
            throw new EnigmaException("Wrong number of rotors!");
        }
        for (int i = 0; i < rotors.length; i++) {
            String myKey = rotors[i];
            if (_allRotors.containsKey(myKey)) {
                _myRotors[i] = _allRotors.get(myKey);
            } else {
                throw new EnigmaException("Unidentified rotor.");
            }

        }
        if (!_myRotors[0].reflecting()) {
            throw new EnigmaException("Place reflector on leftmost!");
        }

        int countMoving = 0;
        for (int i = 0; i < _myRotors.length; i++) {
            if (_myRotors[i].rotates()) {
                countMoving += 1;
            }
        }
        if (countMoving != numPawls()) {
            throw new EnigmaException(
                    "Wrong number of moving rotors");
        }

    }

    /**
     * Set my rotors according to SETTING, which must be a string of
     * numRotors()-1 upper-case letters. The first letter refers to the
     * leftmost rotor setting (not counting the reflector).
     */
    void setRotors(String setting) {
        if (setting.equals("")) {
            throw new EnigmaException("The seetings cannot be empty.");
        }
        for (int i = 1; i < _myRotors.length; i++) {
            _myRotors[i].set(setting.charAt(i - 1));
        }
    }

    /**
     * Set the plugboard to PLUGBOARD.
     */
    void setPlugboard(Permutation plugboard) {
        _plugBoard = plugboard;
    }

    /**
     * Returns the result of converting the input character C (as an
     * index in the range 0..alphabet size - 1), after first advancing
     * <p>
     * the machine.
     */
    int convert(int c) {
        boolean[] currentNotching = new boolean[_myRotors.length];
        for (int i = 0; i < currentNotching.length; i++) {
            currentNotching[i] = _myRotors[i].atNotch();
        }

        for (int i = 1; i < currentNotching.length - 1; i++) {
            if (currentNotching[i + 1]
                    || (_myRotors[i - 1].rotates()
                    && currentNotching[i])) {
                if (_myRotors[i].rotates()) {
                    _myRotors[i].advance();
                }
            }
        }

        _myRotors[_myRotors.length - 1].advance();

        int permutedInput = c;
        if (_plugBoard.getCycle() != null) {
            permutedInput = _plugBoard.permute(c);
        }

        int tempOutput = permutedInput;
        for (int i = _myRotors.length - 1; i >= 0; i--) {
            tempOutput =
                    _myRotors[i].convertForward(tempOutput);
        }
        for (int i = 1; i < _myRotors.length; i++) {
            tempOutput =
                    _myRotors[i].convertBackward(tempOutput);
        }

        if (_plugBoard.getCycle() != null) {
            tempOutput = _plugBoard.permute(tempOutput);
        }
        return tempOutput;
    }

    /**
     * Returns the encoding/decoding of MSG, updating the state of
     * the rotors accordingly.
     */
    String convert(String msg) {
        String inputMsg = msg.replaceAll
                (" ", "").toUpperCase();
        String result = "";

        for (int i = 0; i < inputMsg.length(); i++) {
            int outputInt = convert
                    (_alphabet.toInt(inputMsg.charAt(i)));
            result += _alphabet.toChar(outputInt);
        }
        return result;
    }

    /**
     * Get my rotors of the machine.
     * @return: _myRotors .
     */
    public Rotor[] getMyRotors() {
        return _myRotors;
    }
}



