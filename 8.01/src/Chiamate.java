public class Chiamate {
    private static int nChiamate = 0;
    private double durata;
    private long numero;

    public Chiamate(double durata, long numero) {
        this.durata = durata;
        this.numero = numero;
        nChiamate++;
    }

    public static int getnChiamate() {
        return nChiamate;
    }

    public double getDurata() {
        return durata;
    }

    public long getNumero() {
        return numero;
    }

}
