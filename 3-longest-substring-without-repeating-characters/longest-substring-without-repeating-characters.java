class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int maxlength = 0;
        HashSet<Character> set = new HashSet<>();
        int l =0;
        int r = 0;

        while(r < n){
            char currChar = s.charAt(r);

            if(!set.contains(currChar)){
                set.add(currChar);
                int len = r-l+1;
                maxlength = Math.max(len, maxlength);
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        
        return maxlength;
    }
}