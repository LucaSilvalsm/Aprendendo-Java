import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo e o valor do saque ao usuário
       
        double saldo = scanner.nextDouble();
        
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque é possível
        if (saque <= saldo) {
            // O saque não ultrapassa o saldo disponível
            System.out.println("Transacao realizada com sucesso.");
        } else if (saque <= saldo + limiteChequeEspecial) {
            // O saque ultrapassa o saldo, mas está dentro do limite do cheque especial
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            // O saque ultrapassa o limite do cheque especial
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
