public class Cliente {
    private int codigo;
    private String nome;
    private boolean situacao;

    public Cliente(int codigo, String nome, boolean situacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.situacao = situacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getNome() {
        return nome;
    }

    public void dadosCliente() {
        System.out.printf("%d | %s | %s ",
                this.codigo,
                this.getNome(),
                this.isSituacao() ? "Ativo" : "Bloqueado"
        );
    }
}
