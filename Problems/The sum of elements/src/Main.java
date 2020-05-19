// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int elem;

        while (scanner.hasNext()) {
            elem = scanner.nextInt();
            if (elem == 0)
                break;
            sum += elem;
        }
        System.out.println(sum);
    }
}