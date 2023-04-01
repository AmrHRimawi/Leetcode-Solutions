public class J0238ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        /* by Amr Rimawi
         * Contact me on LinkedIn: https://www.linkedin.com/in/amr-rimawi/
         */

        int ind0 = -1;
        for(int i=0; i<nums.length; i++) if(nums[i] == 0) ind0 = i;
        long prod = 1L;
        for(int i=0; i<nums.length; i++) if(i != ind0) prod *= nums[i];
        for(int i=0; i<nums.length; i++) nums[i] = (int) (ind0 == -1 ? prod/nums[i] : ind0 != i ? 0 : prod);
        return nums;
    }
}
