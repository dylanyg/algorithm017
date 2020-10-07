class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // strs空,返回空ArrayList
        if (strs == null) {
            return new ArrayList();
        }
        // HashMap<String, ArrayList>
        Map<String, ArrayList> mp = new HashMap<String, ArrayList>();
        // 遍历
        for(String s:strs) {
            // -- 获取toCharArray()
            char[] chrs=s.toCharArray();
            // -- Array.sort(char[] chrs)
            Arrays.sort(chrs);
            // -- String.valueOf(char[] chrs)
            String key = String.valueOf(chrs);
            if (!mp.containsKey(key)) {
                mp.put(key, new ArrayList());
            }
            mp.get(key).add(s);
        }
        return new ArrayList(mp.values());
    }
}
