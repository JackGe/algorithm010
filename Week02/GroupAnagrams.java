class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
           int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101};

            HashMap<Integer, List<String>> map  = new HashMap<>();
            for(String str: strs){
                int hashValue = 1;
                char[] chars =  str.toCharArray();
                for(char c: chars){
                    hashValue *= primes[c - 'a'];
                }
                if (map.containsKey(hashValue)){
                    map.get(hashValue).add(str);
                }else{
                    List<String> newStrList = new ArrayList<>();
                    newStrList.add(str);
                    map.put(hashValue, newStrList);
                }
            }
            return new ArrayList<>( map.values());

    }
}
