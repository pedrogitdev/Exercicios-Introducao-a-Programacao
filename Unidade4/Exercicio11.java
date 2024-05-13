import java.util.Scanner;

public class Exercicio11 {

    public Exercicio11(){
        Scanner input = new Scanner(System.in);
        System.out.print("Idade do primeiro: ");
        int ano1 = input.nextInt();
        System.out.print("Idade do segundo: ");
        int ano2 = input.nextInt();
        System.out.print("Idade do terceiro: ");
        int ano3 = input.nextInt();

        int idade1 = ano1 - 2024;
        int idade2 = ano2 - 2024;
        int idade3 = ano3 - 2024;

        if (idade1 == idade2 && idade2 == idade3) {
            System.out.println("Os irmãos são trigêmeos!");
        } else if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3) {
            System.out.println("Os irmãos são gêmeos!");
        } else {
            System.out.println("Os irmãos são apenas irmãos.");
        }
        input.close();
    }
    public static void main(String[] args) {
        new Exercicio11();
    }
}
