package projetozoologicotrue;

public class Tratador {
    private String nome;
    private int idade;
    private String setor;

    public Tratador(String nome, int idade, String setor) {
        this.nome = nome;
        this.idade = idade;
        this.setor = setor;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    public void mostrarDados() {
        System.out.println("Tratador: " + nome + " | Setor: " + setor);
    }
}
