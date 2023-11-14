public class Main {
    public static void main(String[] args) {

        System.out.println("isPalindrome Tests");
        System.out.println(isPalindrome(-1221)); //true
        System.out.println(isPalindrome(707)); //true
        System.out.println(isPalindrome(11212)); //false

        System.out.println("-----------------------------------------------");

        System.out.println("numberToWords  Tests");
        System.out.println(numberToWords(123)); //"One Two Three"
        System.out.println(numberToWords(1010)); //"One Zero One Zero"
        System.out.println(numberToWords(-12)); //"Invalid Value"
        System.out.println("-----------------------------------------------");

        System.out.println("isPerfectNumber Tests");
        System.out.println(isPerfectNumber(6)); //true
        System.out.println(isPerfectNumber(28)); //true
        System.out.println(isPerfectNumber(5)); //false
        System.out.println(isPerfectNumber(-1)); // false
        System.out.println("-----------------------------------------------");
    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        String strNum = Integer.toString(num);

        for (int s = 0, e = strNum.length() - 1; s < e ; ++s, --e) {

            if(strNum.charAt(s) != strNum.charAt(e))
                return false;
        }

        return true;
    }

    public static String numberToWords(int num) {

        if ( num < 0 )
            return "Invalid Value";

        String[] wordsForNumbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
        "Eight", "Nine"};

        char[] arrCharNum = Integer.toString(num).toCharArray();
        StringBuilder retVal = new StringBuilder();

        for ( char ch : arrCharNum ) {
            int idx = Character.getNumericValue(ch);
            retVal.append(" ").append(wordsForNumbers[idx]);
        }

        return retVal.toString().trim();
    }

    public static boolean isPerfectNumber(int num) {

        if ( num < 0 )
            return false;

        int sum = 0;
        for ( int i = 1; i <= num / 2; ++i) {

            if ( num % i == 0) {
                sum += i;
                if(sum > num)
                    return false;
            }
        }

        return sum == num;
    }
}