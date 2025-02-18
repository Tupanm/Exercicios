import java.util.Scanner;

public class Main { 
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n1;
    double n2, n3; 

    while (true) { 
      System.out.println("\n---------------- Calculadora ----------------\n");
      System.out.println("Escolha um operação:\n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão\n 0 - Sair");

      try {
        n1 = sc.nextInt();

        if (n1 == 0) {
          System.out.println("Programa encerrado!");
          break;
        }

        if (n1 < 0 || n1 > 4) {
          System.out.println("Número inválido! Tente novamente.");
          continue;
        }

        System.out.println("Digite o primeiro número: ");
        n2 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        n3 = sc.nextDouble();

        switch (n1) {
          case 1:
            soma(n2, n3);
            break;
          case 2:
            sub(n2, n3);
            break;
          case 3:
            multi(n2, n3);
            break;
          case 4:
            div(n2, n3); 
            break;
          default:
            System.out.println("Número inválido! tente novamente.");
            break;
        }
      } catch (Exception e) {
        System.out.println("Número inválido! Tente novamente.");
        sc.nextLine();
      }
    }
  }

  public static void soma(double n2, double n3){
    double f = n2 + n3;
    System.out.printf("A soma dos números %.2f e %.2f é igual a: %.2f%n", n2, n3, f);
  }
  public static void sub(double n2, double n3){
    double f = n2 - n3;
    System.out.printf("A subtração do número %.2f pelo número %.2f é igual a: %.2f%n", n2, n3, f);
  }
  public static void multi(double n2, double n3){
    double f = n2 * n3;
    System.out.printf("A multiplicação dos números %.2f e %.2f é igual a: %.2f%n", n2, n3, f);
  }
  public static void div(double n2, double n3){
    if (n3 != 0) {
    double  f = n2 / n3;
    System.out.printf("A divisão do número %.2f pelo número %.2f é igual a: %.2f%n", n2, n3, f);
    }
    else{
      System.out.println("Não é possível dividir por esse número!");
    }
    
  }
      
  }
