import java.util.Scanner;

public class Exercicio04 {
    
    public Exercicio04(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num = input.nextFloat();
        boolean inteiro = num % 1 == 0;
        if (inteiro) {
            System.out.println("Não tem casas decimais");
        }
        else{
            System.out.println("Tem casas decimais");
        }
        input.close();
    }
    public static void main(String[] args) {
        new Exercicio04();
    }
}