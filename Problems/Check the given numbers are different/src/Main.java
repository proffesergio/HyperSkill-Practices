// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();*/
//        System.out.println(checkIfEqual(a, b, c));
        boolean b1 = true, b2 = true, b3 = true;
//        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;
        boolean result;
        if (b1 && b2)
            result = b1;
        else if (b2 || b3)
            result = b2;
        else
            result = b3;

        System.out.println(result);
    }
    public static boolean checkIfEqual(int a, int b, int c) {
//        return !((a^b)|(b^c));
//        if ((a ^ b) == (b ^ c))
        if ((a != b) && (b != c))
            return true;
        else
            return false;
    }
}