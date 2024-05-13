public class Uni05Exe10 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 1;

        System.out.println("Os 10 primeiros números naturais com a propriedade são:");

        while (contador < 10) {
            int d1, d2, d3, d4, aux, soma1, soma2, y;

            d1 = numero % 10;
            aux = numero / 10;
            d2 = aux % 10;
            aux = aux / 10;
            d3 = aux % 10;
            d4 = aux / 10;

            soma1 = d2 * 10 + d1;
            soma2 = d4 * 10 + d3;
            y = soma1 + soma2;

            if (Math.pow(y, 2) == numero) {
                System.out.println(numero);
                contador++;
            }

            numero++;
        }
    }
}
