import java.util.Scanner;

public class Uni05Exe26 {
    public Uni05Exe26() {
        Scanner s = new Scanner(System.in);
        float valorrecusa = s.nextFloat();
        int naopagar = 0;
        int kms = 0;
        int trechos = 0;
        while (true) {
            System.out.print("Digite o valor do pedágio: ");
            float valorpedagio = s.nextFloat();
            if (valorpedagio < 0) {
                System.out.println("Trechos acima:" + naopagar);
                System.out.println("Total trechos: " + trechos);
                System.out.println("Trechos acima de 150km com preço aceitável: " + kms);
                break;
            }
            trechos++;
            System.out.print("Digite a KM: ");
            float km = s.nextFloat();
            if (valorpedagio > valorrecusa) {
                naopagar++;
            }
            if (km >= 150 && valorpedagio < valorrecusa) {
                kms++;
            }
        }
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe26();
    }
}
