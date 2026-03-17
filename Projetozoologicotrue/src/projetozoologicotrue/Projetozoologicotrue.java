
package projetozoologicotrue;

import java.util.ArrayList;
import java.util.Scanner;
import projetozoologicotrue.Animal;
import projetozoologicotrue.Elefante;
import projetozoologicotrue.Leao;
import projetozoologicotrue.Macaco;
import projetozoologicotrue.Setor;
import projetozoologicotrue.Tratador;

public class Projetozoologicotrue {

        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Tratador> tratadores = new ArrayList<>();
        ArrayList<Setor> setores = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n ZOOLÓGICO ");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Cadastrar Tratador");
            System.out.println("3. Listar Animais");
            System.out.println("4. Mostrar Alimentação");
            System.out.println("5. Exibir Setores");
            System.out.println("6. Sair");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("1-Leão 2-Macaco 3-Elefante");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Habitat: ");
                    String habitat = sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Tipo de pelugem: ");
                        String juba = sc.nextLine();
                        animais.add(new Leao(nome, idade, habitat, juba));

                    } else if (tipo == 2) {
                        System.out.print("Espécie: ");
                        String especie = sc.nextLine();
                        animais.add(new Macaco(nome, idade, habitat, especie));

                    } else if (tipo == 3) {
                        System.out.print("Peso: ");
                        double peso = sc.nextDouble();
                        animais.add(new Elefante(nome, idade, habitat, peso));
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String tNome = sc.nextLine();

                    System.out.print("Idade: ");
                    int tIdade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Setor: ");
                    String tSetor = sc.nextLine();

                    tratadores.add(new Tratador(tNome, tIdade, tSetor));
                    break;

                case 3:
                    for (Animal a : animais) {
                        a.mostrarDados();
                        a.emitirSom();
                        System.out.println("----------------");
                    }
                    break;

                case 4:
                    for (Animal a : animais) {
                        a.mostrarAlimentacao();
                    }
                    break;

                case 5:
                    for (Setor s : setores) {
                        s.mostrarSetor();
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}
