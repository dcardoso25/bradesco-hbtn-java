import java.util.TreeMap;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa( List<Pessoa> pessoas) {

        return pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                Pessoa::getCargo,
                                () -> new TreeMap<>(Comparator.reverseOrder()),
                                Collectors.toCollection(TreeSet::new)
                        )
                );
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
    }




}
