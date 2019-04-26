package enigma;

/**
 * Class that represents a rotor that has no ratchet and does not advance.
 *
 * @author Shichao Han
 */
class FixedRotor extends Rotor {

    /**
     * A non-moving rotor named NAME whose permutation at the 0 setting
     * is given by PERM.
     */
    FixedRotor(String name, Permutation perm) {
        super(name, perm);
        set(0);
        this._isFixed = true;
    }

    @Override
    void advance() {
        throw new
                EnigmaException("Cannot advance a FixedRotor.");
    }


}

