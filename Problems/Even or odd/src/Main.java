// Posted from EduTools plugin
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> n = new ArrayList<>();
        int input;
        while (true) {
            input = scanner.nextInt();
            if (input != 0)
                n.add(input);
            if (input == 0)
                break;
        }

        for (int i = 0; i < n.size(); i++) {
            if (n.get(i) % 2 == 0)
                System.out.println("even");
            else if (n.get(i) % 2 != 0)
                System.out.println("odd");
        }
    }
}