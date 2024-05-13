import java.util.Scanner;

public class Exercicio10 {
    public Exercicio10(){
        Scanner input = new Scanner(System.in);
        System.out.print("A idade de Marquinhos: ");
        int marquinhos = input.nextInt();
        System.out.print("A idade de Zezinho: ");
        int zezinho = input.nextInt();
        System.out.print("A idade de Luluzinha: ");
        int luluzinha = input.nextInt();
        int menoridade = Math.min(marquinhos, Math.min(zezinho, luluzinha));
        if (menoridade == marquinhos) {
            System.out.println("O caçula é o marquinhos");
        }
        else if (menoridade == zezinho) {
            System.out.println("O caçula é o zezinho");
        }
        else{
            System.out.println("A caçula é a luluzinha");
        }
        input.close();
    }
    public static void main(String[] args) {
    new Exercicio10();        
    }
}
