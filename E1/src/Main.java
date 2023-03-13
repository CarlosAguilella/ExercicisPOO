import java.util.Scanner;

class E1 {
    int dimeSigno(int a){
        if (a>0){
            return 1;
        } else if(a<0){
            return -1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E1 e1 = new E1();

        int a = scanner.nextInt();
        System.out.println(e1.dimeSigno(a));

    }
}