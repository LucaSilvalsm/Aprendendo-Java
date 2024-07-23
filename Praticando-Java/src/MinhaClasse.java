public class MinhaClasse {

    // Aqui começa a implementação da classe MinhaClasse
    public static void main(String[] args) {

        // Aqui esta como chamamos o print do texto "Hello World!"
        System.out.println("Codigo Java em execução!. Seja bem vindo ao JAVA!");

        // Como definir uma constante em Java

        final String BR = "Brasil";

        // Como usar uma constante
        System.out.println("Estamos em: " + BR);

        // tambem pode ser assim, igual em PYTHON

        int ANO_NASCIMENTO = 1997;

        // Como usar uma variavel
        System.out.println("Ano de Nascimento: " + ANO_NASCIMENTO);

        // ou seja podemos declarar uma constante como "final" e "tudo maisculo =
        // ANO_NASCIMENTO" ou seja as duas formas são válidas

        // Dicas de como definir variaveis em Java
        // 1° coloca o tipo da variavel antes do nome da variavel
        // 2° coloca um espaço entre o nome da variavel e o valor
        // 3° não utilize caracteres especiais nem acentos
        // 4° nomes de variaveis devem ser em ingles ou nao
        // 5° use camelCase para nomes de variaveis
        // exemplo

        String nome = "Lucas";

        String sobrenome = "Moreira";

        // chamando um metodo
        System.out.println("Nome Completo: " + nomeCompletoString(nome, sobrenome));

        // ou podemos chamar assim tbm

        String nomeCompleto = nomeCompletoString(nome, sobrenome);
        System.out.println("2° chamada: Nome Completo: " + nomeCompleto);

    }

    // montando um metodo em Java

    public static String nomeCompletoString(String nome, String sobrenome) {
        return nome + " " + sobrenome;
    }

}
