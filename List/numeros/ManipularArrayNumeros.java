import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numero) {
                return i;
            }
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> numeros, int numero) {
        int position = buscarPosicaoNumero(numeros, numero);

        if (position > -1) {
            System.out.println("Numero jah contido na lista");
        } else {
            numeros.add(numero);
        }
    }

    public static void removerNumero(List<Integer> numeros, int numero) {
        int position = buscarPosicaoNumero(numeros, numero);

        if (position > -1) {
            numeros.remove(position);
        } else {
            System.out.println("Numero nao encontrado na lista");
        }
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        int position = buscarPosicaoNumero(numeros, numeroSubstituir);

        if (position > -1) {
            numeros.set(position, numeroSubstituto);
        } else {
            numeros.add(numeroSubstituto);
        }
    }
}