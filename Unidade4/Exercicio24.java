import java.util.Scanner;

public class Exercicio24 {
    public Exercicio24(){
        Scanner s = new Scanner(System.in); 
        System.out.println("1 - Crescente");
        System.out.println("2 - Decrescente");
        System.out.println("3 - Maior no meio");
        int escolha = s.nextInt();
        System.out.println("Digite o primeiro número");
        int num1 = s.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = s.nextInt();
        System.out.println("Digite o terceiro número");
        int num3 = s.nextInt();
        switch (escolha) {
            case 1:
                if (num1 > num2 && num2 > num3) {
                    System.out.printf("A ordem crescente é %d,%d,%d",num3,num2,num1);
                }
                if (num2 > num1 && num1 > num3) {
                    System.out.printf("A ordem crescente é %d,%d,%d",num3,num1,num2);
                }
                if (num3 > num2 && num2 > num1) {
                    System.out.printf("A ordem crescente é %d,%d,%d",num1,num2,num3);
                }
                if (num1 > num3 && num3 > num2) {
                    System.out.printf("A ordem crescente é %d,%d,%d",num2,num3,num1);
                }
                if (num3 > num1 && num1 > num2) {
                    System.out.printf("A ordem crescente é %d,%d,%d",num2,num1,num3);
                }
                break;
            case 2:
            if (num1 > num2 && num2 > num3) {
                System.out.printf("A ordem decrescente é %d,%d,%d",num1,num2,num3);
            }
            if (num2 > num1 && num1 > num3) {
                System.out.printf("A ordem decrescente é %d,%d,%d",num2,num1,num3);
            }
            if (num3 > num2 && num2 > num1) {
                System.out.printf("A ordem decrescente é %d,%d,%d",num3,num2,num1);
            }
            if (num1 > num3 && num3 > num2) {
                System.out.printf("A ordem decrescente é %d,%d,%d",num1,num3,num2);
            }
            if (num3 > num1 && num1 > num2) {
                System.out.printf("A ordem decrescente é %d,%d,%d",num3,num1,num2);
            }
            break;
            case 3:
            if (num1 > num2 && num2 > num3) {
                System.out.printf("A ordem decrescente é %d,%d,%d",num3,num1,num2);
            }
            if (num2 > num1 && num1 > num3) {
                System.out.printf("A ordem decrescente é %d,%d,%d",num1,num2,num3);
            }
            if (num3 > num2 && num2 > num1) {
                System.out.printf("A ordem decrescente é %d,%d,%d",num2,num3,num1);
            }
            if (num1 > num3 && num3 > num2) {
                System.out.printf("A ordem decrescente é %d,%d,%d",num3,num1,num2);
            }
            if (num3 > num1 && num1 > num2) {
                System.out.printf("A ordem decrescente é %d,%d,%d",num1,num3,num2);
            }
            break;
            default:
            System.out.println("Algo deu errado!");
                break;
        }
        s.close();
    }
    public static void main(String[] args) {
        new Exercicio24();
    }
}
