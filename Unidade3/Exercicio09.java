package Unidade3;
import java.util.Scanner;
// Calcular volume de uma lata de óleo
// Volume = pi * raio2 *altura
public class Exercicio09 {
    //Análise: Ok
    //Entrada: raio, altura
    //Processo: raio2 = raio * raio
    //Processo: volume = 3.14 * raio2 * altura
    //Saída: volume
    //Teste: raio = 5, altura = 5 ,, volume = 392.5
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o raio: ");
    float raio = input.nextFloat();
    System.out.print("Digite a altura: ");
    float altura = input.nextFloat();
    float raio2 = raio * raio;
    double volume = 3.14 * raio2 * altura;
    System.out.println(volume);
    input.close();
    }
}
