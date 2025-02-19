import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int n1;
    int numAle = (int) (Math.random() * (100 -1 +1) +1);
    int tentativas = 0;

    System.out.println("\n--------------------- Bem Vindo ao Jogo do Número Misterioso ---------------------\n");

    while (true) { 
      
      try {
        System.out.println("\nDigite o número e tente acertar o número Misterioso:\n ");
        n1 = sc.nextInt();
        tentativas++;
        if (n1 > numAle) {
          System.out.println("\nO número misterioso é menor. \n");
        } 
        else if (n1 < numAle) {
          System.out.println("\nO numéro misterioso é maior. \n");
        }
        else {
          System.out.println("\nParabens!!! Você descobriu em " + tentativas + " tentativas.");
          System.out.println("\nGostaria de jogar novamente?\n1 - Sim\n0 - Não\n");
          int resp = sc.nextInt();
          if (resp == 0) {
            System.out.println("\nObrigado por Jogar!!");
            break;
          }
          else{
            numAle = (int) (Math.random() * (100 -1 +1) +1);
            tentativas = 0;
          }
        }
      
      } catch (Exception e) {
        System.out.println("\nEntrada Inválida! Digite apenas números inteiros.");
        sc.nextLine();
      }
          }
    
  }
}
