import java.util.HashSet;

public class Leetcode_217 {

    static class Solution {
        public boolean containsDuplicate(int[] nums) {

            HashSet<Integer> set = new HashSet<>();

            for (int num : nums) {
                
                if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }

            return false;
        }
    }

    // Optional main method for testing
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };

        System.out.println(obj.containsDuplicate(nums1)); 
        System.out.println(obj.containsDuplicate(nums2)); 
    }
}
