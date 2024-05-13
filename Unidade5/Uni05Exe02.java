public class Uni05Exe02 {
    public Uni05Exe02() {
        int somaimpar = 0;
        int somapar = 0;
        for (int contador = 0; contador < 100; contador++) {
            if (contador % 2 == 0) {
                somapar += contador;

            } else {
                somaimpar += contador;
            }

        }
        System.out.println(somapar);
        System.out.println(somaimpar);
    }

    public static void main(String[] args) {
        new Uni05Exe02();
    }
}
