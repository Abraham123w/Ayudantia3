package org.example;
public class Jugador {
    private int vida;
    private String ataque;
    public Jugador(int vida, String ataque) {
        this.vida = vida;
        this.ataque=ataque;


    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int aVida) {
        this.vida = aVida;
    }

    public void enfrentarEnemigo() {
        throw new UnsupportedOperationException();
    }

    public void atacarCompanero() {
        throw new UnsupportedOperationException();
    }
}