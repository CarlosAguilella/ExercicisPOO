import java.util.Scanner;

class Producte {
    String nom;
    int quantitat;


    public Producte(String nom, int quantitat) {
        this.nom = nom;
        this.quantitat = quantitat;
    }

    Producte mesQuantitat(Producte altreProducte){

        if (this.quantitat > altreProducte.quantitat) {
            return this;
        } else {
            return altreProducte;
        }


    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomProducte1 = scanner.nextLine();
        int quantitat1= scanner.nextInt();

        String bbb= scanner.nextLine();

        String nomProducte2 = scanner.nextLine();
        int quantitat2= scanner.nextInt();

        Producte producte = new Producte(nomProducte1,quantitat1);
        Producte producte1 = new Producte(nomProducte2,quantitat2);

        Producte producteMesQuantitat = producte.mesQuantitat(producte1);
        System.out.println("El producte amb més quantitat és " + producteMesQuantitat.nom + " amb " + producteMesQuantitat.quantitat + " unitats.");

    }
}