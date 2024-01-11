import it.sam.be.dipendenti.Dipendente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio 1");

        Dipendente Piero = new Dipendente("AAA00023", "PRODUZIONE");

        System.out.println( Piero.getStipendio());
        System.out.println(Piero.toString());
        Piero.Promuovi();
        System.out.println(Piero.toString());
        System.out.println(Dipendente.calcolaPaga(Piero));
        System.out.println(Dipendente.calcolaPaga(Piero,40));
        System.out.println(Piero.getLivello());
        System.out.println(Piero.getStipendio());
        System.out.println(Piero.getMatricola());

    }
}