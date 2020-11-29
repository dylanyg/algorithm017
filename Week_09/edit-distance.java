class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        // 任意为空
        if (m*n==0) {
            return m+n;
        }
        int[][] dp=new int[m+1][n+1];
        // A单词对B空串
        for(int i=0;i<m+1;i++) {
            dp[i][0]=i;
        }

        // B单词对A空串
        for(int i=0;i<n+1;i++) {
            dp[0][i]=i;
        }
        for(int i=1;i<m+1;i++) {
            for(int j=1;j<n+1;j++) {
                int left = dp[i][j-1]+1;
                int down = dp[i-1][j]+1;
                int leftDown = dp[i-1][j-1];
                if (word1.charAt(i-1)!=word2.charAt(j-1)) {
                    leftDown+=1;
                }
                dp[i][j]=Math.min(left,Math.min(down, leftDown));
            }
        }
        return dp[m][n];
    }
}
