import java.util.LinkedList;

public class QuadraService {
    private static LinkedList<Quadra> quadras = new LinkedList<>();


    public static Quadra cadastrarQuadra(int codigo, String nome, double valorPorHora, boolean situacao) {
        if (codigo <= 0) {
            System.out.printf("Erro código da quadra deve ser maior que zero%n");
            return null;
        }

        for (Quadra quadra : quadras) {
            if (quadra.getCodigo() == codigo) {
                System.out.printf("Erro ja possui uma quadra com esse ID%n");
                return null;
            }
        }

        if (nome == null || nome.isEmpty()) {
            System.out.printf("Erro nome de quadra invalido!%n");
            return null;
        }

        if (valorPorHora <= 0) {
            System.out.printf("Erro valor da quadra não pode ser negativo!%n");
            return null;
        }


        System.out.printf("Quadra cadastrada com sucesso!%n");
        Quadra quadra = new Quadra(codigo, nome, valorPorHora, situacao);
        quadras.add(quadra);

        return quadra;
    }
}
