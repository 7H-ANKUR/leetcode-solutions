class Solution {
    public String mergeAlternately(String word1, String word2) {
        int max=Math.min(word1.length(),word2.length());


        String merged="";
        int i=0;
        for(;i<max;i++){
            merged+=word1.charAt(i);
            merged+=(word2.charAt(i));
        }
while(i<word1.length()){
merged+=word1.charAt(i);
i++;
}

while(i<word2.length()){
merged+=word2.charAt(i);
i++;
}

        return merged;
        
    }
}