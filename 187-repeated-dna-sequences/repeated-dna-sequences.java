class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();

        int n = s.length();
        if(n <= 10){
            return ans;
        }

        Set<String> one = new HashSet<>();
        Set<String> two = new HashSet<>();

        for(int i = 0; i<= n-10; i++){
            String possibesequence = s.substring(i, i + 10);

            if(!one.add(possibesequence)){
                two.add(possibesequence);
            }

            
        }
        ans.addAll(two);
        return ans;
        
    }
}