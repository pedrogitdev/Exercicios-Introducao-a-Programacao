package Unidade3;
import java.util.Scanner;
    //Análise: Ok
    //Entrada: valorCompra, valorPago
    //Processo: troco = valorPago - valorCompra
    //Processo: notas100 = troco / 100
    //Processo troco %= 100
    //Processo: notas10 = troco / 10
    //Processo troco %= 10
    //Processo: notas1 = troco
    //Saída: notas100, notas10, notas1
    //Teste: (valorCompra = 400, valorPago = 500),, notas100 = 1, notas10 = 0, notas1 = 0
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        int valorCompra = scanner.nextInt();
        System.out.print("Digite o valor pago: ");
        int valorPago = scanner.nextInt();
        int troco = valorPago - valorCompra;
        System.out.println("Troco a ser fornecido: " + troco + " reais");
        int notas100 = troco / 100;
        troco %= 100;
        int notas10 = troco / 10;
        troco %= 10;
        int notas1 = troco;
        System.out.println("Número de notas de 100 reais: " + notas100);
        System.out.println("Número de notas de 10 reais: " + notas10);
        System.out.println("Número de notas de 1 real: " + notas1);
        scanner.close();
    }
}
