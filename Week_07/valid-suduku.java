class Solution {
    /***
     * 盒子0~8使用行列表示公式(rows/3)*3+cols/3
     * (rows/3)*3 类似于分页
     */
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Integer>[] rows = new HashMap[9];
        HashMap<Integer,Integer>[] cols = new HashMap[9];
        HashMap<Integer,Integer>[] boxes = new HashMap[9];
        for(int i=0;i<9;i++) {
            rows[i]=new HashMap<Integer,Integer>();
            cols[i]=new HashMap<Integer,Integer>();
            boxes[i]=new HashMap<Integer,Integer>();
        }
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if (board[i][j]!='.') {
                    int num = (int)board[i][j];
                    int box_index = (i/3)*3+j/3; // rows/3*3+cols/3 => 0，1，2，3,4,5,6,7,8
                    rows[i].put(num, rows[i].getOrDefault(num, 0)+1);
                    cols[j].put(num, cols[j].getOrDefault(num, 0)+1);
                    boxes[box_index].put(num, boxes[box_index].getOrDefault(num, 0)+1);
                    if (rows[i].get(num)>1 || cols[j].get(num)>1 || boxes[box_index].get(num)>1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
