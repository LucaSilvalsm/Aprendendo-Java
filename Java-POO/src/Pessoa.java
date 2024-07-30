public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String cpf;
    




    // construtor

    public Pessoa(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }



    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }




   
    
}
