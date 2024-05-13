import java.util.Scanner;

public class Uni05Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas do Triângulo de Floyd: ");
        int n = scanner.nextInt();
        int count = 1;

        System.out.println("Triângulo de Floyd com " + n + " linhas:");

        for (int linha = 1; linha <= n; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
