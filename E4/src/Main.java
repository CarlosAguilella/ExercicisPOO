import java.util.Scanner;

class E4{
    String repeteix(int num, String text){
        if (num>0){
            return text.repeat(num);
        }
        return "";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E4 e4 = new E4();
//        System.out.println("Hello world!".repeat(10));
        int num = scanner.nextInt();
        String text = scanner.next();
        System.out.println(e4.repeteix(num,text));
    }
}