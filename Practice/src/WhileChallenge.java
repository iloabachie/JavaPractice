public class WhileChallenge {
    public static boolean isEvenNumber(int number) {
        if (number%2 == 0) {
            return true;
        }
        return false;
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number >= 10) {
            sum += number%10;
            number/=10;
        }
        return sum + number;
        
    }

    public static void main(String[] args) {
        
        System.out.println(isEvenNumber(20));

        int num = 4;
        int count = 0;
        int sumOdd = 0;
        int sumEven = 0;

        while (num <= 300) {
            num++;
            if (!isEvenNumber(num)) {    
                sumOdd += num;            
                continue;                
            }
            System.out.println(num);  
            count++;
            sumEven+=num;
            if (count == 50) {
                break;
            }                      
        }
        System.out.println(sumEven +" "+ sumOdd);



        System.out.println(sumDigits(10002366));
        System.out.println(sumDigits(Integer.MAX_VALUE));


        //The do while statement


        boolean isOnline = false;
        int counter = 0;
        do {
            counter+=3;
            if (counter != 0) {
                isOnline = true;
            }
            if (counter % 23 == 8) {
                isOnline = false;
            }
            System.out.println(counter);
        } while (isOnline);

        final int me = 23;

        String smaller = (1 <= 4) ? "a" : "b";
        


    }
}
