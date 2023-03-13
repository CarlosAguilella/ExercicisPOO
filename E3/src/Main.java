import java.util.Scanner;

class E3{
    int esMesGran(int a, int b){
        if (a>b){
            return -1;
        } else if (b>a) {
            return 1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E3 e3 = new E3();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(e3.esMesGran(a,b));
    }
}