package it.sam.be.classi.base;

public abstract class Veicolo {

    private String marca;
    private String modello;

    protected int numeriPosti;

    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public Veicolo(int numeriPosti) {
        this.numeriPosti = numeriPosti;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Veicolo veicolo = (Veicolo) obj;
        return marca.equals(veicolo.marca) && modello.equals(veicolo.modello);
//        return super.equals(obj);
    }

    public abstract void stampaDettagli();
}
