class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        List<Integer> prefixSum = new ArrayList<>(n);

        //prefix sum list
        prefixSum.add(arr[0]);
        for (int i = 1; i < n; i++) {
            prefixSum.add(prefixSum.get(i - 1) + arr[i]);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < n; j++) {
            int currSum = prefixSum.get(j);

            // Case 1: Subarray from 0 to j
            if (currSum == k) {
                count++;
            }

            // Case 2: Subarray from i to j where i > 0
            int remaining = currSum - k;
            if (map.containsKey(remaining)) {
                count += map.get(remaining);
            }

            // Update frequency map
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
