    package fr.uvsq.cprog.collex;

import static org.junit.Assert.*;
import org.junit.Test;

public class NomMachineTest {
    
    @Test
    public void testConstructeur() {
        NomMachine nom = new NomMachine("serveur.uvsq.fr");
        assertEquals("serveur.uvsq.fr", nom.getNom());
    }
    
    @Test
    public void testGetDomaine() {
        NomMachine nom = new NomMachine("serveur.uvsq.fr");
        assertEquals("uvsq.fr", nom.getDomaine());
    }
}