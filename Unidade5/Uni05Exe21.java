public class Uni05Exe21 {

    public Uni05Exe21() {
        int chico = 150;
        int ze = 110;
        int ano = 0;
        while (true) {
            chico += 2;
            ze += 3;
            ano++;
            if (ze > chico) {
                break;
            }
        }
        System.out.printf("Demorará: %d anos.", ano);
    }

    public static void main(String[] args) {
        new Uni05Exe21();
    }
}
