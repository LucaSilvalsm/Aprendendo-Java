import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o limite diário de saque
        
        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;  // Inicializa o limite restante com o valor do limite diário

        // Loop para iterar sobre os saques
        for (int i = 1; ; i++)  {  // Loop infinito até que o break seja acionado
          
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // Atualiza o limite restante
                limiteRestante -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f%n", limiteRestante);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
