package it.sam.be.dipendenti;

public class Dipendente {
    private static float stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private float importoOrarioStraordinario;
    private String Livello;
    private String Dipartimento;


    public Dipendente(String matricola, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        Livello = "OPERAIO";
        Dipartimento = dipartimento;
    }

    public Dipendente(String matricola, double stipendio, float importoOrarioStraordinario, String livello, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        Livello = livello;
        Dipartimento = dipartimento;
    }

    public static float getStipendioBase() {
        return stipendioBase;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getLivello() {
        return Livello;
    }

    public void setImportoOrarioStraordinario(float importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(String dipartimento) {
        Dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", Livello='" + Livello + '\'' +
                ", Dipartimento='" + Dipartimento + '\'' +
                '}';
    }

    public String Promuovi(){
        if (Livello.equals("OPERAIO")) {
            Livello = "IMPIEGATO";
            this.stipendio = (stipendioBase * 1.2);
        } else if (Livello.equals("IMPIEGATO")) {
            Livello = "QUADRO";
            this.stipendio = (stipendioBase * 1.2);
        } else if (Livello.equals("QUADRO")) {
            Livello = "DIRIGENTE";
            this.stipendio = (stipendioBase * 2);
        }else {
            System.out.println("Un dirigente non si può promuovere");

        }
        return Livello;
    }

    public static double calcolaPaga(Dipendente x){
        return x.getStipendio();
    }

    public static double calcolaPaga(Dipendente x, int y){
        int pagaOre = (int) (x.importoOrarioStraordinario * y);
        double pagaMesePlusStraordinario = x.getStipendio() + pagaOre;
        return pagaMesePlusStraordinario;
    }

}
