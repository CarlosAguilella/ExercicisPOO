import java.util.ArrayList;

class Producte {
    String nom;
    int quantitat;
    public Producte(String nom, int quantitat) {
        this.nom = nom;
        this.quantitat = quantitat;
    }
    @Override
    public String toString() {
        return "Producte [nom=" + nom + ", quantitat=" + quantitat + "]";
    }
}
public class Main {
    public static void main(String[] args) {
        Producte producte1= new Producte("CPU ", 8);
        Producte producte2=new Producte("RAM",12);
        Producte producte3=new Producte("Grafica",11);
        Producte producte4=new Producte("Pantalla",1);

        ArrayList<Producte> listProducts = new ArrayList<Producte>();

        listProducts.add(producte1);
        listProducts.add(producte2);
        listProducts.add(producte3);

        for (int i = 0; i <listProducts.size() ; i++) {
            System.out.println(listProducts.get(i));

        }
        listProducts.forEach(producte -> System.out.println(producte));
        listProducts.remove(0);
        listProducts.add(listProducts.size()/2 , producte4);
        listProducts.clear();
    }
}