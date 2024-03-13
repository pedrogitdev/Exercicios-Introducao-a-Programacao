package Unidade3;
import java.text.DecimalFormat;
import java.util.Scanner;

//Uma loja de calçados está oferecendo 12% de desconto nos produtos.
//Escreva um programa que mostra qual o valor do desconto e o preço final.
public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Lojas de calçados do Pedro");
        Scanner preco = new Scanner(System.in);
        System.out.print("Qual o preço do par de sapatos: R$");
        float sapato = preco.nextFloat();
        double desconto = (sapato * 0.12);
        DecimalFormat ftd = new DecimalFormat("0.00");
        System.out.println("O desconto é de: R$"+ftd.format(desconto));
        double precofinal = (sapato - desconto);
        System.out.println("O preço final será de R$"+ftd.format(precofinal));
        preco.close();
    }
}
