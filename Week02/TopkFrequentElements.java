class TopkFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i =0 ;i < nums.length; i++){
            frequencyMap.put(nums[i],frequencyMap.getOrDefault(nums[i],0)+1);
        }


        Queue<Integer> heap = new PriorityQueue<>(
            ((o1, o2) -> frequencyMap.get(o1) -frequencyMap.get(o2))
        );

        for(int num : frequencyMap.keySet()){
            heap.add(num);
            if(heap.size() > k) heap.poll();
        }
        int [] result = new int[heap.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = heap.poll();
        }
        return result;

    }
}
