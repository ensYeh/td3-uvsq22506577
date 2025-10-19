package fr.uvsq.cprog.collex;

public class AdressIP {
    private final String ip;

    public AdresseIP(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return ip;
    }
}
