package Unidade3;
import java.util.Scanner;

class Exercicio04 {
    //Análise: Ok
    //Entrada: nota1, nota2, nota3
    //Processo: (nota1f = nota1 * 5) , (nota2f = nota2 * 3), (nota3f = nota3 * 2)
    //Processo: media = (nota1f + nota2f + nota3f) / 10
    //Saída: media
    //Teste: (nota1 = 7, nota2 = 6, nota3 = 7) == 6.7
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nota1 = nota.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = nota.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = nota.nextFloat();
        float peso1 = nota1 * 5;
        float peso2 = nota2 * 3;
        float peso3 = nota3 * 2;
        float media = (peso1 + peso2 +peso3) / 10;
        System.out.println(media);
        nota.close();
    }
}