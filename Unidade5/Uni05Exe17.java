import java.util.Scanner;

public class Uni05Exe17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInscricaoMaisAlto = 0;
        double alturaMaisAlto = 0;
        int numeroInscricaoMaisBaixo = 0;
        double alturaMaisBaixo = Double.MAX_VALUE;
        double somaAlturas = 0;
        int quantidadeAtletas = 0;

        while (true) {
            System.out.print("Digite o número de inscrição (0 para finalizar): ");
            int numeroInscricao = scanner.nextInt();
            if (numeroInscricao == 0) {
                break;
            }

            System.out.print("Digite a altura do atleta: ");
            double altura = scanner.nextDouble();
            if (altura > alturaMaisAlto) {
                numeroInscricaoMaisAlto = numeroInscricao;
                alturaMaisAlto = altura;
            }
            if (altura < alturaMaisBaixo) {
                numeroInscricaoMaisBaixo = numeroInscricao;
                alturaMaisBaixo = altura;
            }

            somaAlturas += altura;
            quantidadeAtletas++;
        }
        double alturaMedia = 0;
        if (quantidadeAtletas > 0) {
            alturaMedia = somaAlturas / quantidadeAtletas;
        }

        System.out.printf("\nAtleta mais alto: número de inscrição %d - altura %.2fm\n", numeroInscricaoMaisAlto,
                alturaMaisAlto);
        System.out.printf("Atleta mais baixo: número de inscrição %d - altura %.2fm\n", numeroInscricaoMaisBaixo,
                alturaMaisBaixo);
        if (quantidadeAtletas > 0) {
            System.out.printf("Altura média: %.2fm\n", alturaMedia);
        } else {
            System.out.println("Não há atletas cadastrados para calcular a média.");
        }
        scanner.close();
    }
}
