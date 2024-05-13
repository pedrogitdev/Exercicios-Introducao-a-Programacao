import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
    public Exercicio20(){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a nota da Prova 1: ");
        float nota1 = s.nextFloat();
        System.out.print("Digite a nota da Prova 2: ");
        float nota2 = s.nextFloat();
        System.out.print("Digite a nota da Prova 3: ");
        float nota3 = s.nextFloat();
        System.out.print("Digite a nota final dos exercícios: ");
        float notaex = s.nextFloat();
        float nota22 = nota2 * 2;
        float nota33 = nota3 * 3;
        float media = (nota1 + nota22 + nota33 + notaex) / 7;
        DecimalFormat ftd = new DecimalFormat("0.0");
        if (media >= 9) {
            System.out.println("A");
            System.out.println("Sua média é: "+ftd.format(media));
            System.out.println("Aprovado");
        }
        if (media >= 7.5 && media < 9) {
            System.out.println("B");
            System.out.println("Sua média é: "+ftd.format(media));
            System.out.println("Aprovado");
        }
        if (media >= 6 && media < 7.5) {
            System.out.println("C");
            System.out.println("Sua média é: "+ftd.format(media));
            System.out.println("Aprovado");
        }
        if (media >= 4 && media < 6) {
            System.out.println("D");
            System.out.println("Sua média é: "+ftd.format(media));
            System.out.println("Reprovado");
        }
        if (media < 4) {
            System.out.println("E");
            System.out.println("Sua média é: "+ftd.format(media));
            System.out.println("Reprovado");
        }
        s.close();
    }
    public static void main(String[] args) {
        new Exercicio20();
    }
}
