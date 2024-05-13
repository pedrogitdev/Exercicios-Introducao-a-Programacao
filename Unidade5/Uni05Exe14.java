import java.util.Scanner;

public class Uni05Exe14 {

    public Uni05Exe14() {
        Scanner s = new Scanner(System.in);
        int menosde10 = 0;
        int entre10e20 = 0;
        int maisde20 = 0;
        int valorcompra = 0;
        int valorvenda = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o nome: ");
            String nome = s.next();
            System.out.println("Digite o preço da compra: ");
            float compra = s.nextFloat();
            System.out.println("Digite o preço de venda: ");
            float venda = s.nextFloat();
            float porcentual = (venda - compra) / compra * 100;
            if (porcentual < 10) {
                menosde10++;
                valorcompra += compra;
                valorvenda += venda;
            }
            if (porcentual >= 10 && porcentual <= 20) {
                entre10e20++;
                valorcompra += compra;
                valorvenda += venda;
            }
            if (porcentual > 20) {
                maisde20++;
                valorcompra += compra;
                valorvenda += venda;
            }
        }
        s.close();
        double lucrototal = valorvenda - valorcompra;
        System.out.println("===============================================");
        System.out.println("Mercadorias que dão lucro menor de 10%: " + menosde10);
        System.out.println("Mercadorias que dão lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Mercadorias que dão lucro acima de 20%: " + maisde20);
        System.out.println("===============================================");
        System.out.println("O valor total de compra será de: R$" + valorcompra);
        System.out.println("O valor total de venda será de: R$" + valorvenda);
        System.out.println("O lucro total será de: R$" + lucrototal);
        System.out.println("===============================================");
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe14();
    }
}
