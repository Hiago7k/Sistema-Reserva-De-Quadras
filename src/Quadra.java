public class Quadra {
    private int codigo;
    private String nome;
    private double valorPorhora;
    private boolean situacao;

    public Quadra(int codigo, String nome, double valorPorhora, boolean situacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorPorhora = valorPorhora;
        this.situacao = situacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValorPorhora() {
        return valorPorhora;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void dadosQuadra() {
        System.out.printf("%d | %s | R$ %.2f | %s%n",
                this.getCodigo(),
                this.getNome(),
                this.getValorPorhora(),
                this.isSituacao() ? "Disponível" : "Reservada"
                );
    }
}
