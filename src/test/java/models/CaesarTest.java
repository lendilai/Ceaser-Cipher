package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarTest {
    // To test whether the app creates Caesar objects
    @Test
    public void newCaesar_instantiatesCorrectly() {
        Caesar testCaesar = new Caesar("Sparta", 3);
        assertEquals(true, testCaesar instanceof Caesar);
    }

    // To test whether the sentence entered is captured
    @Test
    public void newCaesar_getsSentence_Sparta() {
        Caesar testCaesar = new Caesar("Sparta", 3);
        assertEquals("Sparta", testCaesar.getmSentence());
    }

    // To test whether the key entered is captured
    @Test
    public void newCaesar_getsKey_3() {
        Caesar testCaesar = new Caesar("Sparta", 3);
        assertEquals(3, testCaesar.getmKey());
    }

    // To test whether encryption works
    @Test
    public void newCaesar_encryptsSentence_vscuwc() {
        Caesar testCaesar = new Caesar("Sparta", 3);
        assertEquals("Vsduwd", testCaesar.encrypt());
    }

    // To test whether decryption works using a negative key
    @Test
    public void newCaesar_decryptSentence_Sparta() {
        Caesar testCaesar = new Caesar("Vsduwd", -3);
        assertEquals("Sparta", testCaesar.encrypt());
    }
}