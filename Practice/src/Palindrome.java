public class Palindrome {

    int x = 25;
    static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        String reverse = "";
        String forward = "";
        while (number > 9) {
            reverse += number % 10;
            forward = number % 10 + forward;
            number /= 10;
        }
        reverse += number;
        forward = number + forward;

        return forward.equals(reverse);
    }

    public static boolean isPalindrome2(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int temp = number;

        while (temp > 9) {
            reverse += temp % 10;
            reverse *= 10;
            temp /= 10;
        }
        reverse += number;

        return number == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-2332));
        System.out.println(isPalindrome(-11));

        System.out.println(isPalindrome(707));

        System.out.println(isPalindrome(11212));

        Palindrome myObj = new Palindrome();
        System.out.println(myObj.isPalindrome(15651));

    }
}
