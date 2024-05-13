import java.util.Scanner;

public class Uni05Exe29 {
    public Uni05Exe29() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Digite quanto deseja sacar (ou 0 para sair): ");
            int valor = s.nextInt();
            if (valor == 0) {
                break;
            }
            int cedulas20 = valor / 20;
            valor %= 20;
            int cedulas10 = valor / 10;
            valor %= 10;
            int cedulas5 = valor / 5;
            valor %= 5;
            int cedulas2 = valor / 2;
            valor %= 2;
            int cedulas1 = valor;

            System.out.println("Notas de 20: " + cedulas20);
            System.out.println("Notas de 10: " + cedulas10);
            System.out.println("Notas de 5: " + cedulas5);
            System.out.println("Notas de 2: " + cedulas2);
            System.out.println("Notas de 1: " + cedulas1);
        }
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe29();
    }
}
