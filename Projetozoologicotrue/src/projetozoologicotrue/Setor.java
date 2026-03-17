package projetozoologicotrue;

public class Setor {
    private String nome;
    private String tipo;
    private int capacidade;

    public Setor(String nome, String tipo, int capacidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public void mostrarSetor() {
        System.out.println("Setor: " + nome + " | Tipo: " + tipo + " | Capacidade: " + capacidade);
        System.out.println("teste");
    }
    
}