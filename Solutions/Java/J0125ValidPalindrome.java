public class J0125ValidPalindrome {
    public boolean isPalindrome(String s) {

        /* by Amr Rimawi
         * Contact me on LinkedIn: https://www.linkedin.com/in/amr-rimawi/
         */

        int left = 0;
        int right = s.length() - 1;
        while(left <= right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar )) {
                left++;
            } else if(!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}
