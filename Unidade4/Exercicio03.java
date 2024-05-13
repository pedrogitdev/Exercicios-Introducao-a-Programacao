import java.util.Scanner;

public class Exercicio03 {

    public Exercicio03(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        float num1 = input.nextFloat();
        System.out.print("Digite o segundo número: ");
        float num2 = input.nextFloat();
        if (num1 > num2) {
            System.out.println(num1+ " é maior");
        } 
        else{
            System.out.println(num2+ "é maior");
        }
        input.close();
    }
    public static void main(String[] args) {
        new Exercicio03();
    }
}
