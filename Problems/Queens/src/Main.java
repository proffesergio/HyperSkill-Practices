// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        String isHitting = "YES";
        String noHitting = "NO";


        if(x1 == x2 || y1 == y2) {
            System.out.println(isHitting);
        }
        else if(Math.abs(x1 -y1) == Math.abs(x2 - y2)) {
            System.out.println(isHitting);
        }
        else {
            System.out.println(noHitting);
        }
    }
}