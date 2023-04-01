import java.util.HashSet;
import java.util.Set;

public class J0217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        /* by Amr Rimawi
         * Contact me on LinkedIn: https://www.linkedin.com/in/amr-rimawi/
         */

        Set<Integer> numsSet = new HashSet<>();
        for(int num: nums) numsSet.add(num);
        return numsSet.size() != nums.length;
    }
}
