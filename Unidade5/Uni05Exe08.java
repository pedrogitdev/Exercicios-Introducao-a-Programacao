import java.util.Scanner;

public class Uni05Exe08 {
    public Uni05Exe08() {
        int contador = 0;
        int contadorPositivos = 0;
        int media = 0;
        int menor = Integer.MAX_VALUE;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int numero = s.nextInt();
            if (numero >= 0) {
                contador += numero;
                contadorPositivos++;
            } else {
                menor = Math.min(menor, numero);
            }
        }
        if (contadorPositivos > 0) {
            media = contador / contadorPositivos;
        }
        System.out.println("A média dos números positivos é: " + media);
        if (menor != Integer.MAX_VALUE) {
            System.out.println("O menor valor negativo é: " + menor);
        } else {
            System.out.println("Nenhum número negativo foi inserido.");
        }
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe08();
    }
}
