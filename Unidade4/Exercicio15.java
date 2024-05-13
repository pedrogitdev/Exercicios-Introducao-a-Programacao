import java.util.Scanner;

public class Exercicio15 {
    public Exercicio15(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantos meses está na empresa: ");
        int mes = input.nextInt();
        if (mes <= 12) {
            System.out.println("Seu reajuste será de: 5%");
        }
        if (mes >= 13 && mes <= 48) {
            System.out.println("Seu reajuste será de 7%");
        }
        else{
            System.out.println("Você está a tempo demais");
        }
        input.close();
    }
    public static void main(String[] args) {
        new Exercicio15();
    }
}
