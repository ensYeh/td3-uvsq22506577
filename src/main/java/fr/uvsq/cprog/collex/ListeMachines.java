package fr.uvsq.cprog.collex;

import java.util.List;

public class ListeMachines implements Commande {
    private String domaine;
    private boolean trierParIP;
    private Dns dns;

    public ListeMachines(Dns dns, String domaine, boolean trierParIP) {
        this.dns = dns;
        this.domaine = domaine;
        this.trierParIP = trierParIP;
    }

    @Override
public void execute() {
    List<DnsItem> items = dns.getItems(domaine);
    items.stream()
         .sorted((i1, i2) -> trierParIP ? 
             i1.getAdresseIP().getIp().compareTo(i2.getAdresseIP().getIp()) :
             i1.getNomMachine().getNom().compareTo(i2.getNomMachine().getNom()))
         .forEach(i -> System.out.println(i.getAdresseIP() + " " + i.getNomMachine()));
}
}
