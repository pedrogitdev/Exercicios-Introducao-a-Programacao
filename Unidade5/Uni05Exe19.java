import java.util.Scanner;

public class Uni05Exe19 {

    public Uni05Exe19() {
        Scanner s = new Scanner(System.in);
        double desconto = 0;
        int soma = 0;
        double valorfinal = 0;
        while (true) {
            System.out.println("Digite o valor da compra: ");
            float valor = s.nextFloat();
            if (valor == 0) {
                break;
            }
            if (valor > 500) {
                desconto = valor * 0.2;
                valorfinal = valor - desconto;
                System.out.println("Com desconto ficará: R$" + valorfinal);
                soma += valorfinal;
            }
            if (valor <= 500) {
                desconto = valor * 0.15;
                valorfinal = valor - desconto;
                System.out.println("Com desconto ficará R$" + valorfinal);
                soma += valorfinal;
            }
        }
        System.out.println("Ao final do dia a loja receberá um total de: R$" + soma);
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe19();
    }
}
