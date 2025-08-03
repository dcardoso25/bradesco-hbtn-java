import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicate) {
        List<Produto> output = new ArrayList<>();
        for (Produto produto: produtos) {
            if (predicate.test(produto)) {
                output.add(produto);
            }
        }
        return output;
    }
}