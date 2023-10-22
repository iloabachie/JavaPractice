public class LoopingCode {

    public static double interest(double principal, double rate) {
        return principal * (rate / 100);
    }

    public static boolean isPrime(long wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int counter = -3; counter <= 10; counter++) {
            System.out.println(Math.pow(counter, 3));
        }

        double principal = 107_896;
        for (double rate = 3; rate <= 100; rate += 3) {
            if (rate % 13 == 0) {
                break;
            }
            System.out.println("for $" + principal + " at " + rate + "% the interest is $" + interest(principal, rate));
        }

        System.out.println(23 + " is " + ((isPrime(23)) ? "" : "NOT ") + "a prime number");
        System.out.println(17 + " is " + ((isPrime(17)) ? "" : "NOT ") + "a prime number");
        System.out.println(2 + " is " + ((isPrime(2)) ? "" : "NOT ") + "a prime number");
        System.out.println(3 + " is " + ((isPrime(3)) ? "" : "NOT ") + "a prime number");
        System.out.println(9 + " is " + ((isPrime(9)) ? "" : "NOT ") + "a prime number");

        int primeNumCounter = 0;
        for (int i = 0; i <= 10_000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
                primeNumCounter++;
                if (primeNumCounter == 65) {
                    break;
                }
            }
        }

        // another way to write the code above
        primeNumCounter = 0;
        for (int i = 0; i <= 10_000 && primeNumCounter < 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
                primeNumCounter++;

            }
        }
        System.out.println(isPrime(9123456787777L));

        // Sum 3 and 5 challenge. all in main method
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000 && count < 10; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("sum is " + sum);
    }
}
