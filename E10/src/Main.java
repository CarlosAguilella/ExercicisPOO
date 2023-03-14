import java.util.Scanner;

class E10{
    String hyperlink(String url,String text){

        String resultat = "";
        resultat +="<a href=" ;
        resultat += url;
        resultat +=">";
        resultat += text;
        resultat += "</a>";
        return resultat;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E10 e10 = new E10();
        String url = scanner.next();
        String text = scanner.next();
        System.out.println(e10.hyperlink(url,text));
    }
}