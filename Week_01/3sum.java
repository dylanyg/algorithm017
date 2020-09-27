class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 关键：有序数组
        Arrays.sort(nums);
        List<List<Integer>> rs = new ArrayList<>();
        // 固定k遍历
        for(int k=0;k<nums.length-2;k++){
            if (nums[k]>0) {
                break;
            }
            if (k>0 && nums[k]==nums[k-1]) continue;
            int i = k+1;
            int j = nums.length-1;
            // 双指针向中间逼
            while(i<j) {
                int s = nums[i] + nums[j] + nums[k];
                if (s == 0) {
                    rs.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    // 当i满足后，与i重复元素也满足nums[i]==nums[++i]排重
                    while(i<j && nums[i]==nums[++i]);
                    // 当j满足后，与i重复元素也满足nums[j]==nums[++j]排重
                    while(i<j && nums[j]==nums[--j]);
                }
                if (s < 0) {
                    // 当i不满足时，与i重复元素也不满足nums[i]==nums[++i]
                    while(i<j && nums[i]==nums[++i]);
                }
                if (s > 0) {
                    // 当j不满足时，与j重复元素也不满足nums[j]==nums[++j]
                    while(i<j && nums[j]==nums[--j]);
                }
            }
        }
        return rs;
    }
}
