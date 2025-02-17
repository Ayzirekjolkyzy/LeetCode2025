class Solution {
    public int maxNumberOfBalloons(String text) {
        int ret=0;
        int[] balloon= new int[5];
        char[] ch = text.toCharArray();
        for(int i=0; i<ch.length; i++) {
            if(ch[i]=='b') balloon[0]++;
            else if(ch[i]=='a') balloon[1]++;
            else if(ch[i]=='l') balloon[2]++;
            else if(ch[i]=='o') balloon[3]++;
            else if(ch[i]=='n') balloon[4]++;
        }
        balloon[2]/=2;
        balloon[3]/=2;
        Arrays.sort(balloon);
        return balloon[0];
       
        
    }
}