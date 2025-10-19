package fr.uvsq.cprog.collex;

import java.io.IOException;

public class App {
    public static void main( String[] args ){

    
    try {
        Dns dns = new Dns("dns.txt");
        DnsTUI tui = new DnsTUI(dns);
        DnsApp app = new DnsApp(dns, tui);
        app.run();
    } catch (IOException e) {
        System.out.println("Erreur lors du chargement du fichier DNS : " + e.getMessage());
    }
}
}
