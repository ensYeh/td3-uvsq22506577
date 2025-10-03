package fr.uvsq.cprog.collex;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Dns {
     private Map<String, DnsItem> nomToItem; 
    private Map<String, DnsItem> ipToItem;  
    private Path filePath;                   

    public Dns(String fileName) throws IOException {
        this.filePath = Paths.get(fileName);
        nomToItem = new HashMap<>();
        ipToItem = new HashMap<>();
        loadFromFile();
    }


    











}
