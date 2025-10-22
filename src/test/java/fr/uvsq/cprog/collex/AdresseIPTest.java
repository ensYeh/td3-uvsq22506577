package fr.uvsq.cprog.collex;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdresseIPTest {
    
    @Test
    public void testConstructeur() {
        AdresseIP ip = new AdresseIP("192.168.1.1");
        assertEquals("192.168.1.1", ip.getIp());
    }
    
    @Test
    public void testToString() {
        AdresseIP ip = new AdresseIP("10.0.0.1");
        assertEquals("10.0.0.1", ip.toString());
    }
}