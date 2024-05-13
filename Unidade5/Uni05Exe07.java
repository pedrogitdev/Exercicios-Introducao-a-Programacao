import java.util.Scanner;

public class Uni05Exe07 {
    public Uni05Exe07() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números a serem comparados: ");
        int n = scanner.nextInt();
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            double numero = scanner.nextDouble();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        scanner.close();
    }

    public static void main(String[] args) {
        new Uni05Exe07();
    }
}
