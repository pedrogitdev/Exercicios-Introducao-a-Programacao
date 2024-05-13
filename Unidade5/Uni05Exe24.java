import java.util.Scanner;

public class Uni05Exe24 {
    public Uni05Exe24() {
        Scanner s = new Scanner(System.in);
        float peixe2 = 0;
        System.out.print("Escreva o limite de peso do dia: ");
        float limite = s.nextFloat();
        while (true) {
            System.out.println("Digite o peso do Peixe");
            float peixe = s.nextFloat();
            peixe2 += peixe;
            if (peixe2 < limite) {
                System.out.println("Você ainda não alcançou o limite!");
                System.out.println(peixe2 + " | " + limite);
            }
            if (peixe2 >= limite) {
                System.out.println("Você atingiu o limite!");
                break;
            }
            System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            String opcao = s.next();
            if (opcao.equalsIgnoreCase("n")) {
                System.out.println("Obrigado!");
                break;
            }
        }
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe24();
    }
}
