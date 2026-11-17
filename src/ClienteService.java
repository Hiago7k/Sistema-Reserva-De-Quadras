import java.util.LinkedList;

public class ClienteService {
    private static LinkedList<Cliente> clientes = new LinkedList<>();

    public static Cliente cadastrarCliente(int id, String nome, boolean situacao) {
        if (id <= 0) {
            System.out.printf("Erro ID precisa ser maior que 0 %n");
            return null;
        }

        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                System.out.printf("Erro ja possui um cliente cadastrado com esse Id %n");
                return null;
            }
        }

        if (nome == null || nome.isEmpty()) {
            System.out.println("Erro nome invalido!");
            return null;
        }

        Cliente cliente = new Cliente(id, nome, situacao);
        //   System.out.printf("Cliente criado com êxito%n");
        clientes.add(cliente);
        return cliente;
    }

    public static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.printf("Nenhum cliente cadastrado!%n");
            return;
        }

        for (Cliente cliente : clientes) {
            cliente.dadosCliente();
        }
    }

    public static Cliente buscarClienteId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }

        System.out.printf("Cliente não encontrado!%n");
        return null;
    }


    public static void bloquearCliente(int codigo) {
        if (buscarClienteId(codigo) == null) {
            return;
        }

        System.out.printf("Cliente bloqueado com sucesso!%n");
        buscarClienteId(codigo).setBloquearCliente();
    }

    public static void desbloquearCliente(int codigo) {
        if (buscarClienteId(codigo) == null) {
            return;
        }
        System.out.printf("Cliente desbloqueado com sucesso %n");
        buscarClienteId(codigo).setDesbloquearCliente();
    }
}
