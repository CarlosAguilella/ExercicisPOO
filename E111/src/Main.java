import java.util.Scanner;

class Targeta {
    String nomClient;
    int numTargeta, PIN, creditTotal, limitDiari, consumitDiari;


    public Targeta(String nomClient, int numTar, int PIN, int creditTotalDisponible, int limitCreditDiari, int limitCreditDiariConsumit) {
        this.nomClient = nomClient;
        this.numTargeta = numTar;
        this.PIN = PIN;
        this.creditTotal = creditTotalDisponible;
        this.limitDiari = limitCreditDiari;
        this.consumitDiari = limitCreditDiariConsumit;
    }

    int traureDiners(int quantitat, int PIN) {
        if (PIN != this.PIN) {
            return 1;
        } else if (quantitat > this.creditTotal) {
            return 2;
        } else if (quantitat > this.limitDiari - this.consumitDiari) {
            return 3;
        } else {
            this.creditTotal -= quantitat;
            this.consumitDiari += quantitat;
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Targeta targeta = new Targeta("Gerard", 123456789, 6969, 10000000, 500, 0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("cantitat");

        int retirada = scanner.nextInt();

        System.out.println("pin");

        int pin = scanner.nextInt();


        int retornar = targeta.traureDiners(retirada, pin);

        if (retornar == 1) {
            System.out.println("Mal el pin");
        } else if (retornar == 2) {
            System.out.println("No tens prou diners jefe");

        } else if (retornar == 3) {
            System.out.println("Limite superado crack");

        } else {
            System.out.println("Todo OK");
        }
    }
}
