import java.util.ArrayList;
import java.util.Scanner;

public class Uni05Exe30 {
    public Uni05Exe30() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial (N): ");
        int N = scanner.nextInt();

        System.out.print("Digite o decremento (K): ");
        int K = scanner.nextInt();

        System.out.print("Digite o tamanho da mochila (M): ");
        int M = scanner.nextInt();

        ArrayList<Integer> elementosColocados = new ArrayList<>();
        ArrayList<Integer> elementosForaMochila = new ArrayList<>();

        int somaEntrouMochila = 0;
        int somaNaoEntrouMochila = 0;

        int valorAtual = N;
        while (valorAtual > 0 && M > 0) {
            if (valorAtual <= M) {
                elementosColocados.add(valorAtual);
                somaEntrouMochila += valorAtual;
                M -= valorAtual;
            } else {
                elementosForaMochila.add(valorAtual);
                somaNaoEntrouMochila += valorAtual;
            }
            valorAtual -= K;
        }

        System.out.println("Elementos colocados na mochila: " + elementosColocados);
        System.out.println("Elementos que entraram na mochila: " + elementosColocados.size());
        System.out.println("Elementos que ficaram fora da mochila: " + elementosForaMochila);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaEntrouMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaNaoEntrouMochila);

        scanner.close();
    }

    public static void main(String[] args) {
        new Uni05Exe30();
    }
}
