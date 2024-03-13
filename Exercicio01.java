package Unidade3;
//Uma imobiliaria vende apenas terrenos retangulares.
//Faça um programa para ler as dimensões de um terreno e depois exibit a área do terreno.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);
        System.out.print("Digite a comprimento (m): ");
        float comprimento = teste.nextFloat();
        System.out.print("Digite a largura (m): ");
        float largura = teste.nextFloat();
        double area = (largura * comprimento);
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("A área é de: "+formatador.format(area)+"m2");
        teste.close();
    }
}
