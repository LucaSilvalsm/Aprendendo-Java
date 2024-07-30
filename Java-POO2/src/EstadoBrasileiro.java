public enum EstadoBrasileiro {
    SAO_PAULO ("SP" , "São Paulo"),
    RIO_DE_JANEIRO ("RJ" , "Rio de Janeiro"),
    MINAS_GERAIS ("MG" , "Minas Gerais"),
    GOIAS ("GO" , "Goiás"),
    BAHIA("BA" , "Bahia"),
    RIO_GRANDE_DO_SUL ("RS" , "Rio Grande do Sul");

    private String sigla;
    private String nome;

    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    public String getNome() {
        return nome;
    }

    public String getNomeMaiscula() {
        return nome.toUpperCase();
    }

    public static EstadoBrasileiro fromNome(String nome) {
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            if (estado.getNome().equalsIgnoreCase(nome)) {
                return estado;
            }
        }
        throw new IllegalArgumentException("Nome do estado inválido: " + nome);
    }
}
