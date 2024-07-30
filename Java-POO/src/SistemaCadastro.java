public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa Marcos = new Pessoa("Marcos", "12345678901");

        // definindo um endereço ao objeto Marcos

        Marcos.setEndereco("Rua Jose de Alvarenga, 123");

        System.out.println("Nome: " + Marcos.getNome() + "\nCPF: " + Marcos.getCpf() + "\nEndereço: " + Marcos.getEndereco());
        
    }
}
