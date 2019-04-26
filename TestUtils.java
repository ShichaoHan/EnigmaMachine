package enigma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Utility definitions for use in unit tests.
 *
 * @author P. N. Hilfinger
 */
class TestUtils {

    protected static final Alphabet UPPER = new CharacterRange('A', 'Z');
    protected static final String UPPER_STRING =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    /**
     * The naval rotors in the A (0) setting.
     */
    static final HashMap<String, String> NAVALA = new HashMap<>();
    /**
     * The mapping of the upper-case alphabet by NAVALA.
     */
    static final HashMap<String, String> NAVALA_MAP = new HashMap<>();
    /**
     * The naval rotors in the B (1) setting.
     */
    static final HashMap<String, String> NAVALB = new HashMap<>();
    /**
     * The mapping of the upper-case alphabet by NAVALB.
     */
    static final HashMap<String, String> NAVALB_MAP = new HashMap<>();
    /**
     * The naval rotors in the Z (25) setting.
     */
    static final HashMap<String, String> NAVALZ = new HashMap<>();
    /**
     * The mapping of the upper-case alphabet by NAVALZ.
     */
    static final HashMap<String, String> NAVALZ_MAP = new HashMap<>();
    static final List<Rotor> ALLROTORS = new ArrayList<>();

    static {
        NAVALA.put("I", "(AELTPHQXRU) (BKNW) (CMOY) (DFG) (IV) (JZ) (S)");
        NAVALA.put("II", "(FIXVYOMW) (CDKLHUP) (ESZ) (BJ) (GR) (NT) (A) (Q)");
        NAVALA.put("III", "(ABDHPEJT) (CFLVMZOYQIRWUKXSG) (N)");
        NAVALA.put("IV", "(AEPLIYWCOXMRFZBSTGJQNH) (DV) (KU)");
        NAVALA.put("V", "(AVOLDRWFIUQ)(BZKSMNHYC) (EGTJPX)");
        NAVALA.put("VI", "(AJQDVLEOZWIYTS) (CGMNHFUX) (BPRK) ");
        NAVALA.put("VII", "(ANOUPFRIMBZTLWKSVEGCJYDHXQ) ");
        NAVALA.put("VIII", "(AFLSETWUNDHOZVICQ) (BKJ) (GXY) (MPR)");
        NAVALA.put("Beta", "(ALBEVFCYODJWUGNMQTZSKPR) (HIX)");
        NAVALA.put("Gamma", "(AFNIRLBSQWVXGUZDKMTPCOYJHE)");
        NAVALA.put("B",
                "(AE) (BN) (CK) (DQ) (FU) (GY) (HW) (IJ) (LO) "
                        + "(MP) (RX) (SZ) (TV)");
        NAVALA.put("C",
                "(AR) (BD) (CO) (EJ) (FN) (GT) (HK) (IV) (LM) "
                        + "(PW) (QZ) (SX) (UY)");
    }

    static {
        NAVALA_MAP.put("I", "EKMFLGDQVZNTOWYHXUSPAIBRCJ");
        NAVALA_MAP.put("II", "AJDKSIRUXBLHWTMCQGZNPYFVOE");
        NAVALA_MAP.put("III", "BDFHJLCPRTXVZNYEIWGAKMUSQO");
        NAVALA_MAP.put("IV", "ESOVPZJAYQUIRHXLNFTGKDCMWB");
        NAVALA_MAP.put("V", "VZBRGITYUPSDNHLXAWMJQOFECK");
        NAVALA_MAP.put("VI", "JPGVOUMFYQBENHZRDKASXLICTW");
        NAVALA_MAP.put("VII", "NZJHGRCXMYSWBOUFAIVLPEKQDT");
        NAVALA_MAP.put("VIII", "FKQHTLXOCBJSPDZRAMEWNIUYGV");
        NAVALA_MAP.put("Beta", "LEYJVCNIXWPBQMDRTAKZGFUHOS");
        NAVALA_MAP.put("Gamma", "FSOKANUERHMBTIYCWLQPZXVGJD");
    }

