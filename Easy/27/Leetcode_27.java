public class Leetcode_27 {

    static class Solution {

        public int removeElement(int[] nums, int val) {

            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[count] = nums[i];  // overwrite valid element
                    count++;
                }
            }

            return count;
        }
    }

 
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int newLength = obj.removeElement(nums, val);
        System.out.println("New length: " + newLength);
    }
}
