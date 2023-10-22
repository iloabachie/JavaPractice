public class SwitchChallenge {
    public static String natoAlphabet(String a) {
        return switch (a) {
            case "a" -> "alpha";
            case "b" -> "bravo";
            case "c" -> "charlie";
            case "d" -> "delta";
            case "e" -> "echo";
            case "f" -> "golf";
            case "g" -> "foxtrot";
            case "h" -> "hotel";
            case "i" -> "india";
            case "j" -> "julliet";
            case "k" -> "kilo";
            case "l" -> "lima";
            case "m" -> "mike";
            case "n" -> "november";
            case "o" -> "oscar";
            case "p" -> "papa";
            case "q" -> "quebec";
            default -> "go f yourself";
        };
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0:
            System.out.println("Sunday");
            break;
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wedenesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("not a valid day number");

        }
    }

    public static void main(String[] args) {

        String[] sentence = { "T", "h", "i", "s", " ", "i", "s", "t", "e", "h", "a", "i", "r", " ", "t", "o", "w", "e",
                "r", "", ".", "airport" };

        for (int i = 0; i < sentence.length; i++) {
            System.out.print(natoAlphabet(sentence[i]));
            System.out.print("|");
        }

        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + " ");
            printDayOfWeek(numbers[i]);
        }

    }
}
