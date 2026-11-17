import java.time.OffsetDateTime;
import java.time.ZoneOffset;

class Main {
    static void main() {
        ReservarService reservarService = new ReservarService();

        Cliente gabriel = ClienteService.cadastrarCliente(1, "Gabriel", true);
        Cliente mariana = ClienteService.cadastrarCliente(2, "Mariana", true);
        Cliente roberto = ClienteService.cadastrarCliente(3, "Roberto", false);

        ClienteService.bloquearCliente(3);
        //ClienteService.desbloquearCliente(3);

        ClienteService.listarClientes();

        System.out.printf("---- Quadras ----%n");
        Quadra quadraFutebol = QuadraService.cadastrarQuadra(101, "Futebol Society", 120, true);
        Quadra quadraFutsal = QuadraService.cadastrarQuadra(102, "Futsal", 90, true);
        QuadraService.cadastrarQuadra(103, "Tênis", 70, true);
        QuadraService.listarQuadras();


        OffsetDateTime dataPersonalizada = OffsetDateTime.of(
                2026, 11, 17,
                23, 30, 0, 0,
                ZoneOffset.of(  "-03:00")
        );

        System.out.println(dataPersonalizada);
        System.out.println();
        System.out.printf("---- sistema de reservas ----%n");
        reservarService.fazerUmaReserva(99, gabriel,  OffsetDateTime.now(), dataPersonalizada, quadraFutebol, 0);
        reservarService.listarReservaDeUmCliente(gabriel);


    }
}