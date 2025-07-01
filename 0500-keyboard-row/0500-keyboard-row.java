class Solution {
    public String[] findWords(String[] words) {
        String[] keyboard= {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};
        ArrayList<String> retList=new ArrayList<String>();
        Set<Integer> temp = new HashSet<>();
        for(int i=0; i<words.length; i++) {
            for(int j=0; j<words[i].length(); j++) {
                if(keyboard[0].indexOf(words[i].charAt(j))!=-1)
                    temp.add(0);
                else if(keyboard[1].indexOf(words[i].charAt(j))!=-1)
                    temp.add(1);
                else temp.add(2);
            }
            if(temp.size()==1) {
                 retList.add(words[i]);
            }
            temp.clear();
        }
        String[] ret=retList.toArray(new String[0]);
        return ret;
    }
}