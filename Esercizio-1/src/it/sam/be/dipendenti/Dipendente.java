package it.sam.be.dipendenti;

public class Dipendente {
    private static float stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private float importoOrarioStraordinario;
    private Livello Livello;
    private Dipartimento Dipartimento;


    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        Livello = it.sam.be.dipendenti.Livello.OPERAIO;
        Dipartimento = dipartimento;
    }

    public Dipendente(String matricola, double stipendio, float importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
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

    public Livello getLivello() {
        return Livello;
    }

    public void setImportoOrarioStraordinario(float importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
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

    public Livello Promuovi(){
        if (Livello == it.sam.be.dipendenti.Livello.OPERAIO) {
            Livello = it.sam.be.dipendenti.Livello.valueOf("IMPIEGATO");
            this.stipendio = (stipendioBase * 1.2);
        } else if (Livello == it.sam.be.dipendenti.Livello.IMPIEGATO) {
            Livello = it.sam.be.dipendenti.Livello.valueOf("QUADRO");
            this.stipendio = (stipendioBase * 1.5);
        } else if (Livello == it.sam.be.dipendenti.Livello.QUADRO) {
            Livello = it.sam.be.dipendenti.Livello.valueOf("DIRIGENTE");
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
