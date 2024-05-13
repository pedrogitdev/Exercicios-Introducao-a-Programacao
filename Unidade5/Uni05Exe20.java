import java.util.Scanner;

public class Uni05Exe20 {

    public Uni05Exe20() {
        Scanner s = new Scanner(System.in);
        int tempo = 0;
        System.out.println("Digite a massa inicial: ");
        float massa = s.nextFloat();
        float massa3 = massa;
        while (true) {
            if (massa3 != 0.5) {
                massa3 /= 2;
                tempo += 50;
            }
            if (massa3 <= 0.5) {
                break;
            }
        }
        System.out.printf("Massa inicial: %.1f\n", massa);
        System.out.printf("Massa final : %.1f\n", massa3);
        System.out.printf("Para a massa se tornar menor que 0.5 demorará %d segundos.", tempo);
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe20();
    }
}
