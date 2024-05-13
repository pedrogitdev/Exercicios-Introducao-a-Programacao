import java.util.Scanner;

public class Uni05Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;

        do {
            do {
                System.out.print("Digite o dia do mês de abril (1 a 30): ");
                dia = scanner.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }
            } while (dia < 1 || dia > 30);

            System.out.print("Digite o total de peças produzidas no turno da manhã: ");
            int pecasManha = scanner.nextInt();

            System.out.print("Digite o total de peças produzidas no turno da tarde: ");
            int pecasTarde = scanner.nextInt();

            double valorRecebido = calcularValorRecebido(dia, pecasManha, pecasTarde);
            System.out.println("Valor recebido pelo funcionário: R$ " + valorRecebido);

            System.out.print("Novo funcionário (1.sim 2.não)? ");
        } while (scanner.nextInt() == 1);

        scanner.close();
    }

    public static double calcularValorRecebido(int dia, int pecasManha, int pecasTarde) {
        double valorPorPeca;
        if (dia <= 15) {
            if (pecasManha >= 30 && pecasTarde >= 30 && pecasManha + pecasTarde > 100) {
                valorPorPeca = 0.80;
            } else {
                valorPorPeca = 0.50;
            }
        } else {
            valorPorPeca = 0.40;
        }

        double valorManha = pecasManha * valorPorPeca;
        double valorTarde = pecasTarde * (dia <= 15 ? valorPorPeca : 0.30);

        return valorManha + valorTarde;
    }
}
