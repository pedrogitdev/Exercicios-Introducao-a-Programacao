public class Uni05Exe11 {
    public Uni05Exe11() {
        int biscoitos = 1;
        int totalbiscoito = 0;
        for (int i = 0; i < 15; i++) {
            biscoitos *= 3;
            totalbiscoito = biscoitos;
        }
        System.out.println(totalbiscoito);
    }

    public static void main(String[] args) {
        new Uni05Exe11();
    }
}
