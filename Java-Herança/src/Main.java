// Main.java
public class Main {
    public static void main(String[] args) {
        // Passa os parâmetros necessários para o construtor de Aluno
        Aluno aluno = new Aluno("Lucas", "Sistemas de Informação");
        aluno.mostrarInformacoes();

        Aluno marcos = new Aluno("Marcos", "Engenharia de Software");
        marcos.mostrarInformacoes();
    }
}
