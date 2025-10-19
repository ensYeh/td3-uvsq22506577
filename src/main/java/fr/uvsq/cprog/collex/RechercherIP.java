package fr.uvsq.cprog.collex;

public class RechercheIP implements Commande {
    private String nomMachine;
    private Dns dns;

    public RechercheIP(Dns dns, String nomMachine) {
        this.dns = dns;
        this.nomMachine = nomMachine;
    }

    @Override
    public void execute() {
        try {
            DnsItem item = dns.getItem(new NomMachine(nomMachine));
            System.out.println(item.getAdresseIP());
        } catch (Exception e) {
            System.out.println("Machine non trouvée !");
        }
    }
}
