package fr.uvsq.cprog.collex;

public class RechercheNom implements Commande {
    private AdresseIP adresse;
    private Dns dns;

    public RechercheNom(Dns dns, AdresseIP adresse) {
        this.dns = dns;
        this.adresse = adresse;
    }

    @Override
    public void execute() {
        try {
            DnsItem item = dns.getItem(adresse);
            System.out.println(item.getNomMachine());
        } catch (Exception e) {
            System.out.println("Adresse IP non trouvée !");
        }
    }
}
