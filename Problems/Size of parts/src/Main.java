// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] sizeOfParts = {0, 1, -1};
        int n, i;
        int readyToShip = 0;
        int toFixing = 0;
        int rejects = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] inputs = new int[n];

        for (i = 0; i < n; i++) {
            inputs[i] = scanner.nextInt();
        }
        for (i = 0; i < inputs.length; i++) {
            if (inputs[i] == sizeOfParts[0]) {
                readyToShip++;
            }
            if (inputs[i] == sizeOfParts[1]) {
                toFixing++;
            }
            if (inputs[i] == sizeOfParts[2]) {
                rejects++;
            }
        }
        System.out.print(readyToShip + " " + toFixing + " " + rejects);
    }
}