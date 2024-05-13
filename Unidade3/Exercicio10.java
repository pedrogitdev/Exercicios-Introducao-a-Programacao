package Unidade3;
import java.text.DecimalFormat;
import java.util.Scanner;

// Calcular hipotenusa
// hipotenusa = cateto1** + cateto2**
public class Exercicio10 {
    //Análise: Ok
    //Entrada: cateto1, cateto2
    //Processo: cateto3 = cateto1 * cateto1
    //Processo: cateto4 = cateto2 * cateto2
    //Processo: hipotenusa = cateto3 + cateto4
    //Processo: hipotenusa2 = Math.sqrt(hipotenusa)
    //Saída: hipotenusa2
    //Teste: cateto1 = 5, cateto2 = 5,, hipotenusa2 = 7,07
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Comprimento do primeiro cateto: ");
        float cateto1 = input.nextFloat();
        System.out.print("Comprimento do segundo cateto: ");
        float cateto2 = input.nextFloat();
        float cateto3 = cateto1 * cateto1;
        float cateto4 = cateto2 * cateto2;
        float hipotenusa = cateto3 + cateto4;
        double hipotenusa2 = Math.sqrt(hipotenusa);
        DecimalFormat ftd = new DecimalFormat("0.00");
        System.out.println("A hipotenusa é de:"+ftd.format(hipotenusa2));
        input.close();
    }
}
