import java.util.Scanner;

public class main{
  static Scanner sc = new Scanner(System.in);
  static double n1, euro, dolar;
  static int n2;
  
  public static void main(String[] args) {
    while (true) { 
      System.out.println("Digite o valor em reais: ");
      n1 = sc.nextDouble();

      if (n1 <= 0) {
        System.out.println("Número inválido! tente novamente.");
        continue;
      }

      System.out.println("Digite 1 para euro, e 2 para dólar(0 para sair)");
      n2 = sc.nextInt();

      switch ((int) n2) {
        case 0:
            System.out.println("Programa encerrado!");
            return;
        case 1:
            euro();
            break;
        case 2: 
            dolar();
            break;
        default:
            System.out.println("número incorreto! tente novamente.");;
    }
    }
      

  }

  public static void euro() {
    euro = n1 * 5.95;
    System.out.printf("Você terá %.2f em euros.\n", euro);
  }
  
  public static void dolar() {
    dolar = n1 * 5.69;
    System.out.printf("Você terá %.2f em dólares.\n", dolar);
  }

}
