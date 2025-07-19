import java.io.FileReader;
import java.io.BufferedReader;

public class CsvFileReader {
    public static void main(String[] args) {
        String filename = "funcionarios.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = br.readLine()) != null) {
                // Nome,Idade,Departamento,Salarial
                String[] data = line.split(",");
                System.out.printf("Funcionário: %s\n", data[0]);
                System.out.printf("Idade: %s\n", data[1]);
                System.out.printf("Departamento: %s\n", data[2]);
                System.out.printf("Salarial: %s\n", data[3]);
                System.out.println("------------------------");
            }
            System.out.println("Leitura do arquivo concluída.");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}