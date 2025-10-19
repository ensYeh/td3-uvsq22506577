package fr.uvsq.cprog.collex;

public class AjouterItem implements Commande {
    private Dns dns;
    private NomMachine nomMachine;
    private AdresseIP adresse;

    public AjouterItem(Dns dns, NomMachine nomMachine, AdresseIP adresse) {
        this.dns = dns;
        this.nomMachine = nomMachine;
        this.adresse = adresse;
    }

    @Override
    public void execute() {
        try {
            dns.addItem(adresse, nomMachine);
            System.out.println("Machine ajoutée avec succès !");
        } catch (Exception e) {
            System.out.println("ERREUR : " + e.getMessage());
        }
    }
}