    static {
        NAVALB.put("I", " (ZDKSOGPWQT) (AJMV) (BLNX) (CEF) (HU) (IY) (R) ");
        NAVALB.put("II", " (EHWUXNLV) (BCJKGTO) (DRY) (AI) (FQ) (MS) (Z) (P) ");
        NAVALB.put("III", " (ZACGODIS) (BEKULYNXPHQVTJWRF) (M) ");
        NAVALB.put("IV", " (ZDOKHXVBNWLQEYARSFIPMG) (CU) (JT) ");
        NAVALB.put("V", " (ZUNKCQVEHTP)(AYJRLMGXB) (DFSIOW) ");
        NAVALB.put("VI", " (ZIPCUKDNYVHXSR) (BFLMGETW) (AOQJ)  ");
        NAVALB.put("VII", " (ZMNTOEQHLAYSKVJRUDFBIXCGWP)  ");
        NAVALB.put("VIII", " (ZEKRDSVTMCGNYUHBP) (AJI) (FWX) (LOQ) ");
        NAVALB.put("Beta", " (ZKADUEBXNCIVTFMLPSYRJOQ) (GHW) ");
        NAVALB.put("Gamma", " (ZEMHQKARPVUWFTYCJLSOBNXIGD) ");
        NAVALB.put("B",
                " (ZD) (AM) (BJ) (CP) (ET) (FX) (GV) (HI) (KN)  "
                        + " (LO) (QW) (RY) (SU) ");
        NAVALB.put("C",
                " (ZQ) (AC) (BN) (DI) (EM) (FS) (GJ) (HU) (KL)  "
                        + " (OV) (PY) (RW) (TX) ");
    }

    static {
        NAVALB_MAP.put("I", "JLEKFCPUYMSNVXGWTROZHAQBID");
        NAVALB_MAP.put("II", "ICJRHQTWAKGVSLBPFYMOXEUNDZ");
        NAVALB_MAP.put("III", "CEGIKBOQSWUYMXDHVFZJLTRPNA");
        NAVALB_MAP.put("IV", "RNUOYIZXPTHQGWKMESFJCBLVAD");
        NAVALB_MAP.put("V", "YAQFHSXTORCMGKWZVLIPNEDBJU");
        NAVALB_MAP.put("VI", "OFUNTLEXPADMGYQCJZRWKHBSVI");
        NAVALB_MAP.put("VII", "YIGFQBWLXRVANTEZHUKODJPCSM");
        NAVALB_MAP.put("VIII", "JPGSKWNBAIROCYQZLDVMHTXFUE");
        NAVALB_MAP.put("Beta", "DXIUBMHWVOAPLCQSZJYFETGNRK");
        NAVALB_MAP.put("Gamma", "RNJZMTDQGLASHXBVKPOYWUFICE");
    }

    static {
        NAVALZ.put("I", " (BFMUQIRYSV) (CLOX) (DNPZ) (EGH) (JW) (KA) (T) ");
        NAVALZ.put("II", " (GJYWZPNX) (DELMIVQ) (FTA) (CK) (HS) (OU) (B) (R) ");
        NAVALZ.put("III", " (BCEIQFKU) (DGMWNAPZRJSXVLYTH) (O) ");
        NAVALZ.put("IV", " (BFQMJZXDPYNSGACTUHKROI) (EW) (LV) ");
        NAVALZ.put("V", " (BWPMESXGJVR)(CALTNOIZD) (FHUKQY) ");
        NAVALZ.put("VI", " (BKREWMFPAXJZUT) (DHNOIGVY) (CQSL)  ");
        NAVALZ.put("VII", " (BOPVQGSJNCAUMXLTWFHDKZEIYR)  ");
        NAVALZ.put("VIII", " (BGMTFUXVOEIPAWJDR) (CLK) (HYZ) (NQS) ");
        NAVALZ.put("Beta", " (BMCFWGDZPEKXVHONRUATLQS) (IJY) ");
        NAVALZ.put("Gamma", " (BGOJSMCTRXWYHVAELNUQDPZKIF) ");
        NAVALZ.put("B",
                " (BF) (CO) (DL) (ER) (GV) (HZ) (IX) (JK) (MP)  "
                        + " (NQ) (SY) (TA) (UW) ");
        NAVALZ.put("C",
                " (BS) (CE) (DP) (FK) (GO) (HU) (IL) (JW) (MN)  "
                        + " (QX) (RA) (TY) (VZ) ");
    }

