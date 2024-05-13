import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni05Exe13 {

    public Uni05Exe13() {
        DecimalFormat ftd = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de reabastecimentos: ");
        int totalReabastecimentos = scanner.nextInt();

        double somaQuilometragemPorLitro = 0;

        double quilometragemAnterior = 0;

        for (int i = 1; i <= totalReabastecimentos; i++) {
            System.out.println("Reabastecimento #" + i + ":");
            System.out.print("Digite o odômetro: ");
            double odometro = scanner.nextDouble();

            double quilometragemPercorrida;
            if (i == 1) {
                quilometragemPercorrida = odometro;
            } else {
                quilometragemPercorrida = odometro - quilometragemAnterior;
            }

            System.out.print("Digite a quantidade de combustível comprada (em litros): ");
            double quantidadeCombustivel = scanner.nextDouble();

            double quilometragemPorLitro = quilometragemPercorrida / quantidadeCombustivel;
            System.out.println("Quilometragem por litro: " + ftd.format(quilometragemPorLitro));

            somaQuilometragemPorLitro += quilometragemPorLitro;

            quilometragemAnterior = odometro;
        }

        double mediaQuilometragemPorLitro = somaQuilometragemPorLitro / totalReabastecimentos;
        System.out.println("Quilometragem média por litro em toda a viagem: " + ftd.format(mediaQuilometragemPorLitro));

        scanner.close();
    }

    public static void main(String[] args) {
        new Uni05Exe13();
    }
}
