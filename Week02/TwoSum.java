class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int secondValue = target - nums[i];
            Integer secondIndex = cache.get(secondValue);
            if (secondIndex != null && secondIndex >= 0 && secondIndex != i ){
                if (secondIndex > i ){
                    res[0] = i;
                    res[1] = secondIndex;
                }else{
                    res[0] = secondIndex;
                    res[1] = i;
                }

                return res;
            }
            cache.put(nums[i], i);
        }
       return res;
    }
}
