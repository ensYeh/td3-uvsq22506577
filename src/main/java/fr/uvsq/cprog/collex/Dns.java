package fr.uvsq.cprog.collex;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Dns {


     private Map<String, DnsItem> nomToItem; 
    private Map<String, DnsItem> ipToItem;  
    private Path filePath;
    
       @param fileName nom du fichier de stockage
     * @throws IOException si problème de lecture
     
    public Dns(String fileName) throws IOException {
        this.filePath = Paths.get(fileName);
        nomToItem = new HashMap<>();
        ipToItem = new HashMap<>();
        loadFromFile();
    }


    private void loadFromFile() throws IOException {
        if (!Files.exists(filePath)) return; 
        List<String> lines = Files.readAllLines(filePath);
        for (String line : lines) {
            String[] parts = line.split(" ");
            if (parts.length == 2) {
                NomMachine nom = new NomMachine(parts[0]);
                AdresseIP ip = new AdresseIP(parts[1]);
                DnsItem item = new DnsItem(nom, ip);
                nomToItem.put(parts[0], item); 
                ipToItem.put(parts[1], item);  
            }
        }
    }


    @param nom NomMachine
     * @return DnsItem correspondant ou null si inexistant
     */
    public DnsItem getItem(NomMachine nom) {
        return nomToItem.get(nom.getNom());
    } 


    @param ip AdresseIP
     * @return DnsItem correspondant ou null si inexistant
     */
    public DnsItem getItem(AdresseIP ip) {
        return ipToItem.get(ip.getIp());
    } 


    











}
