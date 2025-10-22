package fr.uvsq.cprog.collex;

import static org.junit.Assert.*;
import org.junit.Test;

public class DnsItemTest {
    
    @Test
    public void testConstructeur() {
        AdresseIP ip = new AdresseIP("192.168.1.1");
        NomMachine nom = new NomMachine("serveur.uvsq.fr");
        
        DnsItem item = new DnsItem(ip, nom);
        
        assertEquals(ip, item.getAdresseIP());
        assertEquals(nom, item.getNomMachine());
    }
}