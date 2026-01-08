public class SIM {
    private static int nChiamate = 0;
    private long num;
    private double saldo;


    public SIM(long num, double saldo, int nChiamate) {
        this.num = num;
        this.saldo = saldo;
        this.nChiamate = nChiamate;
    }

    public static int incrChiamate() {
        return nChiamate++;
    }

    public long getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getnChiamate() {
        return nChiamate;
    }

    public void setnChiamate(int nChiamate) {
        this.nChiamate = nChiamate;
    }


    public void stampa() {

        System.out.println("SIM{" +
                "num=" + getNum() +
                ", saldo=" + getSaldo() +
                ", nChiamate=" + nChiamate +
                '}');
    }
}
