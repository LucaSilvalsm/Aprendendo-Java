package Instituicao;

public class Aluno {
    private String nome;
    private int idade;
 

    public String getNome() // os Gettes retornam o valor da variável correspondente
    {
        return nome;
    }
    
    public void setNome(String nome) // os Settes para obter um novo valor para a variável correspondente
    {
        this.nome = nome;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
}
