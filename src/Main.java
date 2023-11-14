public class Main {
    public static void main(String[] args) {

        System.out.println("isPalindrome Tests");
        System.out.println(isPalindrome(-1221)); //true
        System.out.println(isPalindrome(707)); //true
        System.out.println(isPalindrome(11212)); //false

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
}