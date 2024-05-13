import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Comprimento do lado 1: ");
        float lado1 = input.nextFloat();

        System.out.print("Comprimento do lado 2: ");
        float lado2 = input.nextFloat();

        System.out.print("Comprimento do lado 3: ");
        float lado3 = input.nextFloat();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            String tipoTriangulo = lado1 == lado2 && lado2 == lado3 ? "equilátero" : lado1 == lado2 || lado2 == lado3 || lado1 == lado3 ? "isósceles" : "escaleno";
            System.out.println("Triângulo " + tipoTriangulo + " com lados " + lado1 + ", " + lado2 + " e " + lado3);
        } else {
            System.out.println("Os valores não formam um triângulo");
        }

        input.close();
    }
}
