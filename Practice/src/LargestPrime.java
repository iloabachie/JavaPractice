public class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        boolean print = (number == Integer.MAX_VALUE) ? true : false;
        boolean print1 = false;
        
        int primeFactor = 0;
        for (int factor = 2; factor <= number; factor++) {
            while (number % factor == 0) {
                number /= factor;   
                primeFactor = factor;   
                print1 = true;          
            }
            
            if (print && print1) {
                System.out.println(primeFactor + " " + number + " " + factor);
            }
            if (factor == -2147483648) {
                break;
            }
        }
        return primeFactor;  
    }


    public static void main(String[] args) {
        // System.out.println(getLargestPrime(37));
        // System.out.println(getLargestPrime(31));
        // System.out.println(getLargestPrime(7));
        // System.out.println(getLargestPrime(21));
        // System.out.println(getLargestPrime(3127));
        // System.out.println(getLargestPrime(199));
        // System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime(Integer.MAX_VALUE-1));
        System.out.println(getLargestPrime(Integer.MAX_VALUE));
        // System.out.println(Integer.MAX_VALUE);
    }
}