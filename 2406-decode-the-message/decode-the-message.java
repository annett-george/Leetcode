class Solution {
    public String decodeMessage(String key, String message) {
        key=key.replace(" ","");
        HashMap<Character,Character> hm= new HashMap<>();
        char ch = 'a';
        for(int i=0; i<key.length(); i++){
            char c=key.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c,ch);
                ch++;
            }
        }
        StringBuilder str= new StringBuilder();
        for(int i=0; i<message.length(); i++){
            char c=message.charAt(i);
            if(Character.isLetter(c)){
                str.append(hm.get(c));
            }
            else{
                str.append(c);
            }
        }
        return str.toString();
    }
}