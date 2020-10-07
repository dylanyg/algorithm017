class Solution {
    public int nthUglyNumber(int n) {
        // 方案一： 穷举法

        // 方案二：递推
        int a=0, b=0, c=0;
        int[] dp=new int[n];
        dp[0] = 1;
        for(int i=1;i<n;i++) {
            int an = dp[a]*2;
            int bn = dp[b]*3;
            int cn = dp[c]*5;
            int cur = Math.min(Math.min(an, bn), cn);
            dp[i] = cur;
            if (an == cur) {
                a++;
            }
            if (bn == cur) {
                b++;
            }
            if (cn == cur) {
                c++;
            }
        }
        return dp[n-1];
    }
}
