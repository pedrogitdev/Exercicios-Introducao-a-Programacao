package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;
//Análise: Ok
//Entrada: comprimento, largura
//Processo: largura * comprimento
//Saída: "A área é de:" + area
//Teste: comprimento = 5, largura = 5, area = 25
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
