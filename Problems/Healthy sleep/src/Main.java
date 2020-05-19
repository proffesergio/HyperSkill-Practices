// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        int A = 8;
//        int B = 10;
//        int H = ;
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if(H < A) {
            System.out.println("Deficiency");
        }
        else if(H > B) {
            System.out.println("Excess");
        }
        else if(H >= A) {
            System.out.println("Normal");
        }
        else
            System.out.println("You need more or less sleep");

    }
}