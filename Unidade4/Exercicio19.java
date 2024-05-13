import java.util.Scanner;

public class Exercicio19 {
    public Exercicio19(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os dois valores");
        float valor1 = s.nextFloat();
        float valor2 = s.nextFloat();
        if (valor1 + valor2 == 0) {
            System.out.println("0");
        }
        if (valor1 > 0 && valor2 > 0) {
            System.out.println("1");
        }
        if (valor1 > 0 && valor2 < 0) {
            System.out.println("2");
        }
        if (valor1 < 0 && valor2 < 0) {
            System.out.println("3");
        }
        if (valor1 < 0 && valor2 > 0) {
            System.out.println("4");
        }
        s.close();
    }
    public static void main(String[] args) {
        new Exercicio19();
    }
}