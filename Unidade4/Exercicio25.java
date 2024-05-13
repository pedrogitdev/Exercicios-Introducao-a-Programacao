import java.util.Scanner;

public class Exercicio25 {
    public Exercicio25(){
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha uma opção:\r\n" + //
        "1 - Soma de dois números.\r\n" + //
        "2 - Diferença entre dois números.\r\n" + //
        "3 - Produto entre dois números.\r\n" + //
        "4 - Divisão entre dois números (o denominador não pode ser zero).");
        int escolha = s.nextInt();
        float num1 = s.nextFloat();
        float num2 = s.nextFloat();
        switch (escolha) {
            case 1:
                float soma = num1 + num2;
                System.out.println(soma);
                break;
            case 2:
                float diferenca = num1 - num2;
                System.out.println(diferenca);
                break;
            case 3: 
                float produto = num1 * num2;
                System.out.println(produto);
                break;
            case 4:
                float divisao = num1 / num2;
                System.out.println(divisao);
                break;
            default:
            System.out.println("Algo deu errado!");
                break;
        }
        s.close();
    }
    public static void main(String[] args) {
        new Exercicio25();
    }
}
