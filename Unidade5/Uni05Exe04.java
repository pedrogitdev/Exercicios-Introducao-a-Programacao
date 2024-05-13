public class Uni05Exe04 {

    public Uni05Exe04() {
        int numero = 3;
        int denominador = 2;
        int indice = 4;
        double soma = 0.0;

        for (int i = 0; i < 20; i++) {
            soma += (double) numero / denominador;
            numero += 2;
            denominador += indice;
            indice += 2;
        }
        System.out.printf("A soma será de: %.2f", soma);
    }

    public static void main(String[] args) {
        new Uni05Exe04();
    }
}