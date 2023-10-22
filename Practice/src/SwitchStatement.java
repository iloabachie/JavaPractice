public class SwitchStatement {

    public static String switchMethod() {
        int[] switchValue = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println("\nthis is the enhanced switch statement in a method");
        for (int i = 0; i < switchValue.length; i++) {
            switch (switchValue[i]) {
                case 1 -> System.out.println("first case " + switchValue[i]);
                case 2 -> System.out.println("second case " + switchValue[i]);
                case 3 -> System.out.println("third case " + switchValue[i]);
                case 4, 5, 6 -> System.out.println("fourth fifth and sixth " + switchValue[i]);
                default -> System.out.println("this is the default " + switchValue[i]);
            }
        }
        return "hello";
    }
    // no need for break cos return breaks it
    public static String getQuarter(String month) {
        month = month.toUpperCase();
        switch (month) {
            case "JANUARY": case "FEBRUARY":
            return "Quarter 1";
            case "MARCH": case "APRIL":
            return "Quarter 2";
        }
        return "invalid month";
    }


    public static String getQuarterEnhanced(String month) {
        System.out.println("enhanced switch with code block added to  case");
        month = month.toUpperCase();
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield " -****Quarter 1";}
            case "APRIL", "MAY", "JUNE" -> " -****Quarter 2";
            case "JULY", "AUGUST", "SEPTEMBER" -> " -****Quarter 3";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> " -****Quarter 4";
            default -> {
                String response = "bad month " + month;  //code block added requiring yield
                yield response;
            }
        };    
    }

    public static String getQuarterEnhanced2(String month) {
        month = month.toUpperCase();
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> " -****Quarter 1";
            case "APRIL", "MAY", "JUNE" -> " -****Quarter 2";
            case "JULY", "AUGUST", "SEPTEMBER" -> " -****Quarter 3";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> " -****Quarter 4";
            default -> " -****invalid month";
        };
    }


    public static void main(String[] args) {
        int[] switchValue = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        for (int i = 0; i < switchValue.length; i++) {
            switch (switchValue[i]) {
                case 1:
                    System.out.println("first case " + switchValue[i]);
                    break;
                case 2:
                    System.out.println("second case " + switchValue[i]);
                    break;
                case 3:
                    System.out.println("third case " + switchValue[i]);
                    break;
                case 4: case 5: case 6:
                    System.out.println("fourth fifth and sixth " + switchValue[i]);
                    break;
                default:
                    System.out.println("this is the default " + switchValue[i]);
            }
        }

        System.out.println("\nthis is another switch statement");
        for (int i = 0; i < switchValue.length; i++) {
            switch (switchValue[i]) {
                case 1:
                    System.out.println("first case 1");
                    // break;
                case 2:
                    System.out.println("second case 2");
                    // break;
                case 3:
                    System.out.println("third case 3");
                    // break;
                case 4:
                case 5:
                case 6:
                    System.out.println("fourth fifth and sixth 456");
                default:
                    System.out.println("this is the default 7890");
            }
        }

        // Enhanced switch statement
        System.out.println("\nthis is the enhanced switch statement");
        for (int i = 0; i < switchValue.length; i++) {
            switch (switchValue[i]) {
                case 1 -> System.out.println("first case " + switchValue[i]);
                case 2 -> System.out.println("second case " + switchValue[i]);
                case 3 -> System.out.println("third case " + switchValue[i]);
                case 4, 5, 6 -> System.out.println("fourth fifth and sixth " + switchValue[i]);
                default -> System.out.println("this is the default " + switchValue[i]);
            }
        }
        switchMethod();
        System.out.println(getQuarter("january"));
        System.out.println(getQuarter("december"));
        System.out.println(getQuarterEnhanced2("january"));
        System.out.println(getQuarterEnhanced("decemberg"));


        String a = "bx";
        String testSwitch = switch (a) {
            case "a" -> {yield "alpha";}
            case "bx" -> "bravo";
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

        System.out.println("\n switch can be assigned to a vailable " + testSwitch);
    }

    
}
