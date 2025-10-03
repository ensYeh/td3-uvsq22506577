package fr.uvsq.cprog.collex;

public class NomMachine {
    private final String nom;

    public NomMachine(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String getDomaine() {
        int index = nom.indexOf('.');
        if (index == -1) return "";
        return nom.substring(index + 1);
    }

    @Override
    public String toString() {
        return nom;
    }
}
