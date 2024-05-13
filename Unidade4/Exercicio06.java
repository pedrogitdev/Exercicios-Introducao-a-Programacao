import java.util.Scanner;

public class Exercicio06 {

    public Exercicio06(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu gênero (M/F/I):");
        String genero = input.nextLine().toUpperCase();
        if(genero.equals("M")){
            System.out.println("Masculino");
        }
        else if(genero.equals("F")){
            System.out.println("Feminino");
        }
        else if(genero.equals("I")){
            System.out.println("Não informado");
        }
        else{
            System.out.println("entrada incorreta");
        }
        input.close();
        }
    public static void main(String[] args) {
        new Exercicio06();
    }
}
