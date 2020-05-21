class Solution {
    public String longestCommonPrefix(String[] strs) {
         int minLength = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(minLength > strs[i].length()){
                minLength = strs[i].length();
            }
        }
        
        String result = "";
        for(int j=0;j<minLength;j++){
            Map<Character, Integer> map = new HashMap<Character,Integer>();
            for(int i=0;i<strs.length; i++){
                if(map.containsKey(strs[i].charAt(j))){
                    int count = map.remove(strs[i].charAt(j));
                    map.put(strs[i].charAt(j), count+1);
                }
                else{
                    map.put(strs[i].charAt(j), 1);
                }
            }
            //System.out.println("map:" + map);
            int maxCount = Integer.MIN_VALUE;
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                char key = entry.getKey();
                int count = entry.getValue();
                if(count >= maxCount)
                    maxCount = count;
            }
            if(maxCount != strs.length){
                break;
            }
            else{
                result = result + strs[0].charAt(j);
            }
            //System.out.println("result:" + result);
        }
        //System.out.println("final result:" + result);
        return result;
    }
}
