package projetozoologicotrue;

public class Macaco extends Animal {
    
    private String especie;

    public Macaco(String nome, int idade, String habitat, String especie) {
        super(nome, idade, habitat);
        this.especie = especie;
    }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    @Override
    public void emitirSom() {
        System.out.println("Macaco gritando!");
    }

    @Override
    public void mostrarAlimentacao() {
        System.out.println("Macaco come frutas.");
    }
}
