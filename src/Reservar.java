import java.time.OffsetDateTime;

public class Reservar {
    private int codigo;
    private Cliente clienteResponsavel;
    private Quadra quadraReservada;
    private OffsetDateTime dataHorarioInicio;
    private OffsetDateTime dataHorarioTermino;
    private double valorPorHoraAtual; // valor da quadra reservada
    private double valorTotal;
    private boolean situacaoDaReserva;

    public Reservar(int codigo, Cliente clienteResponsavel, OffsetDateTime dataHorarioInicio,
                    OffsetDateTime dataHorarioTermino,
                    double valorTotal, boolean situacaoDaReserva, Quadra quadraReservada) {
        this.codigo = codigo;
        this.clienteResponsavel = clienteResponsavel;
        this.dataHorarioInicio = dataHorarioInicio;
        this.dataHorarioTermino = dataHorarioTermino;
        this.valorPorHoraAtual = quadraReservada.getValorPorhora();
        this.valorTotal = valorTotal; // diferenca das horas *
        this.situacaoDaReserva = situacaoDaReserva;
        this.quadraReservada = quadraReservada;
    }


    public int getCodigo() {
        return codigo;
    }

    public Cliente getClienteResponsavel() {
        return clienteResponsavel;
    }

    public Quadra getQuadraReservada() {
        return quadraReservada;
    }

    public OffsetDateTime getDataHorarioInicio() {
        return dataHorarioInicio;
    }

    public OffsetDateTime getDataHorarioTermino() {
        return dataHorarioTermino;
    }

    public double getValorPorHoraAtual() {
        return valorPorHoraAtual;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public boolean isSituacaoDaReserva() {
        return situacaoDaReserva;
    }

    public void dadosReserva() {
        System.out.printf("%d | %s | %s | Data inicio %s | Data termino %s | Valor Por hora R$ %.2f | Total R$ %.2f | Situação reserva %s%n ",
                this.getCodigo(),
                clienteResponsavel.getNome(),
                this.getDataHorarioInicio(),
                this.getDataHorarioTermino(),
                this.getValorPorHoraAtual(),
                this.getValorTotal(),
                this.isSituacaoDaReserva() ? "Sucesso" : "Falha ao reservar"
        );
    }
}
