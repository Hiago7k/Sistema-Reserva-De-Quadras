import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.LinkedList;

public class ReservarService {
    private LinkedList<Reservar> reservas = new LinkedList<>();
    // não ser estática por que cada cliente possui a sua lista de reservas?

    public void fazerUmaReserva(int codigo, Cliente clienteResponsavel, OffsetDateTime dataHorarioInicio, OffsetDateTime dataHorarioTermino, Quadra quadraReservada, double valorTotal) {
        if (!clienteResponsavel.isSituacao()){
            System.out.printf("somente clientes ativos podem realizar reservas!%n");
            return;
        }

        if (QuadraService.buscarQuadraId(quadraReservada.getCodigo()) == null){
            System.out.printf("Erro Quadra não existe!");
            return;
        }

        if (dataHorarioTermino.isBefore(dataHorarioInicio)){
            System.out.printf("Erro a data de termino deve ser maior que a data de inicio%n");
            return;
        }

        if (dataHorarioTermino.isAfter(dataHorarioInicio)){
            System.out.printf("Erro data de termino, é igual a de inicio");
            return;
        }

        // uma quadra não pode possuir duas reservas com horarios conflitantes
        // Uma reserva precisa ter duração mínima de uma hora.
        //  O valor total deve considerar o período reservado.

        int tempo = dataHorarioTermino.compareTo(dataHorarioInicio);
        double valorTotalDaReserva = tempo * quadraReservada.getValorPorhora();
        System.out.printf("Reserva Aceita%n");
        Reservar reservar = new Reservar(codigo, clienteResponsavel, dataHorarioInicio, dataHorarioTermino,  quadraReservada, valorTotalDaReserva);

        reservas.add(reservar);

    }


}
