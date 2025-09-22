import java.util.Random;

public class Produtor extends Thread {
    private final Fila fila;
    private final Random random = new Random();

    public Produtor(Fila fila, String nome) {
        super(nome);
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int numero = random.nextInt(100) + 1; // gera de 1 a 100
                fila.adicionar(numero);
                Thread.sleep(1000); // intervalo entre produções
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " finalizado.");
        }
    }
}