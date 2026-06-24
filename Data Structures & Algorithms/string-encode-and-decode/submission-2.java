class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(); 
        for(int i = 0; i< strs.size(); i++){
            sb.append(strs.get(i).length()).append("#").append(strs.get(i));
        }

        String encode = new String(sb);
        return encode;
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int L = 0;

        while ( L < str.length()){
            int j = L;
            while (str.charAt(j)!= '#'){
                j++;  
            }
            int length = Integer.parseInt(str.substring(L, j));
            L = j+1;
            j = L+ length;
            result.add(str.substring(L,j));
            L =j;

        }
        
        return result;
            
            
        

        

    }
}
