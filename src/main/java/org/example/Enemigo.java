package org.example;
public abstract class Enemigo {
    private int velocidad;
    private int vida;

    private int colmillos;
    private String tipo;

    public int getColmillos() {
        return colmillos;
    }

    public void setColmillos(int colmillos) {
        this.colmillos = colmillos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Enemigo() {
    }

    public Enemigo(int velocidad, int vida, String tipo) {
        this.velocidad = velocidad;
        this.vida = vida;
        this.tipo = tipo;
    }

    public Enemigo(int velocidad, int vida) {
        this.velocidad = velocidad;
        this.vida = vida;

    }

    public Enemigo(int velocidad, int vida, int colmillos) {
        this.velocidad = velocidad;
        this.vida = vida;
        this.colmillos = colmillos;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int aVelocidad) {
        this.velocidad = aVelocidad;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int aVida) {
        this.vida = aVida;
    }
}