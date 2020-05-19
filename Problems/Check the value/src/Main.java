// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkNum = scanner.nextInt();
        boolean result;
        if(checkNum < 10) {
            result = true;
        }
        else result = false;
        System.out.println(result);
    }
}