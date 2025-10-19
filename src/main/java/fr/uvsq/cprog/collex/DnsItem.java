package fr.uvsq.cprog.collex;

public class DnsItem {
    private final AdresseIP ip;
    private final NomMachine nomMachine;

    public DnsItem(AdresseIP ip, NomMachine nomMachine) {
        this.ip = ip;
        this.nomMachine = nomMachine;
    }

    public AdresseIP getIp() {
        return ip;
    }

    public NomMachine getNomMachine() {
        return nomMachine;
    }
    public AdresseIP getAdresseIP() {
        return ip;
    }

    @Override
    public String toString() {
       return nomMachine.getNom() + " " + ip.getIp();
    }
}
