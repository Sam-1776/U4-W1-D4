package it.sam.be.classi.figli;

import it.sam.be.classi.base.Veicolo;

public class Auto extends Veicolo {

    private final int NRUOTE = 4;
    public Auto(String marca, String modello) {
        super(marca, modello);
    }

    public Auto(int numeroPosti){
        super(numeroPosti);
    }

    @Override
    public void stampaDettagli() {
        System.out.println("Marca:" + getMarca() + " Modello:" + getModello() + "\n");
    }

    @Override
    public String getMarca() {
        return "la marca della macchina è: " + super.getMarca();
    }
}
