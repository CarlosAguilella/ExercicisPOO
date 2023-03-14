class Producte {
    String nom;
    int quantitat;

    public Producte(String nom, int quantitat) {
        this.nom = nom;
        this.quantitat = quantitat;
    }
    String mesQuantitat(Producte producte, Producte producte1){
        if (producte.quantitat>producte1.quantitat){
            return producte.nom + producte.quantitat;
        }else if(producte.quantitat==producte1.quantitat){

            return "mateixa quantitat";

        }else {

            return producte1.nom + producte1.quantitat;

        }

    }


}



public class Main {
    public static void main(String[] args) {

        Producte producte = new Producte("llet",23);
        Producte producte1= new Producte("cholek",12);

        String retur = producte.mesQuantitat(producte,producte1);
        System.out.println(retur);




    }
}