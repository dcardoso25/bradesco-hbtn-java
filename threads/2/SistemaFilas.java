public class SistemaFilas {
    public static void main(String[] args) {
        Fila fila = new Fila(10);

        Produtor p1 = new Produtor(fila, "Produtor-1");
        Produtor p2 = new Produtor(fila, "Produtor-2");
        Consumidor c1 = new Consumidor(fila, "Consumidor-1");
        Consumidor c2 = new Consumidor(fila, "Consumidor-2");
        
        p1.start();
        p2.start();
        c1.start();
        c2.start();

        // Simula execução por 20 segundoscd
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Encerrando o sistema...");
        System.exit(0);
    }
}