import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int dia, mes, ano;

            // Leitura da data
            System.out.print("Digite o dia: ");
            dia = input.nextInt();
            System.out.print("Digite o mês: ");
            mes = input.nextInt();
            System.out.print("Digite o ano: ");
            ano = input.nextInt();

            // Validação da data
            if (!dataValida(dia, mes, ano)) {
                System.out.println("Data inválida!");
                return;
            }

            // Exibição da data formatada
            System.out.println("Data válida: " + String.format("%02d/%02d/%04d", dia, mes, ano));
        } catch (Exception e) {
            System.out.println("Erro ao ler a data: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    private static boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int diasNoMes = 31;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasNoMes = 30;
        } else if (mes == 2) {
            if (eBissexto(ano)) {
                diasNoMes = 29;
            } else {
                diasNoMes = 28;
            }
        }

        return dia >= 1 && dia <= diasNoMes;
    }

    private static boolean eBissexto(int ano) {
        return (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0));
    }
}
