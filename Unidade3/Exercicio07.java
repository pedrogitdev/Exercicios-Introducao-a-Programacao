package Unidade3;
import java.util.Scanner;

public class Exercicio07 {
    //Análise: Ok
    //Entrada: latas, garrafas, garrafa2l
    //Processo: (mlLata = latas * 350), (mlgarrafa = garrafas * 600),(mlgarrafs2l = garrafa2l * 2000)
    //Processo: soma = (mlLata + mlgarrafa + mlgarrafa2l) / 1000
    //Saída: soma
    //Teste: (latas = 5, garrafas = 5, garrafas2l = 5) = 14.75
    public static void main(String[] args) {
        Scanner tamanhos = new Scanner(System.in);
        System.out.println("Fabrica de Refrigerantes!");
        //Número de latas de 350
        System.out.print("Quantas Lata de 350Ml: ");
        int lata = tamanhos.nextInt();
        //Número de Garrafas de 600
        System.out.print("Quantas Garrafas de 600Ml: ");
        int garrafa = tamanhos.nextInt();
        //Número de Garrafas 2l
        System.out.print("Quantas Garrafas de 2L: ");
        int garrafa2 = tamanhos.nextInt();
        System.out.println("Você escolheu "+lata+" latas de 350Ml, "+garrafa+" garrafas de 600Ml e "+garrafa2+" garrafas de 2L");
        float lata350 = (lata * 350);
        float garrafa600 = (garrafa * 600);
        float garrafa2l = (garrafa2 * 2000);
        float soma = (lata350 + garrafa600 + garrafa2l) / 1000;
        System.out.println("Você vai comprar "+soma+" Litros de refrigerante!");
        System.out.println("Volte Sempre!");
        tamanhos.close();
    }
}