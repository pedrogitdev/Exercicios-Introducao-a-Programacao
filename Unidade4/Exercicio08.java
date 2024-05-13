import java.util.Scanner;

public class Exercicio08 {

    public Exercicio08(){
        Scanner letra = new Scanner(System.in);
        System.out.print("Digite a letra: ");
        String vogal = letra.nextLine();
        if (vogal.equals("a") || vogal.equals("e") || vogal.equals("i") || vogal.equals("o") || vogal.equals("u")) {
            System.out.println("É vogal");
          } else {
            System.out.println("Não é vogal");
          }
          letra.close();
    }
    public static void main(String[] args) {
        new Exercicio08();
    }
}
