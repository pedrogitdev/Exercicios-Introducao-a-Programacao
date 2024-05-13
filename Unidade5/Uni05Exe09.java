import java.util.Scanner;

public class Uni05Exe09 {

    public Uni05Exe09() {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String armazem = "";
        int maisde20 = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Digite o nome:");
            String nome = s.next();
            System.out.println("Digite a idade:");
            int idade = s.nextInt();
            if (idade == 18) {
                armazem += nome + " / ";
            }
            if (idade >= 20) {
                maisde20 += 1;
            }
        }
        System.out.println("Os nomes dos alunos que possuem 18 anos são: " + armazem);
        System.out.println("O número de alunos comm mais de 20 anos são: " + maisde20);
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe09();
    }
}