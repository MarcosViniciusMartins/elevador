classe Elevador 
public class elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    // Construtor
    public elevador(int capacidade, int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
    }

    // Método para adicionar uma pessoa no elevador
    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("O elevador está cheio, não é possível entrar mais pessoas.");
        }
    }

    // Método para remover uma pessoa do elevador
    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador já está vazio, não é possível remover mais pessoas.");
        }
    }

    // Método para subir um andar
    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar, não pode subir mais.");
        }
    }

    // Método para descer um andar
    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo, não pode descer mais.");
        }
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        elevador elevador = new elevador(10, 20);
        elevador.entrar();
        elevador.subir();
    }
}

//main

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 System.out.println("Informe o andar atual:");
    int andarAtual = input.nextInt();
    System.out.println("Informe o total de andares: ");
    int totalAndares = input.nextInt();
    System.out.println("Informe a capacidade do elevador: ");
    int capacidade = input.nextInt();
    System.out.println("Informe a quantidade de pessoas presentes no elevador: ");
    int pessoasPresentes = input.nextInt();
    elevador elevador = new elevador(capacidade, totalAndares);
    elevador.entrar();
    elevador.subir();
    elevador.descer();  

  }

 
}
