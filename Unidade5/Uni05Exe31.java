import java.util.Scanner;

public class Uni05Exe31 {
    public Uni05Exe31() {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        while (true) {
            if (numero % 2 == 0) {
                System.out.println(numero + " / 2");
                numero /= 2;
            }
            if (numero % 3 == 0) {
                System.out.println(numero + " | 3");
                numero /= 3;
            }
            if (numero % 5 == 0) {
                System.out.println(numero + " | 5");
                numero /= 5;
            }
            if (numero % 7 == 0) {
                System.out.println(numero + " | 7");
                numero /= 7;
            }
            if (numero == 1) {
                break;
            }
        }
        System.out.println(numero);
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe31();
    }
}
