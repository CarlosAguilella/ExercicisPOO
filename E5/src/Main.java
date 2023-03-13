import java.util.Scanner;

class E5{
    String texto ="";
    String uneix(String text1,String text2){
        if (text1.length()<text2.length()){
            texto = text1+text2;
            return texto;
        }
        texto = text2+text1;
        return texto;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E5 e5 = new E5();
        System.out.println("text1:");
        String text1 = scanner.next();
        System.out.println("text2:");
        String text2 = scanner.next();

        System.out.println(e5.uneix(text1,text2));
    }
}