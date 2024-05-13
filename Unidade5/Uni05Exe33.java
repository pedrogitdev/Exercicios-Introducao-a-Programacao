import java.util.Scanner;

public class Uni05Exe33 {

    public Uni05Exe33() {
        Scanner scanner = new Scanner(System.in);

        int voto;
        int totalCandidato1 = 0, totalCandidato2 = 0, totalCandidato3 = 0, totalCandidato4 = 0;
        int totalNulos = 0, totalBrancos = 0, totalVotos = 0;

        System.out.println("Digite os votos (0 para terminar):");

        do {
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    totalCandidato1++;
                    totalVotos++;
                    break;
                case 2:
                    totalCandidato2++;
                    totalVotos++;
                    break;
                case 3:
                    totalCandidato3++;
                    totalVotos++;
                    break;
                case 4:
                    totalCandidato4++;
                    totalVotos++;
                    break;
                case 5:
                    totalNulos++;
                    totalVotos++;
                    break;
                case 6:
                    totalBrancos++;
                    totalVotos++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }
        } while (voto != 0);

        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + totalCandidato1);
        System.out.println("Candidato 2: " + totalCandidato2);
        System.out.println("Candidato 3: " + totalCandidato3);
        System.out.println("Candidato 4: " + totalCandidato4);
        System.out.println("Total de votos nulos: " + totalNulos);
        System.out.println("Total de votos em branco: " + totalBrancos);
        System.out
                .println("Percentual de votos nulos sobre o total: " + ((double) totalNulos / totalVotos * 100) + "%");
        System.out.println(
                "Percentual de votos em branco sobre o total: " + ((double) totalBrancos / totalVotos * 100) + "%");

        scanner.close();
    }

    public static void main(String[] args) {
        new Uni05Exe33();
    }
}
