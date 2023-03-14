import java.util.Scanner;

class E9 {
    String lletraEnPosicio(String text, int posicio){
        if (posicio>=text.length()){
            return "error: text massa curt";
        }
        char lletra = text.charAt(posicio);
        return new String(Character.toString(lletra));
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E9 e9 = new E9();
        String text = scanner.next();
        int posicio = scanner.nextInt();
        System.out.println(e9.lletraEnPosicio(text,posicio));

    }
}