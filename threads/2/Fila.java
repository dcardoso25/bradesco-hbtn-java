import java.util.LinkedList;
import java.util.Random;


public class Fila {
    private final LinkedList<Integer> fila = new LinkedList<>();
    private final int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
    }

    // Adicionar item (Produtor)
    public synchronized void adicionar(int item) throws InterruptedException {
        while (fila.size() == capacidade) {
            wait(); // espera até haver espaço
        }

        fila.add(item);
        System.out.println(Thread.currentThread().getName() + " produziu: " + item);

        // Notifica todos os consumidores esperando
        notifyAll();
    }

    // Retirar item (Consumidor)
    public synchronized int retirar() throws InterruptedException {
        while (fila.isEmpty()) {
            wait(); // espera até haver item
        }

        int item = fila.removeFirst();
        System.out.println(Thread.currentThread().getName() + " consumiu: " + item);

        // Notifica todos os produtores esperando
        notifyAll();
        return item;
    }
}