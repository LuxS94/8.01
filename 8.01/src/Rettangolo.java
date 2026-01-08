public class Rettangolo {
    private static int nRettangoli = 0;
    private double altezza;
    private double lunghezza;

    public Rettangolo(double altezza, double lunghezza) {
        this.altezza = altezza;
        this.lunghezza = lunghezza;
        nRettangoli++;

    }

    public static int getnRettangoli() {
        System.out.println("Numero di rettangoli= " + nRettangoli);
        return nRettangoli;
    }

    public static void stampaDueRettangoli(Rettangolo a, Rettangolo b) {
        double area1 = a.calcolaArea();
        double perimetro1 = a.calcolaPerimetro();
        double area2 = b.calcolaArea();
        double perimetro2 = b.calcolaPerimetro();
        double sommaAree = area1 + area2;
        double sommaPerimetri = perimetro1 + perimetro2;
        System.out.println("Area 1 = " + area1 + ";" + "Area2 = " + area2 + ";" + "Perimetro 1 = " + perimetro1 + ";" + "Perimetro 2 = " +
                perimetro2 + ";" + "Somma delle aree = " + sommaAree + ";" + "Somma dei perimetri = " + sommaPerimetri);
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    private double calcolaArea() {
        return lunghezza * altezza;
    }

    private double calcolaPerimetro() {
        return 2 * (lunghezza + altezza);
    }

    public void stampaRettangolo() {
        System.out.println("Area=" + this.calcolaArea() + ";" + "Perimetro=" + this.calcolaPerimetro() + ";");

    }


}
