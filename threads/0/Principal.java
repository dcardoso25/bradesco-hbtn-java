

public class Principal {

    public static void main(String[] args) {

        Contador contador = new Contador();
        ThreadContador threadContador1 = new ThreadContador(contador);
        ThreadContador threadContador2 = new ThreadContador(contador);

        // iniciando as threads
        threadContador1.start();
        threadContador2.start();

        // Aguardar as duas finalizarem
        try {
            threadContador1.join();
            threadContador2.join();
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Valor final do contador: " + contador.getContagem());
    }

}