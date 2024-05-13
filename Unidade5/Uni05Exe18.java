import java.util.Scanner;

public class Uni05Exe18 {
    public Uni05Exe18() {
        Scanner s = new Scanner(System.in);
        float pessoas = 0;
        float pessoas2 = 0;
        float pessoas3 = 0;
        float pessoas4 = 0;
        double media1 = 0;
        double media2 = 0;
        double media3 = 0;
        double media4 = 0;
        while (true) {
            System.out.println("Digite o canal: (4,5,9,12)");
            int canal = s.nextInt();
            if (canal == 0) {
                break;
            }
            System.out.println("Quantas pessoas estavam assistindo: ");
            int view = s.nextInt();
            if (canal == 4) {
                pessoas += view;
            }
            if (canal == 5) {
                pessoas2 += view;
            }
            if (canal == 9) {
                pessoas3 += view;
            }
            if (canal == 12) {
                pessoas4 += view;
            }
            // fazer porcentual de cada
            float total = pessoas + pessoas2 + pessoas3 + pessoas4;
            if (pessoas > 0) {
                media1 = (pessoas / total) * 100;
            }
            if (pessoas2 > 0) {
                media2 = (pessoas2 / total) * 100;
            }
            if (pessoas3 > 0) {
                media3 = (pessoas3 / total) * 100;
            }
            if (pessoas4 > 0) {
                media4 = (pessoas4 / total) * 100;
            }
        }
        System.out.printf("A porcentagem de audiência do canal 4 é de: %.2f%%\n", media1);
        System.out.printf("A porcentagem de audiência do canal 5 é de: %.2f%%\n", media2);
        System.out.printf("A porcentagem de audiência do canal 9 é de: %.2f%%\n", media3);
        System.out.printf("A porcentagem de audiência do canal 12 é de: %.2f%%\n", media4);
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe18();
    }
}
