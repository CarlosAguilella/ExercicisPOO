import java.util.Scanner;

class E7{
    int[] converteixASetmanes(int dies){

        int s = dies/7;
        int d = dies%7;

        return new int[]{s,d};


    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E7 e7 = new E7();
        int dies = scanner.nextInt();
        int[] sd = e7.converteixASetmanes(dies);

        String resultat ="";
        resultat += "{";
        if (sd[0]>0){
            resultat += sd[0];
        } else if (sd[0]==0){
            resultat += 0;
        }
        resultat += ", ";
        if (sd[1]>0){
            resultat += sd[1];
        } else if (sd[1]==0) {
            resultat += 0;
        }
        resultat +="}";
        System.out.println(resultat);
    }
}