import java.util.Scanner;

public class Uni05Exe16 {

    public Uni05Exe16() {
        Scanner s = new Scanner(System.in);
        int soma = 0;
        int vezes = 0;
        int mediam = 0;
        int mediaf = 0;
        int mediao = 0;
        while (true) {
            System.out.println("Digite sua altura: ");
            int altura = s.nextInt();
            if (altura == 0) {
                System.out.println("Você escolheu terminar o programa.");
                break;
            }
            System.out.println("Digite seu gênero: ('m','f','o')");
            String genero = s.next();
            if (genero.equalsIgnoreCase("m")) {
                soma += altura;
                vezes++;
                mediam = soma / vezes;
            }
            if (genero.equalsIgnoreCase("f")) {
                soma += altura;
                vezes++;
                mediaf = soma / vezes;
            }
            if (genero.equalsIgnoreCase("o")) {
                soma += altura;
                vezes++;
                mediao = soma / vezes;

            }
        }
        s.close();
        System.out.printf("A média de altura dos homens é de: %d\n", mediam);
        System.out.printf("A média de altura das mulheres é de: %d\n", mediaf);
        System.out.printf("A média de altura do gênero 'outros' é de: %d\n", mediao);
    }

    public static void main(String[] args) {
        new Uni05Exe16();
    }
}
