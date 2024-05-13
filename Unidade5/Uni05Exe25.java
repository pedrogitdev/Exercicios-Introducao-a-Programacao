import java.util.Scanner;

public class Uni05Exe25 {

    public Uni05Exe25() {
        Scanner s = new Scanner(System.in);
        int d = 0;
        int e = 0;
        while (true) {
            System.out.println("Digite quem ganhará um ponto: (D) ou (E) ");
            String opcao = s.next();
            if (opcao.equalsIgnoreCase("d")) {
                d++;
                System.out.println(d + " | " + e);
            }
            if (opcao.equalsIgnoreCase("e")) {
                e++;
                System.out.println(d + " | " + e);
            }
            if (e == 21 && d <= 19) {
                System.out.println("O Jogador 'E' ganhou!");
                break;
            }
            if (d == 21 && e <= 19) {
                System.out.println("O Jogador 'D' ganhou!");
                break;
            }
            if (d > 21 && Math.abs(d - e) >= 2) {
                System.out.println("O Jogador 'D' ganhou!");
                break;
            }
            if (e > 21 && Math.abs(e - d) >= 2) {
                System.out.println("O Jogador 'E' ganhou!");
                break;
            }
        }
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe25();
    }
}
