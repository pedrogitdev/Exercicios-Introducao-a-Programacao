import java.util.Scanner;

public class Uni05Exe23 {
    public Uni05Exe23() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Digite seu nome: ");
            String nome = s.next();
            System.out.print("Quantas vendas: ");
            float vendas = s.nextFloat();
            System.out.print("Qual preço unitário: ");
            float preco = s.nextFloat();
            double totalvendas = vendas * preco;
            double salario = totalvendas * 0.30;
            System.out.println("Nome: " + nome);
            System.out.printf("Total em Vendas: R$%.2f\n", totalvendas);
            System.out.printf("Salário: R$%.2f\n", salario);
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            String opcao = s.next();
            if (opcao.equalsIgnoreCase("n")) {
                break;
            }
        }
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe23();
    }
}
