import java.util.Scanner;

public class Exercicio02 {

    public Exercicio02(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = input.nextInt();
        int resto = numero % 2;
        if (resto != 0) {
            System.out.println(numero+" é um numero impar!");
        }
        if (resto == 0) {
            System.out.println(numero+" é um numero par!");
        }
        input.close();
    }
    public static void main(String[] args) {
        new Exercicio02();
    }
}
