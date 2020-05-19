// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean result = true;
        if(a + b == 20 || b + c == 20 || c + a == 20) {
//            System.out.println(result);
            result = result;
        }
        else result = false;
        System.out.println(result);
    }
}