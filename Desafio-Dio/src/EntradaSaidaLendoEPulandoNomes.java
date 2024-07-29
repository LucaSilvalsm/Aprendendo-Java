import java.util.Locale;
import java.util.Scanner;

public class EntradaSaidaLendoEPulandoNomes {
    public static void main(String[] args) {
		Locale.setDefault(Locale.of("pt", "BR"));
        Scanner sc = new Scanner(System.in);
        
        String[] a = new String[10];
        for(int i = 0; i < 10; i++) {
            System.out.println("Digite a linha " + (i + 1) + ":");
            a[i] = sc.nextLine();
        }
        
        // Exibindo os elementos nas posições 2, 6 e 8
        System.out.printf("%s\n%s\n%s\n", a[2], a[6], a[8]);
        
        sc.close();
    }
}
