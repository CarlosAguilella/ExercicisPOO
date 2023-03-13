import java.util.Scanner;

class E6{


    String converteixASetmanes(int dies){
        int s = dies/7;
        int d = dies%7;

        String resultat = "";


        if (s == 1){
           resultat += "1 setmana";
        } else if(s > 1){
            resultat += s + " setmanes";
        }

        if (s>0&&d>0) {
            resultat +=" i ";
        }

        if (d == 1){
            resultat += "1 dia";
        } else if (d > 1){
            resultat += d + " dies";
        }

        return resultat;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E6 e6 = new E6();
        int dies = scanner.nextInt();
        System.out.println(e6.converteixASetmanes(dies));
    }
}