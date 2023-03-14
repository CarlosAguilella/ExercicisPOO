class Producte {
    String nom;
    int quantitat;

    public Producte(String nom, int quantitat) {
        this.nom = nom;
        this.quantitat = quantitat;
    }
    String mesQuantitat(Producte producte, Producte producte1){
        if (producte.quantitat>producte1.quantitat){
            return producte.nom ;
        }else if(producte.quantitat==producte1.quantitat){

            return "mateixa quantitat";

        }else {

            return producte1.nom ;

        }

    }


}



public class Main {
    public static void main(String[] args) {

        Producte producte1 = new Producte("taula",123);
        Producte producte2= new Producte("cadira",1);

        String retur = producte2.mesQuantitat(producte2,producte2);
        System.out.println(retur);




    }
}