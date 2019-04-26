package enigma;

/**
 * Class that represents a rotating rotor in the enigma machine.
 *
 * @author Shichao Han
 */
class MovingRotor extends Rotor {

    /**
     * My notches string.
     */
    private String _notches;

    /**
     * A rotor named NAME whose permutation in its default setting is
     * PERM, and whose notches are at the positions indicated in NOTCHES.
     * The Rotor is initally in its 0 setting (first character of its
     * alphabet).
     */
    MovingRotor(String name, Permutation perm, String notches) {
        super(name, perm);
        this._notches = notches;
    }


    @Override
    boolean atNotch() {
        char currentSetting = alphabet().toChar(setting());
        if (_notches.indexOf(currentSetting) != -1) {
            return true;
        }
        return false;
    }

    @Override
    void advance() {
        set(permutation().wrap(setting() + 1));
    }

    @Override
    boolean rotates() {
        return true;
    }

}
