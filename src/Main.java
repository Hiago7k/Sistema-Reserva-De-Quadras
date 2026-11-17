class Main {
    static void main() {

        ClienteService.cadastrarCliente(1, "Gabriel", true);
        ClienteService.cadastrarCliente(2, "Mariana", true);
        ClienteService.cadastrarCliente(3, "Roberto", false);

        ClienteService.bloquearCliente(3);
        ClienteService.desbloquearCliente(3);

        ClienteService.listarClientes();

        System.out.printf("---- Quadras ----%n");
        QuadraService.cadastrarQuadra(101, "Futebol Society", 120, true);
        QuadraService.cadastrarQuadra(102, "Futsal", 90, true);
        QuadraService.cadastrarQuadra(103, "Tênis", 70, true);
        QuadraService.listarQuadras();


    }
}