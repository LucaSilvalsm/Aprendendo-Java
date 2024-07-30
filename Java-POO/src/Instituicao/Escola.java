package Instituicao;

public class Escola {
    public static void main(String[] args) {
        Aluno Lucas = new Aluno();
       Lucas.setNome("Lucas");
       Lucas.setIdade(26);

       System.out.println("Nome: " + Lucas.getNome() + ", Idade: " + Lucas.getIdade()  + " anos");
        
    }
    
}
