package Unidade3;

import java.util.Scanner;

//Graus C para F
public class Exercicio11 {
    //Análise: Ok
    //Entrada: celsius
    //Processo: f = (9/5) * celsius + 32
    //Saída: f
    //Teste: Celsius = 30,, Fahrenheit = 62
    public static void main(String[] args) {
        Scanner graus = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        float celsius = graus.nextFloat();
        float f = (9/5) * celsius + 32;
        System.out.println(celsius +" Graus celsius em Fahrenheit é: "+f);
        graus.close();
    }
}
