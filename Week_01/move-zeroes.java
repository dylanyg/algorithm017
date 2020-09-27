class Solution {
    public void moveZeroes(int[] nums) {
        int lastNoneZero = 0;
        // 非零元素排数组排头
        for(int i=0;i<nums.length;i++) {
            int cur = nums[i];
            if (cur!=0) {
                nums[lastNoneZero]=cur;
                lastNoneZero++;
            } else {
                continue;
            }
        }
        // 非零元素后面补零
        for(int i=lastNoneZero;i<nums.length;i++) {
            nums[i]=0;
        }
    }
}
