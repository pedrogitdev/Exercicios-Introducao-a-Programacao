import java.util.Scanner;

public class Exercicio09 {

    public Exercicio09(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        float num1 = input.nextFloat();
        System.out.print("Digite o segundo número: ");
        float num2 = input.nextFloat();
        float resto = num1 % num2;
        if (resto == 0) {
            System.out.println("É multiplo");
        }
        else{
            System.out.println("Não é multiplo");
        }
        input.close();
        }
    public static void main(String[] args) {
        new Exercicio09();
    }
}
