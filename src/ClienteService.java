import java.util.LinkedList;

public class ClienteService {
    private static LinkedList<Cliente> clientes = new LinkedList<>();

    public static Cliente cadastrarCliente(int id, String nome, boolean situacao){
        if (id <= 0){
            System.out.printf("Erro ID precisa ser maior que 0 %n");
            return null;
        }

        for (Cliente cliente : clientes){
            if (cliente.getId() == id){
                System.out.printf("Erro ja possui um cliente cadastrado com esse Id %n");
                return null;
            }
        }

        if (nome == null || nome.isEmpty()){
            System.out.println("Erro nome invalido!");
            return null;
        }

        Cliente cliente = new Cliente(id, nome, situacao);
        System.out.printf("Cliente criado com êxito%n");
        clientes.add(cliente);
        return cliente;
    }
}
