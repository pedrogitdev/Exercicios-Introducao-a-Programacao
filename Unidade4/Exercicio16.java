import java.util.Scanner;

public class Exercicio16 {
    public Exercicio16(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade dos 2 homens, e depois das 2 mulheres");
        int homem1 = input.nextInt();
        int homem2 = input.nextInt();
        int mulher1 = input.nextInt();
        int mulher2 = input.nextInt();
        int menoridadehomem = Math.min(homem1, homem2);
        int menoridademulher = Math.min(mulher1, mulher2);
        int produtosoma = menoridadehomem + menoridademulher;
        System.out.println("A soma das duas menores idades é:" +produtosoma);
        input.close();
    }
    public static void main(String[] args) {
        new Exercicio16();
    }
}
