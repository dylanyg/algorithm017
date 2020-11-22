class Solution {
    private int toOneCount(int n) {
        int x=n;
        int count;
        for(count=0;x!=0;count++) {
            // 最低有效位清零
            x&=x-1;
        }
        return count;
    }
    public int[] countBits(int num) {
        int[] ret=new int[num+1];
        if (num==0) {
            return ret;
        }
        for(int i=0;i<=num;i++) {
            ret[i]=toOneCount(i);
        }
        return ret;
    }
}
