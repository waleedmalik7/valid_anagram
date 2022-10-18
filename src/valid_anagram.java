class Solution{
    public boolean isAnagram(String s, String t) {
        int alphabet[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            int a = s.charAt(i) - 'a';
            alphabet[a]++;
        }
        for(int i = 0; i < t.length(); i++){
            int a = t.charAt(i) - 'a';
            alphabet[a]--;
        }
        for(int x: alphabet){
            if(x != 0){
                return false;
            }
        }
        return true;

    }
}