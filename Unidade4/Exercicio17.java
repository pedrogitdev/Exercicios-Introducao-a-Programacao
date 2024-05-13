import java.util.Scanner;

public class Exercicio17 {
    public Exercicio17(){
        //Imposto de Renda
        //Renda anual e número de dependentes
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua renda: ");
        float salario = input.nextFloat();
        System.out.print("Digite o número de dependentes: ");
        int dependentes = input.nextInt();
        double dependentes1 = dependentes * 2;
        double dependentes2 = (dependentes1 / 100);
        double desconto = salario * dependentes2;
        double salariofinal = salario - desconto;
        if (salario <= 2000) {
            System.out.println("Você não precisa paga imposto de renda");
        }
        if (salario >= 2000 && salario <= 5000) {
            System.out.println("Você terá um imposto de 5%");
            double salario5 = (salariofinal * 0.05);
            System.out.println("Você tem que pagar R$"+salario5);
        }
        if (salario >= 5000 && salario <= 10000) {
            System.out.println("Você terá um imposto de 10%");
            double salario10 = (salariofinal * 0.10);
            System.out.println("Você tem que pagar R$"+salario10);
        }
        else{
            System.out.println("Você terá um imposto de 15%");
            double salario15 = (salariofinal * 0.15);
            System.out.println("Você tem que pagar R$"+salario15);
        }
        input.close();
    }
    public static void main(String[] args) {
        new Exercicio17();
    }
}
