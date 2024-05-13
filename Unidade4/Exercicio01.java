import java.util.Scanner;

public class Exercicio01 {

    public Exercicio01(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas: ");
        int numhoras = input.nextInt();
        System.out.print("Digite o valor por hora: ");
        float valorhora = input.nextInt();
        float salario1 = numhoras * valorhora;
        if (numhoras > 40) {
            float horasamais = numhoras - 40;
            double salariomais = (horasamais * valorhora) * 1.5;
            double salariofinal = salario1 + salariomais;
            System.out.println("Seu salário com horas extras será de:"+salariofinal);
        }
        if (numhoras <= 40){
            System.out.println("Seu salário será de"+salario1);
        }
        input.close();
    }

    public static void main(String[] args) {
        new Exercicio01();
    }
}