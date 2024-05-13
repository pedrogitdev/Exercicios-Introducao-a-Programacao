public class Uni05Exe22 {

    public Uni05Exe22() {
        int salarioinicial = 2000;
        double aumento = 0.015;
        double salariodepois = 0;
        int vez = 0;
        while (true) {
            salariodepois = salarioinicial * aumento;
            salarioinicial += salariodepois;
            aumento *= 2;
            vez++;
            if (vez == 28) {
                break;
            }
        }
        System.out.println("O salário depois de 28 anos será de: " + salarioinicial);

    }

    public static void main(String[] args) {
        new Uni05Exe22();
    }
}