    static {
        NAVALZ_MAP.put("I", "KFLNGMHERWAOUPXZIYVTQBJCSD");
        NAVALZ_MAP.put("II", "FBKELTJSVYCMIXUNDRHAOQZGWP");
        NAVALZ_MAP.put("III", "PCEGIKMDQSUYWAOZFJXHBLNVTR");
        NAVALZ_MAP.put("IV", "CFTPWQAKBZRVJSIYMOGUHLEDNX");
        NAVALZ_MAP.put("V", "LWACSHJUZVQTEOIMYBXNKRPGFD");
        NAVALZ_MAP.put("VI", "XKQHWPVNGZRCFOIASELBTYMJDU");
        NAVALZ_MAP.put("VII", "UOAKIHSDYNZTXCPVGBJWMQFLRE");
        NAVALZ_MAP.put("VIII", "WGLRIUMYPDCKTQEASBNFXOJVZH");
        NAVALZ_MAP.put("Beta", "TMFZKWDOJYXQCRNESUBLAHGVIP");
        NAVALZ_MAP.put("Gamma", "EGTPLBOVFSINCUJZDXMRQAYWHK");
    }

    static {
        Permutation permI = new Permutation(
                "(AELTPHQXRU) (BKNW) (CMOY) (DFG) (IV) (JZ) (S)", UPPER);
        Permutation permII = new Permutation(
                "(FIXVYOMW) (CDKLHUP) (ESZ) (BJ) (GR) (NT) (A) (Q)", UPPER);
        Permutation permIII = new Permutation(
                "(ABDHPEJT) (CFLVMZOYQIRWUKXSG) (N)", UPPER);
        Permutation permIV = new Permutation(
                "(AEPLIYWCOXMRFZBSTGJQNH) (DV) (KU)", UPPER);
        Permutation permV = new Permutation(
                "(AVOLDRWFIUQ)(BZKSMNHYC) (EGTJPX)", UPPER);
        Permutation permVI = new Permutation(
                "(AJQDVLEOZWIYTS) (CGMNHFUX) (BPRK)", UPPER);
        Permutation permVII = new Permutation(
                "(ANOUPFRIMBZTLWKSVEGCJYDHXQ)", UPPER);
        Permutation permVIII = new Permutation(
                "(AFLSETWUNDHOZVICQ) (BKJ) (GXY) (MPR)", UPPER);
        Permutation permBeta = new Permutation(
                "(ALBEVFCYODJWUGNMQTZSKPR) (HIX)", UPPER);
        Permutation permGamma = new Permutation(
                "(AFNIRLBSQWVXGUZDKMTPCOYJHE)", UPPER);
        Permutation permB = new Permutation(
                "(AE)(BN)(CK)(DQ)(FU)(GY)(HW)(IJ)(LO)(MP)(RX)(SZ)(TV)", UPPER);
        Permutation permC = new Permutation(
                "(AR)(BD)(CO)(EJ)(FN)(GT)(HK)(IV)(LM)(PW)(QZ)(SX)(UY)", UPPER);

        MovingRotor rotorI = new MovingRotor("I", permI, "Q");
        MovingRotor rotorII = new MovingRotor("II", permII, "E");
        MovingRotor rotorIII = new MovingRotor("III", permIII, "V");
        MovingRotor rotorIV = new MovingRotor("IV", permIV, "J");
        MovingRotor rotorV = new MovingRotor("V", permV, "Z");
        MovingRotor rotorVI = new MovingRotor("VI", permVI, "ZM");
        MovingRotor rotorVII = new MovingRotor("VII", permVII, "ZM");
        MovingRotor rotorVIII = new MovingRotor("VIII", permVIII, "ZM");
        FixedRotor rotorBeta = new FixedRotor("BETA", permBeta);
        FixedRotor rotorGamma = new FixedRotor("GAMMA", permGamma);
        Reflector rotorB = new Reflector("B", permB);
        Reflector rotorC = new Reflector("C", permC);

        ALLROTORS.add(rotorI);
        ALLROTORS.add(rotorII);
        ALLROTORS.add(rotorIII);
        ALLROTORS.add(rotorIV);
        ALLROTORS.add(rotorV);
        ALLROTORS.add(rotorVI);
        ALLROTORS.add(rotorVII);
        ALLROTORS.add(rotorVIII);
        ALLROTORS.add(rotorBeta);
        ALLROTORS.add(rotorGamma);
        ALLROTORS.add(rotorB);
        ALLROTORS.add(rotorC);
    }

    /**
     * Return an identifying error message for failed assertions.
     * TESTID identifies the test, MSGFORMAT and ARGS provide
     * the details, as for String.format.
     */
    static String msg(String testId, String msgFormat, Object... args) {
        return testId + " (" + String.format(msgFormat, args) + ")";
    }
}

