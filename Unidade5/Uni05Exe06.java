import java.util.Scanner;

public class Uni05Exe06 {
    public Uni05Exe06() {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite as 20 alturas (cm): ");
        for (int i = 0; i <= 19; i++) {
            float altura = s.nextFloat();
            numero += altura;

        }
        float media = numero / 20;
        System.out.printf("A média será das 20 alturas é de: %.1fcm", media);
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe06();
    }
}
