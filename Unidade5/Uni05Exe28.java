import java.util.Scanner;

public class Uni05Exe28 {
    public Uni05Exe28() {
        Scanner m = new Scanner(System.in);
        float nenhum = 0;
        float CPM = 0;
        float Skank = 0;
        float jota = 0;
        float total = 0;

        while (true) {
            System.out.println("Escolha um para votar:");
            System.out.println("1 - Nenhum de Nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Quest");
            int numero = m.nextInt();
            total++;

            if (numero == 1) {
                nenhum++;
            } else if (numero == 2) {
                CPM++;
            } else if (numero == 3) {
                Skank++;
            } else if (numero == 4) {
                jota++;
            }

            System.out.print("Mais um Voto? (S ou N) ");
            String opcao = m.next();

            if (opcao.equalsIgnoreCase("N")) {
                break;
            }
        }

        double percentualNenhum = (nenhum / total) * 100;
        double percentualCPM = (CPM / total) * 100;
        double percentualSkank = (Skank / total) * 100;
        double percentualJota = (jota / total) * 100;

        if (nenhum > CPM && nenhum > Skank && nenhum > jota) {
            System.out.println("=====================");
            System.out.println("Vencedor: Nenhum");
            System.out.println("=====================");
        } else if (CPM > nenhum && CPM > Skank && CPM > jota) {
            System.out.println("=====================");
            System.out.println("Vencedor: CPM");
            System.out.println("=====================");
        } else if (Skank > nenhum && Skank > CPM && Skank > jota) {
            System.out.println("=====================");
            System.out.println("Vencedor: Skank");
            System.out.println("=====================");
        } else if (jota > nenhum && jota > CPM && jota > Skank) {
            System.out.println("=====================");
            System.out.println("Vencedor: Jota Quest");
            System.out.println("=====================");
        }

        System.out.println("Porcentagem de votos:");
        System.out.println("Nenhum: " + percentualNenhum + "%");
        System.out.println("CPM: " + percentualCPM + "%");
        System.out.println("Skank: " + percentualSkank + "%");
        System.out.println("Jota: " + percentualJota + "%");
        m.close();
    }

    public static void main(String[] args) {
        new Uni05Exe28();
    }
}
