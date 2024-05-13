import java.util.Scanner;

public class Exercicio05 {

    public Exercicio05(){
        Scanner input = new Scanner(System.in);
        System.out.print("A cor é azul? [true/false]: ");
        boolean escolha = input.nextBoolean();
        if (escolha){
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }
        input.close();
    }

    public static void main(String[] args) {
        new Exercicio05();
    }
}
