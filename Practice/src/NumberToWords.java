public class NumberToWords {
    static void numberToWords(int number) {
        if (number < 0) {
            System.out.print("Invalid Value");
        }

        number = number * 10 +1;
        int reverse = 0;
        while (number > 9) {
            reverse += number % 10;
            number = number/10;
            reverse = reverse* 10;            
        }
        reverse = reverse + number;
        
        int lastDigit = 0;
        while (reverse > 9) {
            lastDigit = reverse % 10;
            reverse /= 10;
            String output =  switch (lastDigit) {
                case 1 -> "one ";
                case 2 -> "two ";
                case 3 -> "three ";
                case 4 -> "four ";
                case 5 -> "five ";
                case 6 -> "six ";
                case 7 -> "seven ";
                case 8 -> "eight ";
                case 9 -> "nine ";
                default -> "zero ";            
            };
            System.out.print(output);            
        }        
    }
    public static void main(String[] args) {
        numberToWords(Integer.MAX_VALUE/10);



        // folding paper 42 times
        Long m = 1L;
        for (int n = 1; n<=52; n++) {
            m *=2;
            System.out.println(n+ "  " + m);
        }
        System.out.println(m);
        
        System.out.println();
        Object[] mixedArray = new Object[3];
        mixedArray[0] = "Hello";
        mixedArray[1] = 42;
        mixedArray[2] = true;
        System.out.println(mixedArray);
        System.out.println(mixedArray[2]);

  


        int prime = 22;

        do {
            prime = 44;

        } while (false);

        System.out.println(prime);

    }
}
