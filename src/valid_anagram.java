import java.util.HashMap;

class Solution{
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> mapS = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            if(mapS.containsKey(s.charAt(i))){
                mapS.put(s.charAt(i), mapS.get(s.charAt(i)) + 1);
            }
            else{
                mapS.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(!mapS.containsKey(t.charAt(i))){
                return false;
            }else if(mapS.get(t.charAt(i)) == 1){
                mapS.remove(t.charAt(i));
            }else{
                mapS.put(t.charAt(i),mapS.get(t.charAt(i))-1);
            }
        }
        return mapS.size() == 0;
    }
}