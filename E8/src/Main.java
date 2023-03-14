import java.util.Scanner;

class E8{
    String lletraEnPosicio(String text, int posicio){
        if (posicio>=text.length()){
            return "";
        }
        char lletra = text.charAt(posicio);
        return new String(Character.toString(lletra));
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E8 e8 = new E8();
        String text = scanner.next();
        int posicio = scanner.nextInt();
        System.out.println(e8.lletraEnPosicio(text,posicio));

    }
}