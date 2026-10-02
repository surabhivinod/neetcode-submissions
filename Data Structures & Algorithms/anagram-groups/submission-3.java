class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> groups = new HashMap<>();

        for(int i = 0; i< strs.length; i++){

            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);

            String key = new String(charArray);

            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
                
            }

            groups.get(key).add(strs[i]);
            
            
        }

        return new ArrayList<>(groups.values());
    }
}
