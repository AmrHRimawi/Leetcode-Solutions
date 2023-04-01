import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class J0347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        /* by Amr Rimawi
         * Contact me on LinkedIn: https://www.linkedin.com/in/amr-rimawi/
         */

        return Arrays.stream(nums).boxed()

                // generate the frequency map
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

                // sort the map by most frequent
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))

                // trim by k and transform to keys array
                .limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}
