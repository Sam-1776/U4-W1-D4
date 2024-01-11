import it.sam.be.dipendenti.Dipendente;

public class GestioneDipendenti {

    private static double paga;
    private static Dipendente arrDipendenti[] = new Dipendente[4];
    public static void main(String[] args){

        System.out.println("Esercizio 2");

        Dipendente Alfonso = new Dipendente("AAA0012", "PRODUZIONE");
        Dipendente Andrea = new Dipendente("AAA0103","PRODUZIONE");
        Dipendente Gianni = new Dipendente("BBB1100",1200,50,"IMPIEGATO","AMMINISTRAZIONE");
        Dipendente Matteo = new Dipendente("CCC2100",2000,100,"DIRIGENTE","VENDITE");

        arrDipendenti[0] = Alfonso;
        arrDipendenti[1] = Andrea;
        arrDipendenti[2] = Gianni;
        arrDipendenti[3] = Matteo;

        System.out.println("----------Prima della promozione----------");
        System.out.println(Alfonso.toString());
        System.out.println(Andrea.toString());
        System.out.println(Gianni.toString());
        System.out.println(Matteo.toString());

        Andrea.Promuovi();
        Gianni.Promuovi();


        System.out.println("----------Dopo la promozione----------");
        System.out.println(Alfonso.toString());
        System.out.println(Andrea.toString());
        System.out.println(Gianni.toString());
        System.out.println(Matteo.toString());

        System.out.println("La paga finale è: " + Conta(arrDipendenti));

    }

    private static double Conta(Dipendente[] x){
        for (int i = 0; i < x.length; i++) {
            paga = paga + Dipendente.calcolaPaga(x[i], 5);
        }
        return paga;
    }
}
