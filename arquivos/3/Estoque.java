import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private String filename;

    public Estoque(String filename) {
        this.filename = filename;
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.filename, true))){

            Produto produto = new Produto(5, nome, quantidade, preco);
            bw.newLine();
            bw.write(produto.toCsv());
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void excluirProduto(int idExcluir) {
        List<String> lines = new ArrayList<>();

        // Primeiro: Leitura
        try (BufferedReader reader = new BufferedReader(new FileReader(this.filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename))) {
            for (String line : lines) {
                String[] split = line.split(",");
                String id = split[0].toString();
                if (!(id.equals(String.valueOf(idExcluir)))) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void exibirEstoque() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void atualizarQuantidade(int idAtualizar, int novaQuantidade){
        List<String> lines = new ArrayList<>();

        // Primeiro: Leitura
        try (BufferedReader reader = new BufferedReader(new FileReader(this.filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename))) {
            for (String line : lines) {
                String[] split = line.split(",");
                String id = split[0].toString();
                String nome = split[1].toString();
                int quantidade = novaQuantidade;
                double preco = Double.valueOf(split[3].toString());

                if ((id.equals(String.valueOf(idAtualizar)))) {
                    Produto produto = new Produto(Integer.parseInt(id), nome, quantidade, preco);
                    String updatedLine = produto.toCsv();
                    writer.write(updatedLine);
                } else {
                    writer.write(line);
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}