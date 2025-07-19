import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt";
        try (
                BufferedReader br = new BufferedReader(new FileReader(fileName))
        ){
            System.out.println("Conteudo do arquivo:\n");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
            System.out.println("Leitura do arquivo concluída.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
