package enigma;

/**
 * Superclass that represents a rotor in the enigma machine.
 *
 * @author Shichao Han
 */
class Rotor {

    /**
     * My name.
     */
    private final String _name;

    /**
     * The attribute of whether the rotor is fixed.
     */

    protected boolean _isFixed;

    /**
     * The permutation implemented by this rotor in its 0 position.
     */
    private Permutation _permutation;

    /**
     * The setting position of the current rotor.
     */
    private int _settingPosition;

    /**
     * The left and the right rotor of the current one.
     */
    private Rotor _left, _right;

    /**
     * A rotor named NAME whose permutation is given by PERM.
     */
    Rotor(String name, Permutation perm) {
        _name = name;
        _permutation = perm;
        _isFixed = false;
    }

    /**
     * Return my name.
     */
    String name() {
        return _name;
    }

    /**
     * Return my alphabet.
     */
    Alphabet alphabet() {
        return _permutation.alphabet();
    }

    /**
     * Return my permutation.
     */
    Permutation permutation() {
        return _permutation;
    }

    /**
     * Return the size of my alphabet.
     */
    int size() {
        return alphabet().size();
    }

    /**
     * Return true iff I have a ratchet and can move.
     */
    boolean rotates() {
        return false;
    }

    /**
     * Return true iff I reflect.
     */
    boolean reflecting() {
        return false;
    }

    /**
     * Return my current setting.
     */
    int setting() {
        return _settingPosition;
    }

    /**
     * Set setting() to POSN.
     */
    void set(int posn) {
        _settingPosition = posn % alphabet().size();
    }

    /**
     * Set setting() to character CPOSN.
     */
    void set(char cposn) {
        set(alphabet().toInt(cposn));
    }

    /**
     * Return the conversion of P (an integer in the range 0..size()-1)
     * according to my permutation.
     */
    int convertForward(int p) {
        int result = permutation().permute(p + setting()) - setting();
        return permutation().wrap(result);
    }

    /**
     * Return the conversion of E (an integer in the range 0..size()-1)
     * according to the inverse of my permutation.
     */
    int convertBackward(int e) {
        int result = permutation().invert(e + setting()) - setting();
        return permutation().wrap(result);
    }

    /**
     * Returns true iff I am positioned to allow the rotor to my left
     * to advance.
     */
    boolean atNotch() {
        return false;
    }

    /**
     * Advance me one position, if possible. By default, does nothing.
     */
    void advance() {
    }

    @Override
    public String toString() {
        return "Rotor " + _name;
    }

    /**
     * Get the left rotor.
     * @return: _left my left rotor.
     */
    public Rotor getLeft() {
        return _left;
    }

    /**
     * Set the left rotor.
     * @param r my left roto
     */
    public void setLeft(Rotor r) {
        _left = r;
    }


    /**
     * Get the right rotor.
     * @return: _right my right rotor.
     */
    public Rotor getRight() {
        return _right;
    }


    /**
     * Set the right rotor.
     * @param r the rotor that I want to link to the right.
     */
    public void setRight(Rotor r) {
        _right = r;
    }
}
