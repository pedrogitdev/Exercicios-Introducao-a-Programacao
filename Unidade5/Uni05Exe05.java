import java.util.Scanner;

public class Uni05Exe05 {

    public Uni05Exe05() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int um = 8;
        int soma = 2;
        for (int i = 0; i < n; i++) {
            System.out.println(um);
            System.out.println(um + soma);
            um *= 2;
        }
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe05();
    }
}
