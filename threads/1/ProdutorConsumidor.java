public class ProdutorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();


        // Criar e iniciar as threads do produtor e consumidor
        Thread consumidorThread = new Consumidor(buffer);
        consumidorThread.start();

        Thread produtorThread = new Produtor(buffer);
        produtorThread.start();

        try {
            produtorThread.join();
            consumidorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}