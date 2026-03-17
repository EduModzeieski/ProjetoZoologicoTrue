package projetozoologicotrue;

import projetozoologicotrue.Animal;

public class Elefante extends Animal {
    private double peso;

    public Elefante(String nome, int idade, String habitat, double peso) {
        super(nome, idade, habitat);
        this.peso = peso;
    }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    @Override
    public void emitirSom() {
        System.out.println("Elefante barritando!");
    }

    @Override
    public void mostrarAlimentacao() {
        System.out.println("Elefante come plantas.");
    }
}