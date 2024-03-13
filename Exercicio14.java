package Unidade3;
import java.text.DecimalFormat;
import java.util.Scanner;
// Calcular velocidade média e litros de combustível
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual foi a distância percorrida: ");
        float distancia = input.nextFloat();
        System.out.print("Qual o tempo gasto em horas: ");
        float tempo = input.nextFloat();
        float velmedia = distancia / tempo;
        float litro = distancia / 12;
        DecimalFormat ftd = new DecimalFormat("0.00");
        System.out.println("A velocidade média foi de: "+velmedia+"Km/h usando "+ftd.format(litro)+" litros de combustível.");
        input.close();
    }
}
