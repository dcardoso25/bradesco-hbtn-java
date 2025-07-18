import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            boolean finished = false;
            while (scanner.hasNextLine() && !finished) {
                String line = scanner.nextLine();
                if (line.equals("sair")) break;
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Arquivo " + fileName + " foi salvo com sucesso!");

        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }

        scanner.close();



    }
}