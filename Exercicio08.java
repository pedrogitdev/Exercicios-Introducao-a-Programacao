package Unidade3;
import java.text.DecimalFormat;
import java.util.Scanner;
// Cotação Dólar 13/03/2024
// ---> 4.97 <---
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner dolar = new Scanner(System.in);
        System.out.print("Quantos dólares deseja trocar: ");
        float dolar2 = dolar.nextFloat();
        double real = dolar2 * 4.97;
        DecimalFormat ftd = new DecimalFormat("0.00");
        System.out.println("Você deve receber R$"+ftd.format(real));
        dolar.close();
    }
}
