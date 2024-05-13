import java.util.Scanner;

public class Uni05Exe15 {

    public Uni05Exe15() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o nome do aluno (ou 'fim' para sair)");
            String nome = s.next();

            if (nome.equalsIgnoreCase("fim")) {
                System.out.println("Fim do Programa");
                System.out.println("Obrigado!");
                break;
            }
            System.out.print("Digite a primeira nota: ");
            float n1 = s.nextFloat();
            System.out.print("Digite a segunda nota: ");
            float n2 = s.nextFloat();
            float media = (n1 + n2) / 2;
            System.out.printf("A média do aluno %s é %.1f\n", nome, media);
        }
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe15();
    }
}
