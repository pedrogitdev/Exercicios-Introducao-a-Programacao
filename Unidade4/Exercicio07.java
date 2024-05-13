import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio07 {

    public Exercicio07(){
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com peso da carta (g): ");
        float peso = input.nextFloat();
        if (peso < 0.50) {
            System.out.println("Custo do selo: 0.45");            
        }
        else{
            double pesoextra = peso - 50;
            double qtadicional = (pesoextra / 20);
            double valorpagar = 0.45f + 0.45f * qtadicional;
            DecimalFormat ftd = new DecimalFormat("0.00");
            System.out.println("Custo do selo: "+ftd.format(valorpagar));
            input.close();
        }
    }
    public static void main(String[] args) {
        new Exercicio07();
    }
}
