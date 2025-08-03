import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro ) {
        List<Produto> output = new ArrayList<>();
        for (Produto produto: produtos) {
            if (criterioFiltro.testar(produto)) {
                output.add(produto);
            }
        }
        return output;
    }
}