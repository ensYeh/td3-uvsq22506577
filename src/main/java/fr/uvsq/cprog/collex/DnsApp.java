package fr.uvsq.cprog.collex;

import java.util.Scanner;

public class DnsApp {
    private Dns dns;
    private DnsTUI tui;

    public DnsApp(Dns dns, DnsTUI tui) {
        this.dns = dns;
        this.tui = tui;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String ligne = scanner.nextLine();
            Commande cmd = tui.nextCommande(ligne);
            cmd.execute();
        }
    }

    public static void main(String[] args) {
        Dns dns = new Dns("dns.txt"); // nom du fichier à adapter
        DnsTUI tui = new DnsTUI(dns);
        DnsApp app = new DnsApp(dns, tui);
        app.run();
    }
}
