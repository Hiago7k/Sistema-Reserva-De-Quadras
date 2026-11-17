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
}
