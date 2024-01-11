import it.sam.be.classi.base.Veicolo;
import it.sam.be.classi.figli.Auto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GestioneTrasporti {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Gestione Trasporti");

        Veicolo veicolo1 = new Auto("Fiat", "Panda");
        Veicolo veicolo2 = new Auto("Fiat", "Panda");
        Veicolo veicolo3 = new Auto("Alfa Romeo", "Giulia");

        if (veicolo1.equals(veicolo2)) {
            System.out.println("I veicoli sono uguali");
        }
        if (!veicolo1.equals(veicolo3)) {
            System.out.println("Non sono uguali");
        }

        veicolo1.stampaDettagli();
        veicolo1.getMarca();

    }
}