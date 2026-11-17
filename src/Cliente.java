public class Cliente {
    private int id;
    private String nome;
    private boolean situacao;

    public Cliente(int id, String nome, boolean situacao) {
        this.id = id;
        this.nome = nome;
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getNome() {
        return nome;
    }

    public void dadosCliente() {
        System.out.printf("%d | %s | %s %n",
                this.getId(),
                this.getNome(),
                this.isSituacao() ? "Ativo" : "Bloqueado"
        );
    }
}
