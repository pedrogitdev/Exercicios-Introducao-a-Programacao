public class Uni05Exe03 {
    public static void main(String[] args) {
        double denominador = 0;
        double soma = 0;
        int num = 1;
        for (int contador = 0; contador < 100; contador++) {
            denominador++;
            soma += num / denominador;
        }
        System.out.printf("Soma dos primeiros 100 termos: %.2f", soma);
    }
}

// string %s
// float ou double %.0f
// inteiro %d
