import java.util.Scanner;

public class SimulacaoBancaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    double saldo = 0;
    double deposito;
    double saque;
    
    while (true) { 

      int opcao = scanner.nextInt(); 
   
    // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
      switch(opcao){
       case 1:
        deposito = scanner.nextDouble();
        saldo += deposito;
        System.out.printf("Saldo atual: %.1f\n", saldo);
        break;
       case 2:
        saque = scanner.nextDouble();
        if(saque <= saldo){
         saldo -= saque;
         System.out.printf("Saldo atual: %.1f\n", saldo);
        } else System.out.println("Saldo insuficiente.");
        break;
       case 3:
        System.out.printf("Saldo atual: %.1f\n", saldo);
        break;
       case 0:
        System.out.println("Programa encerrado.");
        scanner.close();
        return; // Encerra o método main, e consequentemente, o programa
         
       // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:   
       default:
        System.out.println("Opção inválida. Tente novamente."); 
      }
    }
  }
}