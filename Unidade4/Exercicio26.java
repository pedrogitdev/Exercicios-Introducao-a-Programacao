import java.util.Scanner;

public class Exercicio26 {
    public Exercicio26(){
        Scanner input = new Scanner(System.in);
        System.out.println("T - calcular a área de um triângulo de base b e altura h");
        System.out.println("Q - calcular a área de um quadrado de lado l");
        System.out.println("R - calcular a área de um retângulo de base b e altura h");
        System.out.println("C - calcular a área de um círculo de raio r");
        String opcao = input.nextLine().toUpperCase();
        switch (opcao) {
            case "T":
                System.out.println("Digite a base e altura do triangulo:");
                float base = input.nextFloat();
                float altura = input.nextFloat();
                float areatriangulo = (base * altura) / 2;
                System.out.println("A área do triângulo ="+areatriangulo);
                break;
            case "Q":
                System.out.println("Digite o lado");
                float lado = input.nextFloat();
                float area = lado * lado;
                System.out.println("Área do quadrado = "+area);
                break;
            case "R":
                System.out.println("Digite a base e a altura do retângulo: ");
                float base2 = input.nextFloat();
                float altura2 = input.nextFloat();
                float area2 = base2 * altura2;
                System.out.println("Área do retângulo" +area2);
            case "C":
                System.out.println("Digite o raio: ");
                float raio = input.nextFloat();
                double area3 = raio * Math.PI * Math.pow(raio,2);
                System.out.println("Área do circulo: "+area3);
                break;
            default:
                System.out.println("Algo deu errado!");
                break;
        }
    input.close();
    }
    public static void main(String[] args) {
        new Exercicio26();
    }
}