import java.util.Scanner;

public class Exercicio22 {
    public Exercicio22(){
        Scanner s = new Scanner(System.in);
        System.out.println("1 - Ciência da Computação");
        System.out.println("2 - Licenciatura da Computação");
        System.out.println("3 - Sistemas de Informação");
        int escolha = s.nextInt();
        switch (escolha) {
            case 1:
            System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
            System.out.println("Licenciado em Computação");
            break;
            case 3:
            System.out.println("Bacharel em Sistemas de Informação");
            default:
            System.out.println("Escolha uma opção valida!");
                break;
        }
        s.close();
    }
    public static void main(String[] args) {
        new Exercicio22();
    }
}
