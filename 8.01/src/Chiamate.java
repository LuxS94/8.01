public class Chiamate {
    private double durata;
    private long numero;

    public Chiamate(double durata, long numero) {
        this.durata = durata;
        this.numero = numero;
        SIM.incrChiamate();
    }

    public double getDurata() {
        return durata;
    }

    public long getNumero() {
        return numero;
    }

}
