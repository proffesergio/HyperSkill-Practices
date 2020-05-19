import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        List<Integer> sequence = new ArrayList<>();

        while ((n = scanner.nextInt()) != 0) {
            sequence.add(n);
            if (n == 0)
                break;
        }
        AtomicBoolean output = new AtomicBoolean();
        if (sequence.size() < 2)
            output.set(true);
        else if (isSortedAsc(sequence) || isSortedDesc(sequence))
            output.set(true);
        else
            output.set(false);
        System.out.println(output);
/*        System.out.println(sequence);
        System.out.println("Checking if sorted ascending...");
        System.out.println(isSortedAsc(sequence));

        System.out.println("Checking if sorted descending...");
        System.out.println(isSortedDesc(sequence));

        System.out.println("Checking if it isn't sorted either way...");
        if (isSortedAsc(sequence) || isSortedDesc(sequence))
            System.out.println("Sorted [return: true]");
        else
            System.out.println("Not sorted [return: false]");*/

    }
    private static boolean isSortedAsc(List<Integer> integers) {
        boolean isSortedAsc = false;
        int size = integers.size();
        for (int i = 0; i < size - 1; i++) {
            if (integers.get(i + 1) - integers.get(i) >= 0)
                isSortedAsc = true;
            else
                return isSortedAsc = false;
        }
        return isSortedAsc;
    }

    private static boolean isSortedDesc(List<Integer> integerList) {
        boolean isSortedDesc = false;
        int size = integerList.size();
        for (int i = 0; i < size - 1; i++) {
            if (integerList.get(i) - integerList.get(i + 1) >= 0)
                isSortedDesc = true;
            else {
                isSortedDesc = false;
                break;
            }
        }
        return isSortedDesc;
    }
}