import java.util.Scanner;
import java.util.Arrays;

public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");


        for (int i = 0; i < tamanhoArray; i++) {
            int number = Integer.parseInt(String.valueOf(i)) + 1;
            System.out.println("Digite o número "+ number +":");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }

        }
        System.out.println();
        System.out.println();

        System.out.println("Conteúdo do array:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Soma de todos os números: " + soma);
        System.out.println("Maior número no array: " + maiorNumero);

        scanner.close();
    }
}