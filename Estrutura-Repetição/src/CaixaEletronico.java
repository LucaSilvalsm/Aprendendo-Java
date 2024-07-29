import java.util.Scanner;


public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double saldo = 0.0;
        double saque;

        System.out.println("Bem-vindo ao Caixa Eletronico!");
        System.out.print("Informe seu saldo inicial: ");        
        saldo = sc.nextDouble();

        System.out.println("\nInforme o valor que deseja sacar:");
        saque = sc.nextDouble();

        if (saque > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= saque;
            System.out.printf("\nSaque realizado com sucesso! Saldo atual: %.2f\n", saldo);
        }



    }
}
