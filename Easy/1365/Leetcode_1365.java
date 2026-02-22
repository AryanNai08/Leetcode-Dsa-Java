public class Leetcode_1365 {
    
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int nums2[]=new int[nums.length];
    
        for(int i=0;i<nums.length;i++){
                int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }

            nums2[i]=count;
        }

        return nums2;
    }

    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        int result[] = smallerNumbersThanCurrent(nums); 
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
