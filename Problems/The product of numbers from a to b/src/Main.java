// Posted from EduTools plugin
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        int a, b, i;
        long result = 1;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
//        IntStream range = IntStream.range(a, b);  // a is inclusive, b is exclusive
        for (i = a; i < b; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}