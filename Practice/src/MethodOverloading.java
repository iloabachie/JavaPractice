// Overloading can be used to set default values

public class MethodOverloading {
    public static int calculate() {
        System.out.println("just ran the first with no arguments.");
        return 22;
    }

    public static int calculate(int num) {
        System.out.println("just ran the second with one arguments." + num);
        if (num % 2 == 0) {
            return 33 * num;
        }
        return calculate(num, "Anonymous");
    }

    public static int calculate(int num, String name) {
        System.out.println("just ran the third with two arguments." + num + name);
        System.out.println(name + 33 + num);
        return num ^ 3;
    }

    // Area Calculator
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0d;
        }

        return Math.PI * Math.pow(radius, 2);

    }

    public static double area(double length, double breadth) {
        if (!(Math.abs(length) + Math.abs(breadth) == length + breadth)) {
            return -1.0d;

        }
        return length * breadth;

    }

    public static void main(String[] args) {
        int num = calculate();

        num = calculate(num);

        System.out.println(calculate(num, "sesan"));

        // Area Calculator

        System.out.println(area(34, 56));
        System.out.println(area(-34));
        System.out.println(area(-34, 63));

    }

}
