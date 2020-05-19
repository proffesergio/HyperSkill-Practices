// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n;
        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Size of n: ");
        n = scanner.nextInt();
        int elements[] = new int[n];
//        System.out.println("n elements: ");
        int i;
        for (i=0; i<n; i++) {
            elements[i] = scanner.nextInt();
        }

        for (i=0; i<n; i++) {

            if(elements[i] == 2) {
                countD++;
            }
            if(elements[i] == 3) {
                countC++;
            }
            if(elements[i] == 4) {
                countB++;
            }
            if(elements[i] == 5) {
                countA++;
            }
        }
        System.out.print(countD + " " + countC + " " + countB + " " + countA);
    }
}