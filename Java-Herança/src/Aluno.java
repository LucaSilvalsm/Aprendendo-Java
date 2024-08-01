// Aluno.java
public class Aluno extends Pessoa {
    String curso;

    // Construtor da classe Aluno
    Aluno(String nome, String curso) {
        super(nome); // Chama o construtor da classe base Pessoa
        this.curso = curso;
    }

    @Override
    void imprimirNome() {
        super.imprimirNome(); // Chama o método imprimirNome da classe base
    }
    
    void imprimirCurso() {
        System.out.println("Curso: " + curso);
    }

    void mostrarInformacoes() {
        imprimirNome();
        imprimirCurso();
    }
}
