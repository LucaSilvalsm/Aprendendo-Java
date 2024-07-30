public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println(estado.getSigla() + " - " + estado.getNomeMaiscula() + " - " + estado);
        }

        // Selecionando um estado pelo nome
        EstadoBrasileiro estadoSelecionado = EstadoBrasileiro.fromNome("Rio de Janeiro");
        System.out.println("Estado Selecionado: " + estadoSelecionado);

        // outro exemplo de seleção pelo nome
        EstadoBrasileiro estadoSelecionados = EstadoBrasileiro.RIO_DE_JANEIRO;
        System.out.println("Ex2 Estado Selecionado: " + estadoSelecionados.getNome());
    }
}
