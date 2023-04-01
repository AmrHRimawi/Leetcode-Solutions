public class J0242ValidAnagram {
    public boolean isAnagram(String s, String t) {

        /* by Amr Rimawi
         * Contact me on LinkedIn: https://www.linkedin.com/in/amr-rimawi/
         */

        if(s.length() != t.length()) return false;
        int[] hash = new int[256];
        for(int i=0; i<s.length(); i++) hash[s.charAt(i)]++;
        for(int i=0; i<t.length(); i++) hash[t.charAt(i)]--;
        for(int i=0; i<256; i++) if(hash[i] != 0) return false;
        return true;
    }
}
