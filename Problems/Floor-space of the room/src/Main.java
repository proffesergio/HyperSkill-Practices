import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String roomType = scanner.nextLine();

        double a, b, c, r;

        switch (roomType) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                System.out.println(calculateAreaOfTriangle(a, b, c));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(calculateAreaOfRectangle(a, b));
                break;
            case "circle":
                r = scanner.nextDouble();
                System.out.println(calculateAreaOfCicrle(r));
        }
    }

    //trying to calculate the area using Heron's formula
    public static double calculateAreaOfTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double calculateAreaOfRectangle(double a, double b) {
        return (a * b);
    }

    public static double calculateAreaOfCicrle(double r) {
        double PI = 3.14;
        return (PI * Math.pow(r, 2));
    }
}