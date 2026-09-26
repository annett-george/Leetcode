class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> hm = new HashMap<>();
        for(int i=0; i<knowledge.size(); i++){
            hm.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                i++;
                StringBuilder temp = new StringBuilder();
                while(s.charAt(i)!=')'){
                    temp.append(s.charAt(i));
                    i++;
                }
                if(hm.containsKey(temp.toString())){
                    str.append(hm.get(temp.toString()));
                }
                else{
                    str.append("?");
                }
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}