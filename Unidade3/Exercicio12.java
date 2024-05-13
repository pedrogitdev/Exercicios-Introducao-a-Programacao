package Unidade3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {
    //Análise: Ok
    //Entrada: nome, horas, dependentes
    //Processo: salario = (horas * 10) + (dependentes * 60)
    //Processo: descontoinss = salario * 0.05
    //Processo: descontosalario = salario * 0.085
    //Processo: salariodescontado = salario - (descontoinss + descontosalario)
    //Saída: nome, salariodescontado
    //Teste: horas = 10, dependentes = 1,, == 138,40
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.print("Qual seu nome: ");
        String nome  = dados.nextLine();
        System.out.print("Digite o número de horas trabalhadas:");
        float horas = dados.nextFloat();
        System.out.print("Digite o número de dependentes:");
        int dependentes = dados.nextInt();
        // 10 por hora, 60 por dependente
        //descontado 13.5%
        float salario = (horas * 10) + (dependentes * 60);
        double descontoinss = (salario * 0.05);
        double descontosalario = (salario * 0.085);
        double salariodescontado = (salario - (descontoinss + descontosalario));
        System.out.println("Olá "+nome+"!");
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("Seu salário será de: R$"+formatador.format(salariodescontado));
        dados.close();
    }
}
