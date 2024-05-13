import java.util.Scanner;

public class Exercicio18 {
    public Exercicio18(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do pagamento");
        float pagamento = input.nextFloat();
        System.out.print("Digite a data do vencimento: ");
        float datavenc = input.nextFloat();
        System.out.print("Digite a data do pagamento: ");
        float datapag = input.nextFloat();
        double resultado = datavenc - datapag;
        double resultado2 = resultado * 2;
        if (resultado >= 0) {
            System.out.println("Você pagou certo e receberá 10% de desconto!");
            float desconto10 = pagamento / 10;
            float resultadof = pagamento - desconto10;
            System.out.print("Com desconto o pagamento será de: "+resultadof);
        }
        if (resultado <= -1) {
            System.out.println("Você está em atraso!");
            double atraso = resultado2 / 100;
            double atraso2 = atraso * -1;
            double valor = pagamento * atraso2;
            double valor2 = valor + pagamento;
            System.out.println("Com o acréscimo seu pagamento aumentou para R$" +valor2);
        }
        input.close();
    }
    public static void main(String[] args) {
        new Exercicio18();
    }
}
