import java.util.Scanner;

public class Exercicio13 {
public Exercicio13(){
    Scanner input = new Scanner(System.in);
    int boas = 0;

    // Leitura das cartas
    System.out.print("Digite o valor da primeira carta (1-13): ");
    int carta1 = input.nextInt();
    System.out.print("Digite o valor da segunda carta (1-13): ");
    int carta2 = input.nextInt();
    System.out.print("Digite o valor da terceira carta (1-13): ");
    int carta3 = input.nextInt();

    // Contagem de boas cartas
    if (carta1 <= 3) {
        boas++;
    }
    if (carta2 <= 3) {
        boas++;
    }
    if (carta3 <= 3) {
        boas++;
    }

    // Impressão do resultado
    switch (boas) {
        case 1:
            System.out.println("TRUCO");
            break;
        case 2:
            System.out.println("SEIS");
            break;
        case 3:
            System.out.println("NOVE");
            break;
        default:
        System.out.println("Não pede nada");
    }
    input.close();
}
    public static void main(String[] args) {
        new Exercicio13();
    }
}
