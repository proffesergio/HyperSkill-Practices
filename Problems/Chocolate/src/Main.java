// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Width of the chocolate bar
        int M = scanner.nextInt();  // Height
        int K = scanner.nextInt();  // Number of pieces want to break
        String breakable = "YES";
        String nbreakable = "NO";

        if (K > N*M) {
            System.out.println(nbreakable);
        }
        else if ((K%N == 0) || (K%M == 0)) {
            System.out.println(breakable);
        }
        else System.out.println(nbreakable);
    }
}