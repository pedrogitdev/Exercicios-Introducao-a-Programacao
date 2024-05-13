import java.util.Scanner;

public class Exercicio21 {
    public Exercicio21(){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        float peso = s.nextFloat();
        System.out.print("Digite sua altura (Ex: 1,70): ");
        float altura = s.nextFloat();
        float altura2 = altura * altura;
        float imc = peso / altura2;
        if (imc < 18.5) {
            System.out.println("Seu imc é de: "+imc);
            System.out.println("Magreza");
        }
        if (imc > 18.5 && imc < 24.9) {
            System.out.println("Seu imc é de: "+imc);
            System.out.println("Saudável");
        }
        if (imc > 25 && imc < 29.9) {
            System.out.println("Seu imc é de: "+imc);
            System.out.println("Sobrepeso");
        }
        if (imc > 30 && imc < 34.9) {
            System.out.println("Seu imc é de: "+imc);
            System.out.println("Obesidade Grau I");
        }
        if (imc > 35 && imc < 39.9) {
            System.out.println("Seu imc é de: "+imc);
            System.out.println("Obesidade Grau II (severa)");
        }
        if (imc >= 40) {
            System.out.println("Seu imc é de: "+imc);
            System.out.println("Obesidade Grau III (mórbida)");
        }
        s.close();
    }
    public static void main(String[] args) {
        new Exercicio21();
    }
}
