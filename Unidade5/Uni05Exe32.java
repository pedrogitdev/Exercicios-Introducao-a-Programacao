import java.util.Scanner;

public class Uni05Exe32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o dia da semana em que começa o mês: ");
        int dia = s.nextInt();
        System.out.println("Quantos dias tem o mês: ");
        int dias = s.nextInt();
        int dias2 = dias + 1;
        if (dia == 1) {
            System.out.println("O mês começa em um domingo");
            for (int i = 1; i < dias2; i++) {
                System.out.print(i + " ");
            }
        }
        if (dia == 2) {
            System.out.println("O mês começa em uma Segunda");
            for (int i = 0; i < dias2; i++) {
                System.out.print(i + " ");
            }
        }
        if (dia == 3) {
            System.out.println("O mês começa em uma Terça");
            for (int i = 0; i < dias2; i++) {
                System.out.print(i + " ");
            }
        }
        if (dia == 4) {
            System.out.println("O mês começa em uma Quarta");
            for (int i = 0; i < dias2; i++) {
                System.out.print(i + " ");
            }
        }
        if (dia == 5) {
            System.out.println("O mês começa em uma Quinta");
            for (int i = 0; i < dias2; i++) {
                System.out.print(i + " ");
            }
        }
        if (dia == 6) {
            System.out.println("O mês começa em uma Sexta");
            for (int i = 0; i < dias2; i++) {
                System.out.print(i + " ");
            }
        }
        if (dia == 7) {
            System.out.println("O mês começa em um Sábado");
            for (int i = 0; i < dias2; i++) {
                System.out.print(i + " ");
            }
        }
        s.close();
    }
}
