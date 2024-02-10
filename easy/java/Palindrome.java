public class Palindrome {

    private static boolean isPalindrome(int num) {
        if (num < 0) return false;
        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) throws Exception {
        Assert.isTrue(isPalindrome(121));
    }
}