import java.util.Scanner;

public class Exercicio27 {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int horaChegada, minChegada, horaPartida, minPartida;
       int tempoEstacionado, horasPagas;
       double precoTotal;
       System.out.println("Digite a hora e minuto de chegada (no formato hh mm):");
       horaChegada = sc.nextInt();
       minChegada = sc.nextInt();
       System.out.println("Digite a hora e minuto de partida (no formato hh mm):");
       horaPartida = sc.nextInt();
       minPartida = sc.nextInt();
       if(horaChegada < 0 || horaChegada > 23 || horaPartida < 0 || horaPartida > 23 ||

          minChegada < 0 || minChegada > 59 || minPartida < 0 || minPartida > 59 ||

          horaChegada > horaPartida || (horaChegada == horaPartida && minChegada >= minPartida)) {

           System.out.println("Dados inválidos.");
       }
       else {
           tempoEstacionado = ((horaPartida * 60 + minPartida) - (horaChegada * 60 + minChegada) + 29) / 30 * 30;
           horasPagas = tempoEstacionado / 60;
           switch(horasPagas) {
               case 0:
               case 1:
               case 2:
                   precoTotal = horasPagas * 5.0;
                   break;
               case 3:
               case 4:
                   precoTotal = 2 * 5.0 + (horasPagas - 2) * 7.5;
                   
                   break;
               default:
                   precoTotal = 2 * 5.0 + 2 * 7.5 + (horasPagas - 4) * 10.0;
                   break;
           }
           System.out.println("Tempo estacionado: " + tempoEstacionado + " minutos");
           System.out.printf("Preço total: R$ %.2f", precoTotal);
       }
       sc.close();
   }

}