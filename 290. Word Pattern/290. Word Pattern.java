class Solution {
    public boolean wordPattern(String pattern, String s) {
       HashMap<String, Character> map = new HashMap<>();

       //check length 
       if(s.split(" ").length != pattern.length()){
           return false;
       }

       //convert pattern to an arraylist
       ArrayList<Character> list2 = new ArrayList<>();
       for(int i = 0; i < pattern.length(); i++){
           list2.add(pattern.charAt(i));
       }
       //System.out.println(list2);

       //mapping string(s -> key), character (pattern -> value)
       int j = 0;
       for (String val: s.split(" ")){
           //System.out.println("j is " + j + "key is " + val + "value is " + pattern.charAt(j));
           if(map.containsKey(val) == false && map.containsValue(pattern.charAt(j)) == false){
                map.put(val, pattern.charAt(j));
           }
           j++;
       }
      // System.out.println("map is " + map);

       //replace s string with map values
       //s(words) is key and pattern is value
       ArrayList<Character> list = new ArrayList<>();
       for (String val: s.split(" ")){
            list.add(map.get(val));
       }
       //System.out.println("main list is " + list);

       //check and return result
       return list.equals(list2);
           
    }
}
