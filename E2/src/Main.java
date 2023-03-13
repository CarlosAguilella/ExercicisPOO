import java.util.Scanner;

class E2{
    boolean teUnaArroba(String t){
        if (t.contains("@")){
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E2 e2 = new E2();

        String t = scanner.next();

        System.out.println(e2.teUnaArroba(t));
    }
}