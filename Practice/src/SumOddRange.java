public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        }
        return (number%2 != 0);
    }
    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0) {
            return -1;
        }
        int sumOdd = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOdd += i;
            }
            // System.out.println(i);
        }
        return sumOdd;        
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 11));
    }
}
