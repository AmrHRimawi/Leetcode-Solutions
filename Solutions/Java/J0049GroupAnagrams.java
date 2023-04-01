import java.util.*;

public class J0049GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        /* by Amr Rimawi
         * Contact me on LinkedIn: https://www.linkedin.com/in/amr-rimawi/
         */

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedStr = new String(arr);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
