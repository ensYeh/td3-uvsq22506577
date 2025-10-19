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


     @param domaine nom du domaine (ex: "uvsq.fr")
     * @return liste des DnsItem correspondant
     */
    public List<DnsItem> getItems(String domaine) {
        List<DnsItem> result = new ArrayList<>();
        for (DnsItem item : nomToItem.values()) {
            if (item.getNomMachine().getDomaine().equals(domaine)) {
                result.add(item);
            }
        }
        return result;
    }


    @param ip AdresseIP à ajouter
     * @param nom NomMachine à ajouter
     * @throws IOException si problème  
     * @throws IllegalArgumentException si le nom ou IP existe déjà
     
    public void addItem(AdresseIP ip, NomMachine nom) throws IOException {
        
        if (nomToItem.containsKey(nom.getNom())) {
            throw new IllegalArgumentException("ERREUR : Le nom de machine existe déjà !");
        }
        if (ipToItem.containsKey(ip.getIp())) {
            throw new IllegalArgumentException("ERREUR : L'adresse IP existe déjà !");
        }










}
