import java.util.Scanner;

public class Uni05Exe01 {
    public Uni05Exe01() {
        Scanner s = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        for (int contador = 0; contador < 20; contador++) {
            int num = s.nextInt();
            if (num % 2 == 0) {
                par++;
                System.out.println(par);
                System.out.println(num + " É par");

            }
            if (num % 2 != 0) {
                impar++;
                System.out.println(impar);
                System.out.println(num + " É impar");
            }
        }
        s.close();
    }

    public static void main(String[] args) {
        new Uni05Exe01();
    }
}