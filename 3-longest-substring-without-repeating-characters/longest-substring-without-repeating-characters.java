class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int maxlength = 0;
        
        for(int i =0; i< n; i++){
            HashSet<Character> hash = new HashSet<>();

            for(int j = i; j < n; j++){
                char currString = s.charAt(j);

                if(hash.contains(currString)){
                    break;
                }
                hash.add(currString);
               int len = j - i +1;
                maxlength = Math.max(len, maxlength);
            }
            
        }
        return maxlength;
    }
}