import java.util.Date;
import java.util.Scanner;

public class InputParsing {

    public static String getInputConsole() {
        String name = System.console().readLine("hi, what is your name? ");
        System.out.println(name);

        String dob = System.console().readLine("year of birth: ");
        return name + " " + dob;
    }

    


    // using the scanner instead

    public static String getInputScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hi whats your name?: ");
        String name = scanner.nextLine();

        System.out.println("what year u born: ");
        String dob = scanner.nextLine();


        return name + " " + dob;
    }
    public static void main(String[] args) {
        double number1 = Double.parseDouble("22.36");
        int number2 = Integer.parseInt("2365");
        long number3 = Long.parseLong("456");


        System.out.println(getInputConsole());

        try {
            long number4 = 2346345645634563L;
        } catch (Exception e) {
            System.out.println("caught the exception" + e);
        }

        getInputScanner();

        String message = "hello";
        // message.getBytes('l');
        Date today = new Date();
        today.getTime();
    }
}
