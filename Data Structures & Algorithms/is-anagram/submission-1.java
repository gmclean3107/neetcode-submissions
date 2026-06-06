class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> mapS = new HashMap<>();
        Map<String, Integer> mapT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i=0; i<s.length(); i++) {
            if (mapS.get(String.valueOf(s.charAt(i))) != null) {
                mapS.put(String.valueOf(s.charAt(i)), mapS.get(String.valueOf(s.charAt(i))+1));
            } else {
                mapS.put(String.valueOf(s.charAt(i)), 1);
            }

            if (mapT.get(String.valueOf(t.charAt(i))) != null) {
                mapT.put(String.valueOf(t.charAt(i)), mapT.get(String.valueOf(t.charAt(i))+1));
            } else {
                mapT.put(String.valueOf(t.charAt(i)), 1);
            }
        }
        
        return mapS.equals(mapT);
    }
}
