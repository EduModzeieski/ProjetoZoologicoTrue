package projetozoologicotrue;

public class Leao extends Animal {
    
    private String tipoJuba;

    public Leao(String nome, int idade, String habitat, String tipoJuba) {
        super(nome, idade, habitat);
        this.tipoJuba = tipoJuba;
    }

    public String getTipoJuba() { return tipoJuba; }
    public void setTipoJuba(String tipoJuba) { this.tipoJuba = tipoJuba; }

    @Override
    public void emitirSom() {
        System.out.println("Leão rugindo!");
    }

    @Override
    public void mostrarAlimentacao() {
        System.out.println("Leão come carne.");
    }
}