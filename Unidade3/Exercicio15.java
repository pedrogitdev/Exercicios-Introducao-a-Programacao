package Unidade3;
import java.util.Scanner;
    //Análise: Ok
    //Entrada: numero
    //Processo: centenas = numero / 100
    //Processo: dezenas = (numero %100) / 10;
    //Processo: unidades = numero % 10;
    //Saída: centenas, dezenas, unidades
    //Teste: 532 = 5 Centenas, 3 Dezenas, 2 Unidades
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro de até 3 dígitos: ");
        int numero = scanner.nextInt();
        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;
        System.out.printf("%d centena(s) %d dezena(s) %d unidade(s)%n", centenas, dezenas, unidades);
        scanner.close();
    }
}
