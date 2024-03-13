package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

class Exercicio03 {

    public static void main(String[] args) {
        Scanner gas = new Scanner(System.in);
        System.out.print("Digite o valor do pagamento: R$");
        float valorgas = gas.nextFloat();
        System.out.print("Digite o valor do litro do combustível: R$");
        float precogas = gas.nextFloat();
        float numlitros = (valorgas / precogas);
        DecimalFormat ftd = new DecimalFormat("0.00");
        System.out.println("Você conseguirá abastecer "+ftd.format(numlitros)+" litros de gasolina");
        gas.close();
    }
}