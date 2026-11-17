class Main {
    static void main() {

        ClienteService.cadastrarCliente(1, "Gabriel", true);
        ClienteService.cadastrarCliente(2, "Mariana", true);
        ClienteService.cadastrarCliente(3, "Roberto", false);

        ClienteService.listarClientes();
    }
}