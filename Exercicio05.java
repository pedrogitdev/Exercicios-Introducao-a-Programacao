package Unidade3;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner granja = new Scanner(System.in);
        System.out.print("Digite o número de galinhas: ");
        int galinhas = granja.nextInt();
        int custo = galinhas * 11;
        System.out.println("Vai custar R$"+custo+" para colocar os chips em todas as galinhas.");
        granja.close();
    }
}
