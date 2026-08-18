class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int n = nums.length;

        
        for (int i = 0; i <= n - k; i++) {
          
            HashMap<Integer, Boolean> seenInCurrentSubarray = new HashMap<>();
            
            for (int j = i; j < i + k; j++) {
                if (!seenInCurrentSubarray.containsKey(nums[j])) {
                    seenInCurrentSubarray.put(nums[j], true);
                    frequencyMap.put(nums[j], frequencyMap.getOrDefault(nums[j], 0) + 1);
                }
            }
        }
        
        
        int result = -1;
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) {
                result = Math.max(result, key);
            }
        }
        
        return result;
    }
}